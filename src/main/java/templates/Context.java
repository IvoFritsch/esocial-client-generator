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
import java.util.Stack;
import templates.objects.TemplatesClass;
import templates.objects.TemplatesField;
import templates.objects.TemplatesSimpleType;

/**
 *
 * @author Ivo
 */
public class Context {
  private TemplatesClass rootClass;
  
  private final Stack<TemplatesClass> proccessingClasses = new Stack<>();
  private TemplatesSimpleType currentProccessingSimpleType;
  private final Stack<TemplatesField> proccessingFields = new Stack<>();
  
  private Map<String, TemplatesSimpleType> simpleTypesCatalog = new HashMap<>();
  private Map<String, TemplatesClass> allClassesCatalog = new HashMap<>();
  private final List<TemplatesSimpleType> unresolvedSimpleTypes = new ArrayList<>();
  private final List<TemplatesField> fieldsCatalog = new ArrayList<>();
  

  public Context(TemplatesClass rootClass) {
    this.rootClass = rootClass;
    proccessingClasses.push(rootClass);
    rootClass.isRootClass = true;
  }
  
  public TemplatesClass startClass() {
    TemplatesClass c = new TemplatesClass();
    addChildClass(c);
    proccessingClasses.push(c);
    return c;
  }
  
  public void addChildClass(TemplatesClass c) {
    c.fatherClass = getCurrentProccessingClass();
    c.fatherClass.addChildClass(c);
  }

  public TemplatesField getCurrentProccessingField() {
    try{
      return proccessingFields.peek();
    } catch (Exception e) {
      return null;
    }
  }
  
  public TemplatesClass getCurrentProccessingClass() {
    try {
      return proccessingClasses.peek();
    } catch (Exception e) {
      return null;
    }
  }
  
  public TemplatesField startField(){
    TemplatesField f = new TemplatesField();
    f.fatherClass = getCurrentProccessingClass();
    f.fatherClass.addField(f);
    proccessingFields.push(f);
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
    TemplatesClass currentProccessingClass = getCurrentProccessingClass();
    if(currentProccessingClass.name != null){
      allClassesCatalog.put(currentProccessingClass.name, currentProccessingClass);
    }
    proccessingClasses.pop();
  }
  
  public void finishField(){
    TemplatesField currentProccessingField = getCurrentProccessingField();
    if(currentProccessingField != null){
      fieldsCatalog.add(currentProccessingField);
    }
    proccessingFields.pop();
  }
  
  public void addUnresolvedSimpleType(TemplatesSimpleType st){
    unresolvedSimpleTypes.add(st);
  }
  
  public TemplatesSimpleType getSimpleTypeFromCatalog(String name){
    return simpleTypesCatalog.get(name);
  }
  
  public TemplatesClass getClassFromCatalog(String name){
    return allClassesCatalog.get(name);
  }
  
  public void finishResolvingAllTypes(){
    unresolvedSimpleTypes.forEach(TemplatesSimpleType::resolveTypeAndGet);
    fieldsCatalog.forEach(TemplatesField::resolveType);
  }
  
  public void importTypesFrom(Context ctx) {
    this.simpleTypesCatalog = ctx.simpleTypesCatalog;
    this.allClassesCatalog = ctx.allClassesCatalog;
    this.allClassesCatalog.values().forEach(c -> c.isFromThisContext = false);
  }

  public TemplatesClass getRootClass() {
    return rootClass;
  }
  
  public boolean classIsFromCurrentContext(String name) {
    TemplatesClass c = allClassesCatalog.get(name);
    return c.isFromThisContext;
  }

  public void transformESocialSubClassToRoot() {
    TemplatesClass mainESocialClass = rootClass.childClasses.stream().filter(c -> c.isMainESocialClass).findFirst().get();
    mainESocialClass.isRootClass = true;
    rootClass.childClasses.stream().filter(c -> c != mainESocialClass).forEach(c -> {
      c.fatherClass = mainESocialClass;
      mainESocialClass.addChildClass(c);
    });
    rootClass = mainESocialClass;
  }
  
}
