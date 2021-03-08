/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esocial.v1_0;

/**
 * <b>S-2210 - Comunicação de Acidente de Trabalho</b>
 * <p>CHAVE_GRUPO: {Id}</p>
 */
public class CAT {
  private T_ideEvento_evtTrab ideEvento;
  
  public T_ideEvento_evtTrab<CAT> ideEvento(){
    
    ESocial_1_0_Tipos.T_ideEvento_evtTab t_ideEvento_evtTab = new ESocial_1_0_Tipos.T_ideEvento_evtTab();
    
    
    if(ideEvento == null){
      ideEvento = new T_ideEvento_evtTrab<>(this);
    }
    return ideEvento;
  }
}
