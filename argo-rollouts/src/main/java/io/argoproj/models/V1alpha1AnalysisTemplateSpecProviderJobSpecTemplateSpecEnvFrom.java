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
import io.argoproj.models.V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecConfigMapRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecEnvFrom
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-19T02:24:32.086Z[Etc/UTC]")
public class V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecEnvFrom {
  public static final String SERIALIZED_NAME_CONFIG_MAP_REF = "configMapRef";
  @SerializedName(SERIALIZED_NAME_CONFIG_MAP_REF)
  private V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecConfigMapRef configMapRef;

  public static final String SERIALIZED_NAME_PREFIX = "prefix";
  @SerializedName(SERIALIZED_NAME_PREFIX)
  private String prefix;

  public static final String SERIALIZED_NAME_SECRET_REF = "secretRef";
  @SerializedName(SERIALIZED_NAME_SECRET_REF)
  private V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecConfigMapRef secretRef;


  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecEnvFrom configMapRef(V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecConfigMapRef configMapRef) {
    
    this.configMapRef = configMapRef;
    return this;
  }

   /**
   * Get configMapRef
   * @return configMapRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecConfigMapRef getConfigMapRef() {
    return configMapRef;
  }


  public void setConfigMapRef(V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecConfigMapRef configMapRef) {
    this.configMapRef = configMapRef;
  }


  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecEnvFrom prefix(String prefix) {
    
    this.prefix = prefix;
    return this;
  }

   /**
   * Get prefix
   * @return prefix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrefix() {
    return prefix;
  }


  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecEnvFrom secretRef(V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecConfigMapRef secretRef) {
    
    this.secretRef = secretRef;
    return this;
  }

   /**
   * Get secretRef
   * @return secretRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecConfigMapRef getSecretRef() {
    return secretRef;
  }


  public void setSecretRef(V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecConfigMapRef secretRef) {
    this.secretRef = secretRef;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecEnvFrom v1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecEnvFrom = (V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecEnvFrom) o;
    return Objects.equals(this.configMapRef, v1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecEnvFrom.configMapRef) &&
        Objects.equals(this.prefix, v1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecEnvFrom.prefix) &&
        Objects.equals(this.secretRef, v1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecEnvFrom.secretRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configMapRef, prefix, secretRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecEnvFrom {\n");
    sb.append("    configMapRef: ").append(toIndentedString(configMapRef)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
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
