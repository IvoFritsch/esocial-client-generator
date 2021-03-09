<#if javadoc??>
    ${javadoc}
</#if>
public ${isRootClass?then('', 'static')} class ${name} {

<#list fields as field>
    ${field}
</#list>

<#list childClasses as childClass>
    ${childClass}
</#list>

}
