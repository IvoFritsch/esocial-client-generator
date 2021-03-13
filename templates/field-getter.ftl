<#if javadoc??>
    ${javadoc.onlyTitle
            .returns('Valor do campo '+name)}
</#if>
public ${fullType} get${name?cap_first}(){
    return this.${name};
}

