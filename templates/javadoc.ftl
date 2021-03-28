/**
 * ${title}
<#if options.isList>
 * <p>- Esse campo pode ser repetido ${(options.maxOccurs < 0) ? then('indefinidas', 'até ' + options.maxOccurs)} vezes</p>
</#if>
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