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
 * SetCanaryScale defines how to scale the newRS without changing traffic weight
 */
@ApiModel(description = "SetCanaryScale defines how to scale the newRS without changing traffic weight")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-19T21:57:47.017Z[Etc/UTC]")
public class V1alpha1SetCanaryScale {
  public static final String SERIALIZED_NAME_MATCH_TRAFFIC_WEIGHT = "matchTrafficWeight";
  @SerializedName(SERIALIZED_NAME_MATCH_TRAFFIC_WEIGHT)
  private Boolean matchTrafficWeight;

  public static final String SERIALIZED_NAME_REPLICAS = "replicas";
  @SerializedName(SERIALIZED_NAME_REPLICAS)
  private Integer replicas;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private Integer weight;


  public V1alpha1SetCanaryScale matchTrafficWeight(Boolean matchTrafficWeight) {
    
    this.matchTrafficWeight = matchTrafficWeight;
    return this;
  }

   /**
   * MatchTrafficWeight cancels out previously set Replicas or Weight, effectively activating SetWeight
   * @return matchTrafficWeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MatchTrafficWeight cancels out previously set Replicas or Weight, effectively activating SetWeight")

  public Boolean getMatchTrafficWeight() {
    return matchTrafficWeight;
  }


  public void setMatchTrafficWeight(Boolean matchTrafficWeight) {
    this.matchTrafficWeight = matchTrafficWeight;
  }


  public V1alpha1SetCanaryScale replicas(Integer replicas) {
    
    this.replicas = replicas;
    return this;
  }

   /**
   * Replicas sets the number of replicas the newRS should have
   * @return replicas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Replicas sets the number of replicas the newRS should have")

  public Integer getReplicas() {
    return replicas;
  }


  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }


  public V1alpha1SetCanaryScale weight(Integer weight) {
    
    this.weight = weight;
    return this;
  }

   /**
   * Weight sets the percentage of replicas the newRS should have
   * @return weight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Weight sets the percentage of replicas the newRS should have")

  public Integer getWeight() {
    return weight;
  }


  public void setWeight(Integer weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1SetCanaryScale v1alpha1SetCanaryScale = (V1alpha1SetCanaryScale) o;
    return Objects.equals(this.matchTrafficWeight, v1alpha1SetCanaryScale.matchTrafficWeight) &&
        Objects.equals(this.replicas, v1alpha1SetCanaryScale.replicas) &&
        Objects.equals(this.weight, v1alpha1SetCanaryScale.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchTrafficWeight, replicas, weight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1SetCanaryScale {\n");
    sb.append("    matchTrafficWeight: ").append(toIndentedString(matchTrafficWeight)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
