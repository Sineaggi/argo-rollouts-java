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
import io.argoproj.models.V1alpha1WeightDestination;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TrafficWeights describes the current status of how traffic has been split
 */
@ApiModel(description = "TrafficWeights describes the current status of how traffic has been split")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-19T21:57:47.017Z[Etc/UTC]")
public class V1alpha1TrafficWeights {
  public static final String SERIALIZED_NAME_ADDITIONAL = "additional";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL)
  private List<V1alpha1WeightDestination> additional = null;

  public static final String SERIALIZED_NAME_CANARY = "canary";
  @SerializedName(SERIALIZED_NAME_CANARY)
  private V1alpha1WeightDestination canary;

  public static final String SERIALIZED_NAME_STABLE = "stable";
  @SerializedName(SERIALIZED_NAME_STABLE)
  private V1alpha1WeightDestination stable;

  public static final String SERIALIZED_NAME_VERIFIED = "verified";
  @SerializedName(SERIALIZED_NAME_VERIFIED)
  private Boolean verified;


  public V1alpha1TrafficWeights additional(List<V1alpha1WeightDestination> additional) {
    
    this.additional = additional;
    return this;
  }

  public V1alpha1TrafficWeights addAdditionalItem(V1alpha1WeightDestination additionalItem) {
    if (this.additional == null) {
      this.additional = new ArrayList<>();
    }
    this.additional.add(additionalItem);
    return this;
  }

   /**
   * Additional holds the weights split to additional ReplicaSets such as experiment ReplicaSets
   * @return additional
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional holds the weights split to additional ReplicaSets such as experiment ReplicaSets")

  public List<V1alpha1WeightDestination> getAdditional() {
    return additional;
  }


  public void setAdditional(List<V1alpha1WeightDestination> additional) {
    this.additional = additional;
  }


  public V1alpha1TrafficWeights canary(V1alpha1WeightDestination canary) {
    
    this.canary = canary;
    return this;
  }

   /**
   * Get canary
   * @return canary
  **/
  @ApiModelProperty(required = true, value = "")

  public V1alpha1WeightDestination getCanary() {
    return canary;
  }


  public void setCanary(V1alpha1WeightDestination canary) {
    this.canary = canary;
  }


  public V1alpha1TrafficWeights stable(V1alpha1WeightDestination stable) {
    
    this.stable = stable;
    return this;
  }

   /**
   * Get stable
   * @return stable
  **/
  @ApiModelProperty(required = true, value = "")

  public V1alpha1WeightDestination getStable() {
    return stable;
  }


  public void setStable(V1alpha1WeightDestination stable) {
    this.stable = stable;
  }


  public V1alpha1TrafficWeights verified(Boolean verified) {
    
    this.verified = verified;
    return this;
  }

   /**
   * Verified is an optional indicator that the weight has been verified to have taken effect. This is currently only applicable to ALB traffic router
   * @return verified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Verified is an optional indicator that the weight has been verified to have taken effect. This is currently only applicable to ALB traffic router")

  public Boolean getVerified() {
    return verified;
  }


  public void setVerified(Boolean verified) {
    this.verified = verified;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1TrafficWeights v1alpha1TrafficWeights = (V1alpha1TrafficWeights) o;
    return Objects.equals(this.additional, v1alpha1TrafficWeights.additional) &&
        Objects.equals(this.canary, v1alpha1TrafficWeights.canary) &&
        Objects.equals(this.stable, v1alpha1TrafficWeights.stable) &&
        Objects.equals(this.verified, v1alpha1TrafficWeights.verified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additional, canary, stable, verified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1TrafficWeights {\n");
    sb.append("    additional: ").append(toIndentedString(additional)).append("\n");
    sb.append("    canary: ").append(toIndentedString(canary)).append("\n");
    sb.append("    stable: ").append(toIndentedString(stable)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
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

