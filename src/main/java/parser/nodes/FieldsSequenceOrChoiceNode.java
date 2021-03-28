/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser.nodes;

import org.w3c.dom.Node;
import templates.objects.TemplatesClass;

/**
 * Traversa uma sequencia de campo dentro de um complex type
 * @author Ivo
 */
public final class FieldsSequenceOrChoiceNode extends SchemaNode {

  public TemplatesClass attributedClass;
  
  public FieldsSequenceOrChoiceNode(Node node, TemplatesClass attributedClass) {
    super(node);
    this.attributedClass = attributedClass;
    traverse();
    finish();
  }

  @Override
  public void traverse() {
    while(nextChildNode()){
      switch(getCurrentChildName()){
        case "element": 
          new ElementNode(currentChild);
          break;
        case "choice": 
          attributedClass.isChoise = true;
          new FieldsSequenceOrChoiceNode(currentChild, attributedClass);
          break;
      }
    }
  }

  @Override
  public void finish() {
  }
  
}
