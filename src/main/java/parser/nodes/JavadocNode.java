/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser.nodes;

import java.util.ArrayList;
import java.util.List;
import main.Main;
import org.w3c.dom.Node;
import templates.objects.TemplatesJavadoc;

/**
 *
 * @author Ivo
 */
public final class JavadocNode extends SchemaNode {
  
  public String title;
  public List<String> lines = new ArrayList<>();
  public boolean isFieldNestedClass;
  
  public JavadocNode(Node node) {
    this(node, false);
  }
  
  public JavadocNode(Node node, boolean isFieldNestedClass) {
    super(node);
    this.isFieldNestedClass = isFieldNestedClass;
    traverse();
    finish();
  }
  
  @Override
  public void traverse() {
    while(nextChildNode()){
      if(currentChildNumber == 0) {
        title = currentChild.getTextContent();
      } else {
        String txt = currentChild.getTextContent();
        if(isFieldNestedClass) {
          txt = txt.replace("(../", "(./");
        }
        lines.add(txt);
      }
    }
  }

  @Override
  public void finish() {
  }

  @Override
  public String toString() {
    return "JavadocNode{" + "title=" + title + ", lines=" + lines + '}';
  }

  
  
}
