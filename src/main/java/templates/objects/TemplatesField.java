/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templates.objects;

import main.Utils;

/**
 *
 * @author Ivo
 */
public class TemplatesField {
  public TemplatesClass fatherClass;
  public TemplatesJavadoc javadoc;
  public String name;
  private String type;
  public boolean isDate = false;
  

  public void setJavadoc(TemplatesJavadoc jd) {
    javadoc = jd;
  }

  public String toString(int tabs) {
    StringBuilder sb = new StringBuilder();
    if(javadoc != null){
      sb.append(javadoc.toString(tabs));
    }
    Utils.appendTabulation(sb, tabs);
    sb.append(type);
    sb.append(" ");
    sb.append(name);
    sb.append("\n");
    return sb.toString();
  }

  public void setType(String type) {
    if("xs:date".equals(type)){
      type = "XMLGregorianCalendar";
      isDate = true;
    }
    this.type = type;
  }

  public String getType() {
    return type;
  }
  
  
}
