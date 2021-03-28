<#if javadoc??>
    ${javadoc.onlyTitle
            .returns('Conteúdo do campo '+name)}
</#if>
public ${fullTypeWithList} get${name?cap_first}(){
    return this.${name};
}

