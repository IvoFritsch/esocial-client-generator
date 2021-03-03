/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esocial.v1_0;

import javax.xml.bind.annotation.XmlElement;

/**
 * <b>S-2210 - Comunicação de Acidente de Trabalho</b>
 * <p>CHAVE_GRUPO: {Id}</p>
 */
public class T_ideEvento_evtTrab<T> {

  private final T pai;
  private String tpAmb;
  
  public T_ideEvento_evtTrab(T pai) {
    this.pai = pai;
  }
  
  public T_ideEvento_evtTrab<T> tpAmb(String tpAmb) {
    this.tpAmb = tpAmb;
    return this;
  }
  
  public T finish() {
    return pai;
  }
}
