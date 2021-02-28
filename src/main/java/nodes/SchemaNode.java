/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodes;

import org.w3c.dom.Node;

/**
 *
 * @author Pedrivo
 */
public abstract class SchemaNode {
    protected Node node;
            
    public SchemaNode(Node node) {
        this.node = node;
    }
    
    public abstract void traverse();
    
}
