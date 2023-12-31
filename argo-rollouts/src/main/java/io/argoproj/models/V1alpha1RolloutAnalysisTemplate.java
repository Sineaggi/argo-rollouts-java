/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.21.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.argoproj.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1alpha1RolloutAnalysisTemplate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-19T21:57:47.017Z[Etc/UTC]")
public class V1alpha1RolloutAnalysisTemplate {
  public static final String SERIALIZED_NAME_CLUSTER_SCOPE = "clusterScope";
  @SerializedName(SERIALIZED_NAME_CLUSTER_SCOPE)
  private Boolean clusterScope;

  public static final String SERIALIZED_NAME_TEMPLATE_NAME = "templateName";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_NAME)
  private String templateName = "";


  public V1alpha1RolloutAnalysisTemplate clusterScope(Boolean clusterScope) {
    
    this.clusterScope = clusterScope;
    return this;
  }

   /**
   * Whether to look for the templateName at cluster scope or namespace scope
   * @return clusterScope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to look for the templateName at cluster scope or namespace scope")

  public Boolean getClusterScope() {
    return clusterScope;
  }


  public void setClusterScope(Boolean clusterScope) {
    this.clusterScope = clusterScope;
  }


  public V1alpha1RolloutAnalysisTemplate templateName(String templateName) {
    
    this.templateName = templateName;
    return this;
  }

   /**
   * TemplateName name of template to use in AnalysisRun
   * @return templateName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TemplateName name of template to use in AnalysisRun")

  public String getTemplateName() {
    return templateName;
  }


  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1RolloutAnalysisTemplate v1alpha1RolloutAnalysisTemplate = (V1alpha1RolloutAnalysisTemplate) o;
    return Objects.equals(this.clusterScope, v1alpha1RolloutAnalysisTemplate.clusterScope) &&
        Objects.equals(this.templateName, v1alpha1RolloutAnalysisTemplate.templateName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterScope, templateName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1RolloutAnalysisTemplate {\n");
    sb.append("    clusterScope: ").append(toIndentedString(clusterScope)).append("\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

