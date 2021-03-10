/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser.nodes;

import main.Main;
import org.w3c.dom.Node;
import templates.objects.TemplatesJavadoc;

/**
 * Traversa uma sequencia de campo dentro de um complex type
 * @author Ivo
 */
public final class FieldsSequenceNode extends SchemaNode {

  public FieldsSequenceNode(Node node) {
    super(node);
    traverse();
    finish();
  }

  @Override
  public void traverse() {
    while(nextNode()){
      switch(getCurrentChildName()){
        case "element": 
          new ElementNode(currentChild);
          break;
      }
    }
  }

  @Override
  public void finish() {
  }
  
}
