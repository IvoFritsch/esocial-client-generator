<#if isRootClass>
package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

</#if>
<#if javadoc??>
    <#if isRootClass>
        ${javadoc.onlyTitle}
    <#else>
        ${javadoc.onlyTitle
                .param('<T> Tipo do retorno do método finish()')}
    </#if>
</#if>
@XmlAccessorType(XmlAccessType.FIELD)
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

<#list fields as field>
    ${field.getter}

    ${field.setter}
</#list>

<#if !isRootClass> 

    public ${name}(Object pai) {
      this.pai = pai;
    }
      
    @XmlTransient
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
