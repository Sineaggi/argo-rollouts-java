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
import io.argoproj.models.V1alpha1AwsResourceRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1alpha1ALBStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-19T21:57:47.017Z[Etc/UTC]")
public class V1alpha1ALBStatus {
  public static final String SERIALIZED_NAME_CANARY_TARGET_GROUP = "canaryTargetGroup";
  @SerializedName(SERIALIZED_NAME_CANARY_TARGET_GROUP)
  private V1alpha1AwsResourceRef canaryTargetGroup;

  public static final String SERIALIZED_NAME_LOAD_BALANCER = "loadBalancer";
  @SerializedName(SERIALIZED_NAME_LOAD_BALANCER)
  private V1alpha1AwsResourceRef loadBalancer;

  public static final String SERIALIZED_NAME_STABLE_TARGET_GROUP = "stableTargetGroup";
  @SerializedName(SERIALIZED_NAME_STABLE_TARGET_GROUP)
  private V1alpha1AwsResourceRef stableTargetGroup;


  public V1alpha1ALBStatus canaryTargetGroup(V1alpha1AwsResourceRef canaryTargetGroup) {
    
    this.canaryTargetGroup = canaryTargetGroup;
    return this;
  }

   /**
   * Get canaryTargetGroup
   * @return canaryTargetGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1AwsResourceRef getCanaryTargetGroup() {
    return canaryTargetGroup;
  }


  public void setCanaryTargetGroup(V1alpha1AwsResourceRef canaryTargetGroup) {
    this.canaryTargetGroup = canaryTargetGroup;
  }


  public V1alpha1ALBStatus loadBalancer(V1alpha1AwsResourceRef loadBalancer) {
    
    this.loadBalancer = loadBalancer;
    return this;
  }

   /**
   * Get loadBalancer
   * @return loadBalancer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1AwsResourceRef getLoadBalancer() {
    return loadBalancer;
  }


  public void setLoadBalancer(V1alpha1AwsResourceRef loadBalancer) {
    this.loadBalancer = loadBalancer;
  }


  public V1alpha1ALBStatus stableTargetGroup(V1alpha1AwsResourceRef stableTargetGroup) {
    
    this.stableTargetGroup = stableTargetGroup;
    return this;
  }

   /**
   * Get stableTargetGroup
   * @return stableTargetGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1AwsResourceRef getStableTargetGroup() {
    return stableTargetGroup;
  }


  public void setStableTargetGroup(V1alpha1AwsResourceRef stableTargetGroup) {
    this.stableTargetGroup = stableTargetGroup;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ALBStatus v1alpha1ALBStatus = (V1alpha1ALBStatus) o;
    return Objects.equals(this.canaryTargetGroup, v1alpha1ALBStatus.canaryTargetGroup) &&
        Objects.equals(this.loadBalancer, v1alpha1ALBStatus.loadBalancer) &&
        Objects.equals(this.stableTargetGroup, v1alpha1ALBStatus.stableTargetGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canaryTargetGroup, loadBalancer, stableTargetGroup);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ALBStatus {\n");
    sb.append("    canaryTargetGroup: ").append(toIndentedString(canaryTargetGroup)).append("\n");
    sb.append("    loadBalancer: ").append(toIndentedString(loadBalancer)).append("\n");
    sb.append("    stableTargetGroup: ").append(toIndentedString(stableTargetGroup)).append("\n");
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

