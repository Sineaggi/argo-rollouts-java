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
 * V1alpha1RolloutSpecStrategyCanaryTrafficRoutingTraefik
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-19T02:24:32.086Z[Etc/UTC]")
public class V1alpha1RolloutSpecStrategyCanaryTrafficRoutingTraefik {
  public static final String SERIALIZED_NAME_WEIGHTED_TRAEFIK_SERVICE_NAME = "weightedTraefikServiceName";
  @SerializedName(SERIALIZED_NAME_WEIGHTED_TRAEFIK_SERVICE_NAME)
  private String weightedTraefikServiceName;


  public V1alpha1RolloutSpecStrategyCanaryTrafficRoutingTraefik weightedTraefikServiceName(String weightedTraefikServiceName) {
    
    this.weightedTraefikServiceName = weightedTraefikServiceName;
    return this;
  }

   /**
   * Get weightedTraefikServiceName
   * @return weightedTraefikServiceName
  **/
  @ApiModelProperty(required = true, value = "")

  public String getWeightedTraefikServiceName() {
    return weightedTraefikServiceName;
  }


  public void setWeightedTraefikServiceName(String weightedTraefikServiceName) {
    this.weightedTraefikServiceName = weightedTraefikServiceName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1RolloutSpecStrategyCanaryTrafficRoutingTraefik v1alpha1RolloutSpecStrategyCanaryTrafficRoutingTraefik = (V1alpha1RolloutSpecStrategyCanaryTrafficRoutingTraefik) o;
    return Objects.equals(this.weightedTraefikServiceName, v1alpha1RolloutSpecStrategyCanaryTrafficRoutingTraefik.weightedTraefikServiceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weightedTraefikServiceName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1RolloutSpecStrategyCanaryTrafficRoutingTraefik {\n");
    sb.append("    weightedTraefikServiceName: ").append(toIndentedString(weightedTraefikServiceName)).append("\n");
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
