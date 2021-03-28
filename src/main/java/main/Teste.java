/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import esocial.v1_0.Evento_Admissao;
import esocial.v1_0.Evento_InfoEmpregador;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

/**
 *
 * @author Ivo
 */
public class Teste {
  public static void main(String[] args) throws Exception {
    
//        Evento_InfoEmpregador event = new esocial.v1_0.Evento_InfoEmpregador();
//        event.setEvtInfoEmpregador()
//                .setIdeEmpregador()
//                  .setNrInsc("312412341")
//                  .setTpInsc("12")
//                .finish()
//                .setIdeEvento()
//                  .setProcEmi("1233asfsadfiusdfiad76f8a")
//                  .setTpAmb("555")
//                  .setVerProc("1.0.0")
//                .finish()
//                .setInfoEmpregador()
//                  .setInclusao()
//                    .setIdePeriodo()
//                      .setIniValid("2021-03")
//                    .finish()
//                    .setInfoCadastro()
//                      .setDadosIsencao()
//                        .setPagDou(3)
//                      .finish() // A chamada dos finish() finais é opcional
//                    .finish()
//                  .finish()
//                .finish()
//              .finish();
        Evento_Admissao evento_Admissao = new Evento_Admissao();
        evento_Admissao.setEvtAdmissao()
                .setIdeEvento()
                  .setNrRecibo(null)
                .finish()
                .setTrabalhador()
                  .setEstCiv_3()
                  .setNascimento()
                    .setPaisNac("18")
                  .finish()
                .finish()
                .setVinculo()
                  .setInfoRegimeTrab()
                    .setInfoCeletista()
                      .setTpAdmissao_5()
                    .finish()
                  .finish()
                .finish()
                .setTrabalhador()
                  .setNmTrab("Paulo Alfredo Fritsch")
                  .setDependente_Next()
                    .setNmDep("Pedro Fritsch")
                  .finish()
                  .setDependente_Next()
                    .setNmDep("Ivo Fritsch")
                    .setSexoDep_M()
                  .finish();

        JAXBContext jaxbContext = JAXBContext.newInstance(esocial.v1_0.Evento_Admissao.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
        // output pretty printed
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        StringWriter sw = new StringWriter();
        
        jaxbMarshaller.marshal(evento_Admissao, sw);
        String xmlString = sw.toString();
        
        System.out.println(xmlString);
        
        Signature.assinarXML(xmlString);
  }
}
