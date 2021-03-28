/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser.nodes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.transform.Templates;
import main.Main;
import main.Utils;
import org.w3c.dom.Node;
import templates.objects.TemplatesEnumeration;
import templates.objects.TemplatesJavadoc;

/**
 *
 * @author Ivo
 */
public final class EnumerationNode extends SchemaNode {
  
  public TemplatesEnumeration attributedEnumeration;
  
  public EnumerationNode(Node node) {
    super(node);
    attributedEnumeration = Main.ctx.startEnumeration();
    attributedEnumeration.value = getThisAttrValue("value");
    traverse();
  }
  
  @Override
  public void traverse() {
    while(nextChildNode()){
      switch(getCurrentChildName()){
        case "annotation": 
          attributedEnumeration.javadoc = new TemplatesJavadoc(new JavadocNode(currentChild));
          break;
      }
    }
  }

  @Override
  public void finish() {
  }
  
}
