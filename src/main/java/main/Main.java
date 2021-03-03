/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

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
import parser.nodes.ElementNode;
import parser.nodes.SchemaNode;
import templates.Context;
import templates.objects.TemplatesClass;

/**
 *
 * @author Pedrivo
 */
public class Main {
  
    public static Context ctx = new Context(new TemplatesClass("CAT"));
  
    public static void main(String[] args){

      try {
            File inputFile = new File("schemas/1_0/evtCAT.xsd");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
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
            
//            RootNode rootNode = new RootNode(doc.getDocumentElement());
            NodeList childNodes = doc.getDocumentElement().getChildNodes();
            for(int i = 0; i < childNodes.getLength(); i++){
              Node item = childNodes.item(i);
              switch(SchemaNode.getNodeName(item)) {
                case "element": 
                  new ElementNode(item);
              }
            }
            System.out.println(ctx.getCurrentProccessingClass().toString(0));
            
         } catch (Exception e) {
            e.printStackTrace();
         }
      }
    }
