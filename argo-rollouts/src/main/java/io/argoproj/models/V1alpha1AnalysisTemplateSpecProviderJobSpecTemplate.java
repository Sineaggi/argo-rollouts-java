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
import io.argoproj.models.V1alpha1AnalysisTemplateSpecProviderJobMetadata;
import io.argoproj.models.V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpec;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1alpha1AnalysisTemplateSpecProviderJobSpecTemplate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-19T02:24:32.086Z[Etc/UTC]")
public class V1alpha1AnalysisTemplateSpecProviderJobSpecTemplate {
  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private V1alpha1AnalysisTemplateSpecProviderJobMetadata metadata;

  public static final String SERIALIZED_NAME_SPEC = "spec";
  @SerializedName(SERIALIZED_NAME_SPEC)
  private V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpec spec;


  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplate metadata(V1alpha1AnalysisTemplateSpecProviderJobMetadata metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1AnalysisTemplateSpecProviderJobMetadata getMetadata() {
    return metadata;
  }


  public void setMetadata(V1alpha1AnalysisTemplateSpecProviderJobMetadata metadata) {
    this.metadata = metadata;
  }


  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplate spec(V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpec spec) {
    
    this.spec = spec;
    return this;
  }

   /**
   * Get spec
   * @return spec
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpec getSpec() {
    return spec;
  }


  public void setSpec(V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpec spec) {
    this.spec = spec;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1AnalysisTemplateSpecProviderJobSpecTemplate v1alpha1AnalysisTemplateSpecProviderJobSpecTemplate = (V1alpha1AnalysisTemplateSpecProviderJobSpecTemplate) o;
    return Objects.equals(this.metadata, v1alpha1AnalysisTemplateSpecProviderJobSpecTemplate.metadata) &&
        Objects.equals(this.spec, v1alpha1AnalysisTemplateSpecProviderJobSpecTemplate.spec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, spec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1AnalysisTemplateSpecProviderJobSpecTemplate {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
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
