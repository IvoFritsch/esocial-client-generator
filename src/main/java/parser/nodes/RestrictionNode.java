/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser.nodes;

import org.w3c.dom.Node;
import templates.objects.TemplatesSimpleType;

/**
 * Traversa uma sequencia de campo dentro de um complex type
 * @author Ivo
 */
public final class RestrictionNode extends SchemaNode {

  public TemplatesSimpleType attributtedSimpleType;

  public RestrictionNode(Node node, TemplatesSimpleType attributtedSimpleType) {
    super(node);
    this.attributtedSimpleType = attributtedSimpleType;
    this.attributtedSimpleType.setType(getThisAttrValue("base"));
    traverse();
    finish();
  }

  @Override
  public void traverse() {
    while(nextNode()){
      switch(getCurrentChildName()){
      }
    }
  }

  @Override
  public void finish() {
  }
  
}
