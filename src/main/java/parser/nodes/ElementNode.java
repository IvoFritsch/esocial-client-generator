/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser.nodes;

import main.Main;
import org.w3c.dom.Node;
import main.Utils;
import templates.objects.TemplatesField;
import templates.objects.TemplatesJavadoc;

/**
 * O ElementNode representa um campo que será colocado na classe pai
 * @author Ivo
 */
public final class ElementNode extends SchemaNode{
  
  public TemplatesField attributedField;
  
  public ElementNode(Node node) {
    super(node);
    // Se é a assinatura, ignora esse campo
    if("ds:Signature".equals(getThisAttrValue("ref"))){
      return;
    }
    attributedField = Main.ctx.startField();
    attributedField.name = getThisAttrValue("name");
    attributedField.setType(getThisAttrValue("type"));
    String maxOccurs = getThisAttrValue("maxOccurs");
    if(maxOccurs != null) {
      attributedField.isList = true;
      if(maxOccurs.equals("unbounded")) maxOccurs = "-1";
      attributedField.maxOccurs = Integer.parseInt(maxOccurs);
    }
    traverse();
    finish();
  }

  @Override
  public void traverse() {
    while(nextChildNode()) {
      switch(getCurrentChildName()){
        case "annotation": 
          attributedField.javadoc = new TemplatesJavadoc(new JavadocNode(currentChild));
          break;
        case "complexType": 
          attributedField.setType(Utils.capFirst(attributedField.name));
          ComplexTypeNode complexTypeNode = new ComplexTypeNode(currentChild, attributedField);
          attributedField.setType(complexTypeNode.attributedClass.name);
          break;
        case "simpleType": 
          SimpleTypeNode simpleTypeNode = new SimpleTypeNode(currentChild, attributedField);
          attributedField.setType(simpleTypeNode.attributedSimpleType.correspondingType);
          attributedField.setResolvedSimpleType(simpleTypeNode.attributedSimpleType);
          break;
      }
    }
  }

  @Override
  public void finish() {
    Main.ctx.finishField();
  }
}