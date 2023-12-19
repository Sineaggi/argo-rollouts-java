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
import io.argoproj.models.V1alpha1AnalysisTemplateSpecValueFromFieldRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1alpha1RolloutSpecStrategyBlueGreenPostPromotionAnalysisValueFrom
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-19T02:24:32.086Z[Etc/UTC]")
public class V1alpha1RolloutSpecStrategyBlueGreenPostPromotionAnalysisValueFrom {
  public static final String SERIALIZED_NAME_FIELD_REF = "fieldRef";
  @SerializedName(SERIALIZED_NAME_FIELD_REF)
  private V1alpha1AnalysisTemplateSpecValueFromFieldRef fieldRef;

  public static final String SERIALIZED_NAME_POD_TEMPLATE_HASH_VALUE = "podTemplateHashValue";
  @SerializedName(SERIALIZED_NAME_POD_TEMPLATE_HASH_VALUE)
  private String podTemplateHashValue;


  public V1alpha1RolloutSpecStrategyBlueGreenPostPromotionAnalysisValueFrom fieldRef(V1alpha1AnalysisTemplateSpecValueFromFieldRef fieldRef) {
    
    this.fieldRef = fieldRef;
    return this;
  }

   /**
   * Get fieldRef
   * @return fieldRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1AnalysisTemplateSpecValueFromFieldRef getFieldRef() {
    return fieldRef;
  }


  public void setFieldRef(V1alpha1AnalysisTemplateSpecValueFromFieldRef fieldRef) {
    this.fieldRef = fieldRef;
  }


  public V1alpha1RolloutSpecStrategyBlueGreenPostPromotionAnalysisValueFrom podTemplateHashValue(String podTemplateHashValue) {
    
    this.podTemplateHashValue = podTemplateHashValue;
    return this;
  }

   /**
   * Get podTemplateHashValue
   * @return podTemplateHashValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPodTemplateHashValue() {
    return podTemplateHashValue;
  }


  public void setPodTemplateHashValue(String podTemplateHashValue) {
    this.podTemplateHashValue = podTemplateHashValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1RolloutSpecStrategyBlueGreenPostPromotionAnalysisValueFrom v1alpha1RolloutSpecStrategyBlueGreenPostPromotionAnalysisValueFrom = (V1alpha1RolloutSpecStrategyBlueGreenPostPromotionAnalysisValueFrom) o;
    return Objects.equals(this.fieldRef, v1alpha1RolloutSpecStrategyBlueGreenPostPromotionAnalysisValueFrom.fieldRef) &&
        Objects.equals(this.podTemplateHashValue, v1alpha1RolloutSpecStrategyBlueGreenPostPromotionAnalysisValueFrom.podTemplateHashValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldRef, podTemplateHashValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1RolloutSpecStrategyBlueGreenPostPromotionAnalysisValueFrom {\n");
    sb.append("    fieldRef: ").append(toIndentedString(fieldRef)).append("\n");
    sb.append("    podTemplateHashValue: ").append(toIndentedString(podTemplateHashValue)).append("\n");
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
