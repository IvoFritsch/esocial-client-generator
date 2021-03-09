/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templates.objects;

import java.util.Objects;
import main.Main;
import main.Utils;
import templates.TemplatesManager;

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

  public TemplatesJavadoc getJavadoc() {
    return javadoc;
  }

  @Override
  public String toString() {
    return TemplatesManager.process("field-declaration", this);
  }

  public void setType(String type) {
    this.type = Utils.convertType(type, true);
    if("xs:date".equals(type) || "xsd:date".equals(type)){
      isDate = true;
    }
    if(Objects.equals(this.type, type)) {
      this.type = type;
    }
  }

  
  public String getFullType() {
    if(Utils.isResolvedType(type) || fatherClass.hasChildClass(type)) return type;
    return "Tipos." + type;
  }

  public String getName() {
    return name;
  }
  
  public String getType() {
    return type;
  }
  
  public void resolveType() {
    TemplatesSimpleType resolved = Main.ctx.getSimpleTypeFromCatalog(type);
    if(resolved != null) {
      // Caso esse field não tem javadoc, copia o javadoc do simpleType correspondente
      if(this.javadoc == null){
        this.javadoc = resolved.javadoc;
      }
      type = resolved.resolveTypeAndGet();
    }
  }
  
  
}
