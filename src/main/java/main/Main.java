/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import esocial.infoempregador.S1_0;
import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import parser.nodes.ComplexTypeNode;
import parser.nodes.ElementNode;
import parser.nodes.SchemaNode;
import parser.nodes.SimpleTypeNode;
import templates.Context;
import templates.objects.TemplatesClass;

/**
 *
 * @author Pedrivo
 */
public class Main {
  
    public static Context ctx;
  
    public static void main(String[] args){

      try {
        
        S1_0 s1_0 = new esocial.infoempregador.S1_0();
        
        Document doc = readXsd(new File("schemas/1_0/evtCAT.xsd"));
        Context globalTypesContext = loadGlobalTypes();
        ctx = new Context(new TemplatesClass("S1_0"));
        ctx.importSimpleTypesFrom(globalTypesContext);
        NodeList childNodes = doc.getDocumentElement().getChildNodes();
        for(int i = 0; i < childNodes.getLength(); i++){
          Node item = childNodes.item(i);
          switch(SchemaNode.getNodeName(item)) {
            case "element": 
              new ElementNode(item);
              break;
            case "complexType": 
              new ComplexTypeNode(item);
              break;
            case "simpleType": 
              new SimpleTypeNode(item);
              break;
          }
        }
        ctx.finishResolvingAllTypes();
        System.out.println(ctx.getRootClass().toString(0));

       } catch (Exception e) {
          e.printStackTrace();
       }
    }
    
    public static Context loadGlobalTypes() throws Exception{
      
      Document doc = readXsd(new File("schemas/1_0/tipos.xsd"));
      ctx = new Context(new TemplatesClass("Tipos"));
      NodeList childNodes = doc.getDocumentElement().getChildNodes();
      for(int i = 0; i < childNodes.getLength(); i++){
        Node item = childNodes.item(i);
        switch(SchemaNode.getNodeName(item)) {
          case "complexType": 
            new ComplexTypeNode(item);
            break;
          case "simpleType": 
            new SimpleTypeNode(item);
            break;
        }
      }
      ctx.finishResolvingAllTypes();
      //System.out.println(ctx.getCurrentProccessingClass().toString(0));
      return ctx;
    }
    
    public static Document readXsd(File file) throws Exception {
      
      DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
      DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
      Document doc = dBuilder.parse(file);
      doc.getDocumentElement().normalize();

      XPathFactory xpathFactory = XPathFactory.newInstance();
      // XPath to find empty text nodes.
      XPathExpression xpathExp = xpathFactory.newXPath().compile(
              "//text()[normalize-space(.) = '']");  
      NodeList emptyTextNodes = (NodeList) 
              xpathExp.evaluate(doc, XPathConstants.NODESET);

      // Remove each empty text node from document.
      for (int i = 0; i < emptyTextNodes.getLength(); i++) {
          Node emptyTextNode = emptyTextNodes.item(i);
          emptyTextNode.getParentNode().removeChild(emptyTextNode);
      }

      xpathFactory = XPathFactory.newInstance();
      // XPath to find comments.
      xpathExp = xpathFactory.newXPath().compile(
              "//comment()");  
      NodeList commentNodes = (NodeList) 
              xpathExp.evaluate(doc, XPathConstants.NODESET);

      // Remove each empty text node from document.
      for (int i = 0; i < commentNodes.getLength(); i++) {
          Node commentNode = commentNodes.item(i);
          commentNode.getParentNode().removeChild(commentNode);
      }
      return doc;
    }
    
}
