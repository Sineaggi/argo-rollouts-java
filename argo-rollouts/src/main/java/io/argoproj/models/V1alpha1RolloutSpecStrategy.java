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
import io.argoproj.models.V1alpha1RolloutSpecStrategyBlueGreen;
import io.argoproj.models.V1alpha1RolloutSpecStrategyCanary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1alpha1RolloutSpecStrategy
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-19T02:24:32.086Z[Etc/UTC]")
public class V1alpha1RolloutSpecStrategy {
  public static final String SERIALIZED_NAME_BLUE_GREEN = "blueGreen";
  @SerializedName(SERIALIZED_NAME_BLUE_GREEN)
  private V1alpha1RolloutSpecStrategyBlueGreen blueGreen;

  public static final String SERIALIZED_NAME_CANARY = "canary";
  @SerializedName(SERIALIZED_NAME_CANARY)
  private V1alpha1RolloutSpecStrategyCanary canary;


  public V1alpha1RolloutSpecStrategy blueGreen(V1alpha1RolloutSpecStrategyBlueGreen blueGreen) {
    
    this.blueGreen = blueGreen;
    return this;
  }

   /**
   * Get blueGreen
   * @return blueGreen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1RolloutSpecStrategyBlueGreen getBlueGreen() {
    return blueGreen;
  }


  public void setBlueGreen(V1alpha1RolloutSpecStrategyBlueGreen blueGreen) {
    this.blueGreen = blueGreen;
  }


  public V1alpha1RolloutSpecStrategy canary(V1alpha1RolloutSpecStrategyCanary canary) {
    
    this.canary = canary;
    return this;
  }

   /**
   * Get canary
   * @return canary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1RolloutSpecStrategyCanary getCanary() {
    return canary;
  }


  public void setCanary(V1alpha1RolloutSpecStrategyCanary canary) {
    this.canary = canary;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1RolloutSpecStrategy v1alpha1RolloutSpecStrategy = (V1alpha1RolloutSpecStrategy) o;
    return Objects.equals(this.blueGreen, v1alpha1RolloutSpecStrategy.blueGreen) &&
        Objects.equals(this.canary, v1alpha1RolloutSpecStrategy.canary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blueGreen, canary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1RolloutSpecStrategy {\n");
    sb.append("    blueGreen: ").append(toIndentedString(blueGreen)).append("\n");
    sb.append("    canary: ").append(toIndentedString(canary)).append("\n");
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
