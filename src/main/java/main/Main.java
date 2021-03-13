/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import com.google.googlejavaformat.java.Formatter;
import esocial.v1_0.Evento_InfoEmpregador;
import esocial.v1_0.Teste;
import java.io.File;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
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

      File out = new File("src/main/java/esocial/v1_0");
      try {
        
        
        Evento_InfoEmpregador event = new esocial.v1_0.Evento_InfoEmpregador();
        event.setEvtInfoEmpregador()
                .setIdeEmpregador()
                  .setNrInsc("312412341")
                  .setTpInsc("12")
                .finish()
                .setIdeEvento()
                  .setProcEmi("1233asfsadfiusdfiad76f8a")
                  .setTpAmb("555")
                  .setVerProc("1.0.0")
                .finish()
                .setInfoEmpregador()
                  .setInclusao()
                    .setIdePeriodo()
                      .setIniValid("2021-03")
                    .finish()
                    .setInfoCadastro()
                      .setDadosIsencao()
                        .setPagDou(3)
                      .finish() // A chamada dos finish() finais é opcional
                    .finish()
                  .finish()
                .finish()
              .finish();
        
        System.out.println(event.getEvtInfoEmpregador().getInfoEmpregador().getInclusao().getIdePeriodo().getIniValid());
//        
//        JAXBContext jaxbContext = JAXBContext.newInstance(esocial.v1_0.Evento_InfoEmpregador.class);
//        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
//
//        // output pretty printed
//        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//        StringWriter sw = new StringWriter();
//        
//        jaxbMarshaller.marshal(event, sw);
//        String xmlString = sw.toString();
//        
//        System.out.println(xmlString);
        //if(1==1) return;
        
        Context globalTypesContext = loadGlobalTypes();
        
        //System.out.println(new Formatter().formatSource(globalTypesContext.getRootClass().toString()));
        globalTypesContext.writeToDir(out);
        System.out.println("---------------------------------------------------------------------");
        System.out.println("------> Lendo arquivo do evento InfoEmpregador");
        Document doc = readXsd(new File("schemas/1_0/evtInfoEmpregador.xsd"));
        
        System.out.println("------> Parseando evento InfoEmpregador");
        ctx = new Context(new TemplatesClass("InfoEmpregador"));
        ctx.importTypesFrom(globalTypesContext);
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
        ctx.transformESocialSubClassToRoot();
        System.out.println("------> Finalizando evento InfoEmpregador");
        System.out.println("------> Formatando código java final");
        ctx.writeToDir(out);

       } catch (Exception e) {
          e.printStackTrace();
       }
    }
    
    public static Context loadGlobalTypes() throws Exception{
      
      System.out.println("------> Lendo arquivo de tipos globais");
      Document doc = readXsd(new File("schemas/1_0/tipos.xsd"));
      System.out.println("------> Parseando tipos globais");
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
      System.out.println("------> Finalizando tipos globais");
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
