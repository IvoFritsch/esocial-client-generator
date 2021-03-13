/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templates.objects;

import java.util.List;
import main.Utils;
import parser.nodes.JavadocNode;
import templates.TemplatesManager;

/**
 * 
 * 
 * @author Ivo
 */
public class TemplatesJavadoc {
  
  public String title;
  public List<String> lines;
  public boolean isReferringClassChoice = false;

  public TemplateOptions options = new TemplateOptions();
  
  public TemplatesJavadoc(JavadocNode n) {
    title = n.title;
    lines = n.lines;
  }

  public String getTitle() {
    return title;
  }

  public List<String> getLines() {
    return lines;
  }

  public boolean isIsReferringClassChoice() {
    return isReferringClassChoice;
  }
  
  @Override
  public String toString() {
    String ret = TemplatesManager.process("javadoc", this);
    options = new TemplateOptions();
    return ret;
  }
  
  public TemplatesJavadoc getOnlyTitle(){
    options.onlyTitle = true;
    return this;
  }
  
  public TemplatesJavadoc param(String param){
    options.param = param;
    return this;
  }
  
  public TemplatesJavadoc returns(String returns){
    options.returns = returns;
    return this;
  }

  public TemplateOptions getOptions() {
    return options;
  }
  
  public String toString(int tabs) {
    StringBuilder sb = new StringBuilder();
    Utils.appendTabulation(sb, tabs);
    sb.append("/**\n");
    Utils.appendTabulation(sb, tabs);
    sb.append(" * ");
    sb.append(title);
    sb.append("\n");
    Utils.appendTabulation(sb, tabs);
    sb.append(" *\n");
    lines.forEach(l -> {
      Utils.appendTabulation(sb, tabs);
      sb.append(" * ");
      sb.append("<p>");
      sb.append(l);
      sb.append("</p>");
      sb.append("\n");
    });
    Utils.appendTabulation(sb, tabs);
    sb.append(" */\n");
    return sb.toString();
  }

  public static class TemplateOptions {
    public boolean onlyTitle = false;
    public String param;
    public String returns;

    public String getParam() {
      return param;
    }

    public String getReturns() {
      return returns;
    }

    public boolean getOnlyTitle() {
      return onlyTitle;
    }
  }
}
