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
}
