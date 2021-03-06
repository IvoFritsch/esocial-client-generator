/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templates.objects;

import java.util.ArrayList;
import java.util.List;
import main.Utils;
import templates.TemplatesManager;

/**
 *
 * @author Ivo
 */
public class TemplatesClass {
  public String name;
  public boolean isMainESocialClass;
  public TemplatesClass fatherClass;
  public TemplatesJavadoc javadoc;
  public boolean isRootClass = false;
  public boolean isChoise = false;
  public List<TemplatesClass> childClasses = new ArrayList<>();
  public List<TemplatesField> fields = new ArrayList<>();
  public boolean isFromThisContext = true;

  public TemplatesClass() {
  }

  public TemplatesClass(String name) {
    this.name = name;
  }

  public List<TemplatesClass> getChildClasses() {
    return childClasses;
  }

  public List<TemplatesField> getFields() {
    return fields;
  }

  public TemplatesJavadoc getJavadoc() {
    if(javadoc != null) {
      javadoc.isReferringClassChoice = this.isChoise;
    }
    return javadoc;
  }

  public String getName() {
    return name;
  }

  public boolean isIsRootClass() {
    return isRootClass;
  }

  public String getFullGenericsPath(boolean endChain) {
    String ret = this.name;
    if(endChain) {
      if(fatherClass != null) ret += "<T>";
      return ret;
    }
    if(fatherClass != null) {
      ret = ret + "<"+fatherClass.getFullGenericsPath(true)+">";
    }
    return ret;
  }
  
  public boolean isIsMainESocialClass() {
    return isMainESocialClass;
  }
  
  public void addChildClass(TemplatesClass c){
    c.fatherClass = this;
    childClasses.add(c);
  }
  
  public void addField(TemplatesField f){
    f.fatherClass = this;
    fields.add(f);
  }

  public String getFullName() {
    return fatherClass == null ? this.name : fatherClass.getFullName() + "." + this.name;
  }
  
  public void setJavadoc(TemplatesJavadoc jd) {
    javadoc = jd;
  }
  
  public boolean hasChildClass(String name){
    if(name == null) return false;
    return childClasses.stream().anyMatch(c -> name.equals(c.name));
  }

  @Override
  public String toString() {
    return TemplatesManager.process("class", this);
  }
  
  
}
