/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templates;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import templates.objects.TemplatesClass;
import templates.objects.TemplatesField;
import templates.objects.TemplatesSimpleType;

/**
 *
 * @author Ivo
 */
public class Context {
  private final TemplatesClass rootClass;
  
  private TemplatesClass currentProccessingClass;
  private TemplatesSimpleType currentProccessingSimpleType;
  private TemplatesField currentProccessingField;
  
  private Map<String, TemplatesSimpleType> simpleTypesCatalog = new HashMap<>();
  private List<TemplatesSimpleType> unresolvedSimpleTypes = new ArrayList<>();
  private List<TemplatesField> fieldsCatalog = new ArrayList<>();
  

  public Context(TemplatesClass rootClass) {
    this.rootClass = rootClass;
    this.currentProccessingClass = rootClass;
    rootClass.isRootClass = true;
  }
  
  public TemplatesClass startClass() {
    TemplatesClass c = new TemplatesClass();
    addChildClass(c);
    currentProccessingClass = c;
    return c;
  }
  
  public void addChildClass(TemplatesClass c) {
    c.fatherClass = currentProccessingClass;
    currentProccessingClass.addChildClass(c);
  }

  public TemplatesField getCurrentProccessingField() {
    return currentProccessingField;
  }

  public TemplatesClass getCurrentProccessingClass() {
    return currentProccessingClass;
  }
  
  public TemplatesField startField(){
    TemplatesField f = new TemplatesField();
    f.fatherClass = currentProccessingClass;
    currentProccessingClass.addField(f);
    currentProccessingField = f;
    return f;
  }
  
  public TemplatesSimpleType startSimpleType(){
    TemplatesSimpleType t = new TemplatesSimpleType();
    currentProccessingSimpleType = t;
    return t;
  }
  
  public void finishSimpleType(){
    if(currentProccessingSimpleType.name != null){
      simpleTypesCatalog.put(currentProccessingSimpleType.name, currentProccessingSimpleType);
    }
    currentProccessingSimpleType = null;
  }
  
  public void finishClass(){
    currentProccessingClass = currentProccessingClass.fatherClass;
  }
  
  public void finishField(){
    if(currentProccessingField != null){
      fieldsCatalog.add(currentProccessingField);
    }
    currentProccessingField = null;
  }
  
  public void addUnresolvedSimpleType(TemplatesSimpleType st){
    unresolvedSimpleTypes.add(st);
  }
  
  public TemplatesSimpleType getSimpleTypeFromCatalog(String name){
    return simpleTypesCatalog.get(name);
  }
  
  public void finishResolvingAllTypes(){
    unresolvedSimpleTypes.forEach(TemplatesSimpleType::resolveTypeAndGet);
    fieldsCatalog.forEach(TemplatesField::resolveType);
  }
  
  public void importSimpleTypesFrom(Context ctx) {
    this.simpleTypesCatalog = ctx.simpleTypesCatalog;
  }

  public TemplatesClass getRootClass() {
    return rootClass;
  }
  
}
