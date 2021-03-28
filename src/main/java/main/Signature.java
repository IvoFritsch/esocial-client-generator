/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.StringReader;
import java.security.Key;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.apache.commons.io.FileUtils;
import org.apache.xml.security.Init;
import org.apache.xml.security.signature.XMLSignature;
import org.apache.xml.security.transforms.Transforms;
import org.apache.xml.security.utils.Constants;
import org.apache.xml.security.utils.ElementProxy;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

/**
 *
 * @author Ivo
 */
public class Signature {

  public static void assinarXML(String xml) {
    Init.init();
    String certPath;
    String tokenNomeAmigavel;
    String password;

    try {
      //CERTIFICADO DIGITAL EM ARQUIVO
      certPath = ""; // cert-info.txt
      tokenNomeAmigavel = "NomeBunitin";
      password = "";

      String signatureMethod = "http://www.w3.org/2001/04/xmldsig-more#rsa-sha256";
      String[] transformList = { 
			"http://www.w3.org/2000/09/xmldsig#enveloped-signature",
			"http://www.w3.org/TR/2001/REC-xml-c14n-20010315" };
      String digestMethod = "http://www.w3.org/2001/04/xmlenc#sha256";
      
      ElementProxy.setDefaultPrefix(Constants.SignatureSpecNS, "");

      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      factory.setNamespaceAware(true);
      factory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
      factory.setFeature("http://xml.org/sax/features/external-general-entities", false);
      factory.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
      
      // Load the KeyStore and get the signing key and certificate.
      KeyStore ks = KeyStore.getInstance("pkcs12");
      ks.load(new FileInputStream(certPath), password.toCharArray());
      String alias = ks.aliases().nextElement(); // This works only if the keystore has one just one loaded entry
      X509Certificate certificado = (X509Certificate) ks.getCertificate(alias);
      Key privateKey = ks.getKey(alias, password.toCharArray());
      
      
      
      final Document doc = factory.newDocumentBuilder().parse(new InputSource(new StringReader(xml)));

      XMLSignature sig = new XMLSignature(doc, null, signatureMethod);
      doc.getDocumentElement().appendChild(sig.getElement());

      final Transforms transforms = criarTransformacoes(transformList, doc);
      sig.addDocument("", transforms, digestMethod);

      sig.addKeyInfo(certificado);
      sig.sign(privateKey);
      
      String signedXML = getDocString(doc);
      
      System.out.println(signedXML);
      
      FileUtils.write(new File("saida.xml"), signedXML, "UTF-8");
      //CERTIFICADO DIGITAL EM SMARTCARD
      //tokenCaminho = "";
      //tokenNomeAmigavel = "";
      //tokenSenha = "";
      //System.setProperty("javax.xml.transform.TransformerFactory", "com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactoryImpl");

      //Create a DOM XMLSignatureFactory that will be used to generate the
      //enveloped signature.
//      XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM");
//
//      //Create a Reference to the enveloped document (in this case, you
//      //are signing the whole document, so a URI of "" signifies that,
//      //and also specify the SHA1 digest algorithm and the ENVELOPED Transform.            
//      Reference ref = fac.newReference("", fac.newDigestMethod(DigestMethod.SHA1, null),
//              Collections.singletonList(fac.newTransform(Transform.ENVELOPED,
//                      (TransformParameterSpec) null)), null, null);
//
//      //Create the SignedInfo.
//      SignedInfo si = fac.newSignedInfo(fac.newCanonicalizationMethod(CanonicalizationMethod.INCLUSIVE,
//              (C14NMethodParameterSpec) null),
//              fac.newSignatureMethod(SignatureMethod.RSA_SHA1, null),
//              Collections.singletonList(ref));
//
//      // Load the KeyStore and get the signing key and certificate.
//      KeyStore ks = KeyStore.getInstance("PKCS12");
//      ks.load(new FileInputStream(certPath), password.toCharArray());
//      String alias = ks.aliases().nextElement(); // This works only if the keystore has one just one loaded entry
//      KeyStore.PrivateKeyEntry keyEntry = 
//              (KeyStore.PrivateKeyEntry) ks.getEntry(alias, new KeyStore.PasswordProtection(password.toCharArray()));
//      X509Certificate cert = (X509Certificate) keyEntry.getCertificate();
//
//      // Create the KeyInfo containing the X509Data.
//      KeyInfoFactory kif = fac.getKeyInfoFactory();
//      List x509Content = new ArrayList();
//      x509Content.add(cert.getSubjectX500Principal().getName());
//      x509Content.add(cert);
//      X509Data xd = kif.newX509Data(x509Content);
//      KeyInfo ki = kif.newKeyInfo(Collections.singletonList(xd));
//      // Instantiate the document to be signed.
//      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//      dbf.setNamespaceAware(true);
//      Document doc = dbf.newDocumentBuilder().parse(new ByteArrayInputStream(arquivoXML.getBytes()));
//      
//      // Create the XMLSignature, but don't sign it yet.
//      XMLSignature signature = fac.newXMLSignature(si, ki);
//      
//      //doc.getDocumentElement().appendChild(signature.getE);
//      // Create a DOMSignContext and specify the RSA PrivateKey and
//      // location of the resulting XMLSignature's parent element.
//      DOMSignContext dsc = new DOMSignContext(keyEntry.getPrivateKey(), doc.getDocumentElement());
//
//      // Marshal, generate, and sign the enveloped signature.
//      signature.sign(dsc);
//      // Output the resulting document.            
//      OutputStream os = new FileOutputStream("saida.xml");
//      TransformerFactory tf = TransformerFactory.newInstance();
//      Transformer trans = tf.newTransformer();
//      
//      trans.transform(new DOMSource(doc), new StreamResult(os));
    } catch (Exception e) {
      e.printStackTrace();
      throw new RuntimeException("Erro na assinatura");
    }
  }
  
  private static Transforms criarTransformacoes(String[] transformList, final Document doc) throws Exception {
          final Transforms transforms = new Transforms(doc);
          for (String transformUri : transformList) {
                  transforms.addTransform(transformUri);
          }
          return transforms;
  }
  
  private static String getDocString(Document doc) throws Exception {

          ByteArrayOutputStream os = new ByteArrayOutputStream();
          TransformerFactory tf = TransformerFactory.newInstance();
          Transformer trans = tf.newTransformer();
          trans.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
          trans.transform(new DOMSource(doc), new StreamResult(os));

          return os.toString("UTF-8");
  }
}
