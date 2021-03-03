/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templates.objects;

import java.util.ArrayList;
import java.util.List;
import main.Utils;
import org.w3c.dom.Node;
import parser.nodes.JavadocNode;

/**
 * 
 * 
 * @author Ivo
 */
public class TemplatesJavadoc {
  
  public String title;
  public List<String> lines;

  public TemplatesJavadoc(JavadocNode n) {
    title = n.title;
    lines = n.lines;
  }

  public String toString(int tabs) {
    StringBuilder sb = new StringBuilder();
    Utils.appendTabulation(sb, tabs);
    sb.append("/*\n");
    Utils.appendTabulation(sb, tabs);
    sb.append(" * <b>");
    sb.append(title);
    sb.append("</b>\n");
    Utils.appendTabulation(sb, tabs);
    sb.append(" *\n");
    lines.forEach(l -> {
      Utils.appendTabulation(sb, tabs);
      sb.append(" * ");
      sb.append(l);
      sb.append("\n");
    });
    Utils.appendTabulation(sb, tabs);
    sb.append(" */\n");
    return sb.toString();
  }
}