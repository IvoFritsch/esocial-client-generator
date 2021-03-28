/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templates.objects;

import java.util.ArrayList;
import java.util.List;
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
  private boolean isClassType;
  private TemplatesClass resolvedClassType;
  private TemplatesSimpleType resolvedSimpleType;
  
  public boolean isList;
  public int maxOccurs;
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
  
  public String getGetter() {
    return TemplatesManager.process("field-getter", this);
  }
  
  public String getSetter() {
    return TemplatesManager.process("field-setter", this);
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

  public boolean isIsList() {
    return isList;
  }

  public int getMaxOccurs() {
    return maxOccurs;
  }
  
  public String getFullType() {
    if(Utils.isResolvedType(type) || Main.ctx.classIsFromCurrentContext(type)) return type;
    
    String ret = "Tipos." + type;
    return ret;
  }

  public void setResolvedSimpleType(TemplatesSimpleType resolvedSimpleType) {
    this.resolvedSimpleType = resolvedSimpleType;
  }
  
  public boolean isIsEnumeration(){
    if(resolvedSimpleType == null) return false;
    return resolvedSimpleType.isEnumeration;
  }
  
  public List<TemplatesEnumeration> getEnumerations(){
    if(resolvedSimpleType == null) return new ArrayList<>();
    return resolvedSimpleType.enums;
  }
  
  public String getFullTypeWithList() {
    String ret = null;
    if(Utils.isResolvedType(type) || Main.ctx.classIsFromCurrentContext(type)) ret = type;
    if(ret == null) {
      ret = "Tipos." + type;
    }
    if(isList) {
      ret = "java.util.List<" + ret + ">";
    }
    return ret;
  }
  
  public String getBuilderFunctionReturnType() {
    return resolvedClassType.getFullGenericsPath(false);
  }

  public boolean isIsClassType() {
    return isClassType;
  }

  public String getName() {
    return name;
  }
  
  public String getType() {
    return type;
  }

  public TemplatesClass getFatherClass() {
    return fatherClass;
  }
  
  public void resolveType() {
    TemplatesSimpleType resolved = Main.ctx.getSimpleTypeFromCatalog(type);
    //System.out.println(name + "  " + type);
    if(resolved != null) {
      resolvedSimpleType = resolved;
      // Caso esse field não tem javadoc, copia o javadoc do simpleType correspondente
      if(this.javadoc == null){
        this.javadoc = resolved.javadoc;
      }
      type = resolved.resolveTypeAndGet();
    }
    // Caso não resolveu em um simple type, é uma classe, faz um switch de javadocs, se necessário
    if(resolved == null) {
      TemplatesClass classFromCatalog = Main.ctx.getClassFromCatalog(type);
      if(classFromCatalog != null) {
        isClassType = true;
        resolvedClassType = classFromCatalog;
        if(classFromCatalog.javadoc == null){
          classFromCatalog.javadoc = this.javadoc;
        }
        if(this.javadoc == null) {
          this.javadoc = classFromCatalog.javadoc;
        }
      }
    }
  }
  
  
}
