<#if isRootClass>
package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

</#if>
<#if javadoc??>
    ${javadoc}
</#if>
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "", propOrder = {
<#list fields as field>
    "${field.name}",
</#list>
})
<#if isMainESocialClass>
@XmlRootElement(name = "eSocial")
</#if>
public ${isRootClass?then('', 'static')} class ${name}${isRootClass?then('', '<T>')} {

<#list fields as field>
    ${field}
</#list>

<#if !isRootClass> 

    public ${name}(Object pai) {
      this.pai = pai;
    }
      
    private final Object pai;

    /**
     * Finaliza a população dos campos filhos desse nível
     * 
     * @return O nível anterior da árvore
     */
    public T finish(){
      return (T) pai;
    }
</#if>
<#list childClasses as childClass>
    ${childClass}
</#list>

}
