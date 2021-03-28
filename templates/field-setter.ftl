<#if isClassType>
<#if javadoc??>
    ${javadoc.returns('O objeto ' + fullType + ' para população dos campos filhos').isList(isList, maxOccurs)}
</#if>
<#if isList>
public ${fullType}<${fatherClass.isRootClass?then(fatherClass.name, fatherClass.name + '<T>')}> set${name?cap_first}_Next(){
    if(this.${name} == null) {
      this.${name} = new java.util.ArrayList<>();
    }
    ${fullType} toAdd = new ${fullType}(this);
    this.${name}.add(toAdd);
    return toAdd;
}
<#else>
public ${fullType}<${fatherClass.isRootClass?then(fatherClass.name, fatherClass.name + '<T>')}> set${name?cap_first}(){
    if(this.${name} == null) {
      this.${name} = new ${fullType}(this);
    }
    return this.${name};
}
</#if>
<#else>
<#if javadoc??>
    ${javadoc
        .param(name + ' Valor para atribuir ao campo ' + name)
        .returns('O próprio '+ fatherClass.name + ' para continuar populando outros campos')}
</#if>
public ${fatherClass.name}${fatherClass.isRootClass?then('', '<T>')} set${name?cap_first}(${fullType} ${name}){
<#if isEnumeration>
    if(
<#list enumerations as enum>
    !"${enum.value}".equals(${name})<#sep> &&</#sep>
</#list>
    ) throw new RuntimeException("Valor " + String.valueOf(${name}) + " inválido para o campo ${name}");
</#if>
    this.${name} = ${name};
    return this;
}
<#if isEnumeration>
<#list enumerations as enum>
<#if enum.javadoc??>
    ${enum.javadoc
        .returns('O próprio '+ fatherClass.name + ' para continuar populando outros campos')}
</#if>
public ${fatherClass.name}${fatherClass.isRootClass?then('', '<T>')} set${name?cap_first}_${enum.value}(){
    this.${name} = "${enum.value}";
    return this;
}
</#list>
</#if>
</#if>
