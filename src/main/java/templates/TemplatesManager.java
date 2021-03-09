/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templates;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;
import java.io.File;
import java.io.StringWriter;

/**
 *
 * @author Ivo
 */
public class TemplatesManager {
  private static final Configuration cfg;
  
  static {
    cfg = new Configuration(Configuration.VERSION_2_3_29);
    try {
      cfg.setDirectoryForTemplateLoading(new File("templates/"));
    } catch (Exception ex) {
      throw new RuntimeException(ex);
    }
    cfg.setDefaultEncoding("UTF-8");
    cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
    cfg.setLogTemplateExceptions(false);
    cfg.setWrapUncheckedExceptions(true);
    cfg.setFallbackOnNullLoopVariable(false);
  }
  
  public static String process(String template, Object data) {
    try {
      if(!template.endsWith(".ftl")) template += ".ftl";
      Template t = cfg.getTemplate(template);
      StringWriter out = new StringWriter();
      t.process(data, out);
      return out.toString();
    } catch (Exception e){
      throw new RuntimeException(e);
    }
  }
  
}
