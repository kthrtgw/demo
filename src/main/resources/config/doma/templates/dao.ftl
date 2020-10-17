<#-- このテンプレートに対応するデータモデルのクラスは org.seasar.doma.extension.gen.DaoDesc です -->
<#import "/lib.ftl" as lib>
<#if lib.copyright??>
${lib.copyright}
</#if>
<#if packageName??>
package ${packageName};
</#if>

<#list importNames as importName>
<#--import ${importName};-->
<#assign importNameLength = importName?length>
<#if importName_index lt 1>
import ${importName?substring(0, importNameLength - 1)};
</#if>
<#if importName_index gt 0>
import ${importName};
</#if>
</#list>

<#list lib.configAutowireable?values as annotationImportName>
import ${annotationImportName};
</#list>

/**
<#if lib.author??>
 * @author ${lib.author}
</#if>
 */
@Dao<#if configClassSimpleName??>(config = ${configClassSimpleName}.class)</#if>
<#list lib.configAutowireable?keys as annotation>
@${annotation}
</#list>
<#--public interface ${simpleName} {-->
<#assign simpleNameLength = simpleName?length>
public interface ${simpleName?substring(0, simpleNameLength - 4)}Dao {

<#if entityDesc.idEntityPropertyDescs?size gt 0>
    /**
<#list entityDesc.idEntityPropertyDescs as property>
     * @param ${property.name}
</#list>
     * @return the <#if entityDesc.entityPrefix??>${entityDesc.entityPrefix}</#if>${entityDesc.simpleName}<#if entityDesc.entitySuffix??>${entityDesc.entitySuffix}</#if> entity
     */
    @Select
    <#--<#if entityDesc.entityPrefix??>${entityDesc.entityPrefix}</#if>${entityDesc.simpleName}<#if entityDesc.entitySuffix??>${entityDesc.entitySuffix}</#if> selectById(<#list entityDesc.idEntityPropertyDescs as property>${property.propertyClassSimpleName} ${property.name}<#if property_has_next>, </#if></#list>);-->
    <#assign entityNameLength = entityDesc.simpleName?length>
    <#if entityDesc.entityPrefix??>${entityDesc.entityPrefix}</#if>${entityDesc.simpleName?substring(0, entityNameLength - 1)}<#if entityDesc.entitySuffix??>${entityDesc.entitySuffix}</#if> selectById(<#list entityDesc.idEntityPropertyDescs as property>${property.propertyClassSimpleName} ${property.name}<#if property_has_next>, </#if></#list>);

</#if>
<#if entityDesc.idEntityPropertyDescs?size gt 0 && entityDesc.versionEntityPropertyDesc??>
    /**
<#list entityDesc.idEntityPropertyDescs as property>
     * @param ${property.name}
</#list>
     * @param ${entityDesc.versionEntityPropertyDesc.name}
     * @return the <#if entityDesc.entityPrefix??>${entityDesc.entityPrefix}</#if>${entityDesc.simpleName}<#if entityDesc.entitySuffix??>${entityDesc.entitySuffix}</#if> entity
     */
    @Select(ensureResult = true)
    <#if entityDesc.entityPrefix??>${entityDesc.entityPrefix}</#if>${entityDesc.simpleName}<#if entityDesc.entitySuffix??>${entityDesc.entitySuffix}</#if> selectByIdAndVersion(<#list entityDesc.idEntityPropertyDescs as property>${property.propertyClassSimpleName} ${property.name}, </#list>${entityDesc.versionEntityPropertyDesc.propertyClassSimpleName} ${entityDesc.versionEntityPropertyDesc.name});

</#if>
    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(<#if entityDesc.entityPrefix??>${entityDesc.entityPrefix}</#if>${entityDesc.simpleName?substring(0, entityNameLength - 1)}<#if entityDesc.entitySuffix??>${entityDesc.entitySuffix}</#if> entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(<#if entityDesc.entityPrefix??>${entityDesc.entityPrefix}</#if>${entityDesc.simpleName?substring(0, entityNameLength - 1)}<#if entityDesc.entitySuffix??>${entityDesc.entitySuffix}</#if> entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(<#if entityDesc.entityPrefix??>${entityDesc.entityPrefix}</#if>${entityDesc.simpleName?substring(0, entityNameLength - 1)}<#if entityDesc.entitySuffix??>${entityDesc.entitySuffix}</#if> entity);
}