/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser.nodes;

import main.Main;
import org.w3c.dom.Node;
import templates.objects.TemplatesClass;
import templates.objects.TemplatesField;
import templates.objects.TemplatesJavadoc;
import templates.objects.TemplatesSimpleType;

/**
 *
 * @author Ivo
 */
public final class SimpleTypeNode extends SchemaNode {

  public TemplatesField fatherField;
  public TemplatesSimpleType attributedSimpleType;
  
  public SimpleTypeNode(Node node) {
    this(node, null);
  }
          
  public SimpleTypeNode(Node node, TemplatesField fatherField) {
    super(node);
    this.fatherField = fatherField;
    attributedSimpleType = Main.ctx.startSimpleType();
    attributedSimpleType.fatherField = fatherField;
    attributedSimpleType.name = getThisAttrValue("name");
    traverse();
    finish();
  }

  @Override
  public void traverse() {
    while(nextChildNode()){
      switch(getCurrentChildName()){
        case "annotation": 
          if(fatherField != null) {
            fatherField.javadoc = new TemplatesJavadoc(new JavadocNode(currentChild));
          } else {
            attributedSimpleType.javadoc = new TemplatesJavadoc(new JavadocNode(currentChild));
          }
          break;
        case "restriction": 
          new RestrictionNode(currentChild, attributedSimpleType);
          break;
      }
    }
    
  }

  @Override
  public void finish() {
    Main.ctx.finishSimpleType();
  }
  
}
