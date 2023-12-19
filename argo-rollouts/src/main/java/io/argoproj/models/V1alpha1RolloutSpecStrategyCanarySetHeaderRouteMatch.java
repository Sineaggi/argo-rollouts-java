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
import io.argoproj.models.V1alpha1RolloutSpecStrategyCanarySetHeaderRouteHeaderValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1alpha1RolloutSpecStrategyCanarySetHeaderRouteMatch
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-19T02:24:32.086Z[Etc/UTC]")
public class V1alpha1RolloutSpecStrategyCanarySetHeaderRouteMatch {
  public static final String SERIALIZED_NAME_HEADER_NAME = "headerName";
  @SerializedName(SERIALIZED_NAME_HEADER_NAME)
  private String headerName;

  public static final String SERIALIZED_NAME_HEADER_VALUE = "headerValue";
  @SerializedName(SERIALIZED_NAME_HEADER_VALUE)
  private V1alpha1RolloutSpecStrategyCanarySetHeaderRouteHeaderValue headerValue;


  public V1alpha1RolloutSpecStrategyCanarySetHeaderRouteMatch headerName(String headerName) {
    
    this.headerName = headerName;
    return this;
  }

   /**
   * Get headerName
   * @return headerName
  **/
  @ApiModelProperty(required = true, value = "")

  public String getHeaderName() {
    return headerName;
  }


  public void setHeaderName(String headerName) {
    this.headerName = headerName;
  }


  public V1alpha1RolloutSpecStrategyCanarySetHeaderRouteMatch headerValue(V1alpha1RolloutSpecStrategyCanarySetHeaderRouteHeaderValue headerValue) {
    
    this.headerValue = headerValue;
    return this;
  }

   /**
   * Get headerValue
   * @return headerValue
  **/
  @ApiModelProperty(required = true, value = "")

  public V1alpha1RolloutSpecStrategyCanarySetHeaderRouteHeaderValue getHeaderValue() {
    return headerValue;
  }


  public void setHeaderValue(V1alpha1RolloutSpecStrategyCanarySetHeaderRouteHeaderValue headerValue) {
    this.headerValue = headerValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1RolloutSpecStrategyCanarySetHeaderRouteMatch v1alpha1RolloutSpecStrategyCanarySetHeaderRouteMatch = (V1alpha1RolloutSpecStrategyCanarySetHeaderRouteMatch) o;
    return Objects.equals(this.headerName, v1alpha1RolloutSpecStrategyCanarySetHeaderRouteMatch.headerName) &&
        Objects.equals(this.headerValue, v1alpha1RolloutSpecStrategyCanarySetHeaderRouteMatch.headerValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headerName, headerValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1RolloutSpecStrategyCanarySetHeaderRouteMatch {\n");
    sb.append("    headerName: ").append(toIndentedString(headerName)).append("\n");
    sb.append("    headerValue: ").append(toIndentedString(headerValue)).append("\n");
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

