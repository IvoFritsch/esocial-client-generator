/**
 * ${title}
<#if !options.onlyTitle>
<#if isReferringClassChoice>
 * <p>Obs.: Escolha somente um dos campos filhos</p>
</#if>
 *
<#list lines as line>
 * <p>${line}</p>
</#list>
</#if>
<#if options.param??>
 * @param ${options.param}
</#if>
<#if options.returns??>
 * @return ${options.returns}
</#if>
 */