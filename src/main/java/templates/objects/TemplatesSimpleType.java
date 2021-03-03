/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templates.objects;

import java.util.ArrayList;
import java.util.List;
import main.Main;

/**
 *
 * @author Ivo
 */
public class TemplatesSimpleType {
  
  public String name;
  public TemplatesJavadoc javadoc;
  public String rawType;
  public String correspondingType;
  public TemplatesField fatherField;
  public boolean isEnumeration;
  
  public List<TemplatesEnumeration> enums = new ArrayList<>();
  
  public void setType(String type){
    rawType = type;
    switch(type){
      case "xs:integer": 
        correspondingType = "Integer";
        break;
      case "xs:string":
        correspondingType = "String";
        break;
      case "xs:byte":
        correspondingType = "String";
      case "xs:date":
        correspondingType = "xs:date";
        break;
      default: 
        Main.ctx.addUnresolvedSimpleType(this);
        break;
    }
  }
  
  public String resolveTypeAndGet(){
    TemplatesSimpleType st = Main.ctx.getSimpleTypeFromCatalog(rawType);
    if(st == null) {
      throw new RuntimeException("Incapaz de resolver o simpleType: " + rawType);
    }
    correspondingType = st.resolveTypeAndGet();
    if(fatherField != null) {
      fatherField.setType(correspondingType);
    }
    return correspondingType;
  }
  
}
