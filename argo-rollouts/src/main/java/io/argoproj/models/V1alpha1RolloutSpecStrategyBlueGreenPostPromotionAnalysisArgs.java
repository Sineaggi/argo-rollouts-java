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
import io.argoproj.models.V1alpha1RolloutSpecStrategyBlueGreenPostPromotionAnalysisValueFrom;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1alpha1RolloutSpecStrategyBlueGreenPostPromotionAnalysisArgs
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-19T02:24:32.086Z[Etc/UTC]")
public class V1alpha1RolloutSpecStrategyBlueGreenPostPromotionAnalysisArgs {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_VALUE_FROM = "valueFrom";
  @SerializedName(SERIALIZED_NAME_VALUE_FROM)
  private V1alpha1RolloutSpecStrategyBlueGreenPostPromotionAnalysisValueFrom valueFrom;


  public V1alpha1RolloutSpecStrategyBlueGreenPostPromotionAnalysisArgs name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha1RolloutSpecStrategyBlueGreenPostPromotionAnalysisArgs value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public V1alpha1RolloutSpecStrategyBlueGreenPostPromotionAnalysisArgs valueFrom(V1alpha1RolloutSpecStrategyBlueGreenPostPromotionAnalysisValueFrom valueFrom) {
    
    this.valueFrom = valueFrom;
    return this;
  }

   /**
   * Get valueFrom
   * @return valueFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1RolloutSpecStrategyBlueGreenPostPromotionAnalysisValueFrom getValueFrom() {
    return valueFrom;
  }


  public void setValueFrom(V1alpha1RolloutSpecStrategyBlueGreenPostPromotionAnalysisValueFrom valueFrom) {
    this.valueFrom = valueFrom;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1RolloutSpecStrategyBlueGreenPostPromotionAnalysisArgs v1alpha1RolloutSpecStrategyBlueGreenPostPromotionAnalysisArgs = (V1alpha1RolloutSpecStrategyBlueGreenPostPromotionAnalysisArgs) o;
    return Objects.equals(this.name, v1alpha1RolloutSpecStrategyBlueGreenPostPromotionAnalysisArgs.name) &&
        Objects.equals(this.value, v1alpha1RolloutSpecStrategyBlueGreenPostPromotionAnalysisArgs.value) &&
        Objects.equals(this.valueFrom, v1alpha1RolloutSpecStrategyBlueGreenPostPromotionAnalysisArgs.valueFrom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, valueFrom);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1RolloutSpecStrategyBlueGreenPostPromotionAnalysisArgs {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueFrom: ").append(toIndentedString(valueFrom)).append("\n");
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
