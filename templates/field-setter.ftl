<#if isClassType>
<#if javadoc??>
    ${javadoc.returns('O objeto ' + fullType + ' para população dos campos filhos')}
</#if>
public ${fullType}<${fatherClass.isRootClass?then(fatherClass.name, fatherClass.name + '<T>')}> set${name?cap_first}(){
    if(this.${name} == null) {
      this.${name} = new ${fullType}(this);
    }
    return this.${name};
}
<#else>
<#if javadoc??>
    ${javadoc
        .param(name + ' Valor para atribuir ao campo ' + name)
        .returns('O próprio '+ fatherClass.name + ' para continuar populando outros campos')}
</#if>
public ${fatherClass.name}${fatherClass.isRootClass?then('', '<T>')} set${name?cap_first}(${fullType} ${name}){
    this.${name} = ${name};
    return this;
}
</#if>
