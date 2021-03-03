/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser.nodes;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author Pedrivo
 */
public abstract class SchemaNode {
    protected Node node;
    
    private int nextChildNumber = 0;
    private final NodeList childNodes;
    protected Node currentChild;
    protected int currentChildNumber = -1;
            
    public SchemaNode(Node node) {
        this.node = node;
        this.childNodes = node.getChildNodes();
    }
    
    protected final String getThisName(){
      return getNodeName(node);
    }
    
    protected final String getThisAttrValue(String attr){
      return getNodeAttrValue(node, attr);
    }
    
    protected final String getCurrentChildName(){
      return getNodeName(currentChild);
    }
    
    protected final String getCurrentChildAttrValue(String attr){
      return getNodeAttrValue(currentChild, attr);
    }
    
    public static final String getNodeName(Node n){
      return n.getNodeName().split(":")[1];
    }
    
    public static final String getNodeAttrValue(Node n, String attr){
      NamedNodeMap attrs = n.getAttributes();
      if(attrs == null) return null;
      Node namedItem = attrs.getNamedItem(attr);
      if(namedItem == null) return null;
      return namedItem.getNodeValue();
    }
    
  /**
   * Posiciona no próximo nó filho
   * @return
   */
  protected final boolean nextNode(){
      Node ret = childNodes.item(nextChildNumber);
      currentChild = ret;
      nextChildNumber++;
      currentChildNumber++;
      return ret != null;
    }
    
    public abstract void traverse();
    public abstract void finish();
}
