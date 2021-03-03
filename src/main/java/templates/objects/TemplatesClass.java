/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templates.objects;

import java.util.ArrayList;
import java.util.List;
import main.Utils;

/**
 *
 * @author Ivo
 */
public class TemplatesClass {
  public String name;
  public TemplatesClass fatherClass;
  public TemplatesJavadoc javadoc;
  public List<TemplatesClass> childClasses = new ArrayList<>();
  public List<TemplatesField> fields = new ArrayList<>();

  public TemplatesClass() {
  }

  public TemplatesClass(String name) {
    this.name = name;
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

  public String toString(int tabs) {
    StringBuilder sb = new StringBuilder();
    if(javadoc != null){
      sb.append(javadoc.toString(tabs));
    }
    Utils.appendTabulation(sb, tabs);
    sb.append("class ").append(this.name).append(" {\n");
    fields.forEach(f -> {
      sb.append(f.toString(tabs + 1));
      sb.append("\n");
    });
    childClasses.forEach(c -> {
      sb.append(c.toString(tabs + 1));
      sb.append("\n");
    });
    Utils.appendTabulation(sb, tabs);
    sb.append("}\n");
    return sb.toString();
  }
}
