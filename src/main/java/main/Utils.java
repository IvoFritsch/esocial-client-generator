/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Ivo
 */
public class Utils {
  
  public static String capFirst(String str){
    return str.substring(0, 1).toUpperCase() + str.substring(1);
  }
  
  public static void appendTabulation(StringBuilder sb, int tabs){
    for (int i = 0; i < tabs; i++) {
      sb.append("   ");
    }
  }
  
  public static String convertType(String type, boolean returnTypeOnDefault){
    if(type == null) return null;
    switch(type){
      case "xs:integer": 
      case "xsd:integer":
        return "Integer";
      case "xs:string":
      case "xsd:string":
        return "String";
      case "xs:byte":
      case "xsd:byte":
        return "String";
      case "xs:date":
      case "xsd:date":
        return "javax.xml.datatype.XMLGregorianCalendar";
      case "xs:decimal":
      case "xsd:decimal":
        return "Double";
      case "xs:ID":
      case "xsd:ID":
        return "String";
      default:
        return returnTypeOnDefault ? type : null;
        
    }
  }
  
  public static boolean isResolvedType(String type) {
    return "Integer".equals(type) ||
            "String".equals(type) ||
            "javax.xml.datatype.XMLGregorianCalendar".equals(type) ||
            "Double".equals(type) ||
            "Signature".equals(type);
            
  }
}
