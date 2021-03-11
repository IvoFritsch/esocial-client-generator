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

/**
 *
 * @author Ivo
 */
public final class ComplexTypeNode extends SchemaNode {

  public TemplatesClass attributedClass;
  public TemplatesField fatherField;
  
  public ComplexTypeNode(Node node) {
    super(node);
    attributedClass = Main.ctx.startClass();
    attributedClass.name = getThisAttrValue("name");
    traverse();
    finish();
  }
  
  public ComplexTypeNode(Node node, TemplatesField fatherField) {
    super(node);
    attributedClass = Main.ctx.startClass();
    attributedClass.name = fatherField.getType();
    if("ESocial".equals(attributedClass.name)) {
      attributedClass.name = "Evento_" + Main.ctx.getRootClass().name;
      attributedClass.isMainESocialClass = true;
    }
    this.fatherField = fatherField;
    traverse();
    finish();
  }

  @Override
  public void traverse() {
    while(nextNode()){
      switch(getCurrentChildName()){
        case "annotation": 
          if(fatherField != null) {
            fatherField.javadoc = new TemplatesJavadoc(new JavadocNode(currentChild, true));
          } else {
            attributedClass.javadoc = new TemplatesJavadoc(new JavadocNode(currentChild));
          }
          break;
        case "sequence": 
          new FieldsSequenceOrChoiceNode(currentChild, attributedClass);
          break;
      }
    }
    
  }

  @Override
  public void finish() {
    Main.ctx.finishClass();
  }
  
}
