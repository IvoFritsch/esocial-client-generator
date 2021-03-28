/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;
import java.util.Collection;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import org.apache.commons.io.FileUtils;
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
      
      String in = "schemas";
      String out = "src/main/java/esocial";
      try {
        
        final String[] SUFFIX = {"xsd"};  // use the suffix to filter

        Collection<File> files = FileUtils.listFiles(new File(in), SUFFIX, true);
        if(files.isEmpty()) {
          throw new RuntimeException("Nenhum arquivo xsd encontrado no caminho especificado");
        }
        String versaoAtual = null;
        Context currentGlobalTypesContext = null;
        for(File f : files) {
          String path = f.toString();
          path = path.replace("\\", "/");
          String[] splitted = path.split("/");
          String version = splitted[splitted.length - 2];
          String fileName = splitted[splitted.length - 1];
          fileName = fileName.split("[.]")[0];
          if(!fileName.startsWith("evt")) {
            continue;
          }
          
          if(!version.equals(versaoAtual)) {
            versaoAtual = version;
            System.out.println("---------------------------------------------------------------------");
            System.out.println("------> Iniciando versão "+ versaoAtual);
            System.out.println("------> Criando classe de Tipos da versão "+ versaoAtual);
            currentGlobalTypesContext = loadGlobalTypes(new File(in + "/" + versaoAtual + "/tipos.xsd"));
            currentGlobalTypesContext.writeToDir(new File(out + "/" + versaoAtual));
          }
          String evento = fileName.replaceFirst("evt", "");
          evento = evento.substring(0, 1).toUpperCase() + evento.substring(1);
          System.out.println("------> Parseando evento " + evento);
          ctx = new Context(new TemplatesClass(evento));
          ctx.importTypesFrom(currentGlobalTypesContext);
          Document doc = readXsd(new File(path));
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
          System.out.println("------> Identando e escrevendo evento " + evento);
          ctx.writeToDir(new File(out + "/" + versaoAtual));
          System.out.println("<<<<<");
          //return;
        }
       } catch (Exception e) {
          e.printStackTrace();
       }
    }
    
    public static Context loadGlobalTypes(File from) throws Exception{
      
      System.out.println("------> Lendo arquivo de tipos globais");
      Document doc = readXsd(from);
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
