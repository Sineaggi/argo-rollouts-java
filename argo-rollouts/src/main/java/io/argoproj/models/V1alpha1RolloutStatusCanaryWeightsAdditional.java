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
 * V1alpha1RolloutStatusCanaryWeightsAdditional
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-19T02:24:32.086Z[Etc/UTC]")
public class V1alpha1RolloutStatusCanaryWeightsAdditional {
  public static final String SERIALIZED_NAME_POD_TEMPLATE_HASH = "podTemplateHash";
  @SerializedName(SERIALIZED_NAME_POD_TEMPLATE_HASH)
  private String podTemplateHash;

  public static final String SERIALIZED_NAME_SERVICE_NAME = "serviceName";
  @SerializedName(SERIALIZED_NAME_SERVICE_NAME)
  private String serviceName;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private Integer weight;


  public V1alpha1RolloutStatusCanaryWeightsAdditional podTemplateHash(String podTemplateHash) {
    
    this.podTemplateHash = podTemplateHash;
    return this;
  }

   /**
   * Get podTemplateHash
   * @return podTemplateHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPodTemplateHash() {
    return podTemplateHash;
  }


  public void setPodTemplateHash(String podTemplateHash) {
    this.podTemplateHash = podTemplateHash;
  }


  public V1alpha1RolloutStatusCanaryWeightsAdditional serviceName(String serviceName) {
    
    this.serviceName = serviceName;
    return this;
  }

   /**
   * Get serviceName
   * @return serviceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getServiceName() {
    return serviceName;
  }


  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }


  public V1alpha1RolloutStatusCanaryWeightsAdditional weight(Integer weight) {
    
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @ApiModelProperty(required = true, value = "")

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
    V1alpha1RolloutStatusCanaryWeightsAdditional v1alpha1RolloutStatusCanaryWeightsAdditional = (V1alpha1RolloutStatusCanaryWeightsAdditional) o;
    return Objects.equals(this.podTemplateHash, v1alpha1RolloutStatusCanaryWeightsAdditional.podTemplateHash) &&
        Objects.equals(this.serviceName, v1alpha1RolloutStatusCanaryWeightsAdditional.serviceName) &&
        Objects.equals(this.weight, v1alpha1RolloutStatusCanaryWeightsAdditional.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(podTemplateHash, serviceName, weight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1RolloutStatusCanaryWeightsAdditional {\n");
    sb.append("    podTemplateHash: ").append(toIndentedString(podTemplateHash)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
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

