/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templates.objects;

import java.util.ArrayList;
import java.util.List;
import main.Main;
import main.Utils;

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
    correspondingType = Utils.convertType(type, false);
    if(correspondingType == null){
      Main.ctx.addUnresolvedSimpleType(this);
    }
  }
  
  public String resolveTypeAndGet(){
    if(correspondingType != null) return correspondingType;
    TemplatesSimpleType st = Main.ctx.getSimpleTypeFromCatalog(rawType);
    if(st == null) {
      throw new RuntimeException(String.valueOf(this.name) + " -> incapaz de resolver o simpleType: " + rawType);
    }
    correspondingType = st.resolveTypeAndGet();
    if(fatherField != null) {
      fatherField.setType(correspondingType);
    }
    return correspondingType;
  }

  @Override
  public String toString() {
    return "TemplatesSimpleType{" + "name=" + name + ", rawType=" + rawType + ", correspondingType=" + correspondingType + ", isEnumeration=" + isEnumeration + '}';
  }
  
  
}
