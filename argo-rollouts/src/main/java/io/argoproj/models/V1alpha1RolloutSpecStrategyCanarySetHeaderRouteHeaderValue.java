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
 * V1alpha1RolloutSpecStrategyCanarySetHeaderRouteHeaderValue
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-19T02:24:32.086Z[Etc/UTC]")
public class V1alpha1RolloutSpecStrategyCanarySetHeaderRouteHeaderValue {
  public static final String SERIALIZED_NAME_EXACT = "exact";
  @SerializedName(SERIALIZED_NAME_EXACT)
  private String exact;

  public static final String SERIALIZED_NAME_PREFIX = "prefix";
  @SerializedName(SERIALIZED_NAME_PREFIX)
  private String prefix;

  public static final String SERIALIZED_NAME_REGEX = "regex";
  @SerializedName(SERIALIZED_NAME_REGEX)
  private String regex;


  public V1alpha1RolloutSpecStrategyCanarySetHeaderRouteHeaderValue exact(String exact) {
    
    this.exact = exact;
    return this;
  }

   /**
   * Get exact
   * @return exact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExact() {
    return exact;
  }


  public void setExact(String exact) {
    this.exact = exact;
  }


  public V1alpha1RolloutSpecStrategyCanarySetHeaderRouteHeaderValue prefix(String prefix) {
    
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


  public V1alpha1RolloutSpecStrategyCanarySetHeaderRouteHeaderValue regex(String regex) {
    
    this.regex = regex;
    return this;
  }

   /**
   * Get regex
   * @return regex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRegex() {
    return regex;
  }


  public void setRegex(String regex) {
    this.regex = regex;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1RolloutSpecStrategyCanarySetHeaderRouteHeaderValue v1alpha1RolloutSpecStrategyCanarySetHeaderRouteHeaderValue = (V1alpha1RolloutSpecStrategyCanarySetHeaderRouteHeaderValue) o;
    return Objects.equals(this.exact, v1alpha1RolloutSpecStrategyCanarySetHeaderRouteHeaderValue.exact) &&
        Objects.equals(this.prefix, v1alpha1RolloutSpecStrategyCanarySetHeaderRouteHeaderValue.prefix) &&
        Objects.equals(this.regex, v1alpha1RolloutSpecStrategyCanarySetHeaderRouteHeaderValue.regex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exact, prefix, regex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1RolloutSpecStrategyCanarySetHeaderRouteHeaderValue {\n");
    sb.append("    exact: ").append(toIndentedString(exact)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
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

