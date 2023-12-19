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
import io.argoproj.models.IoK8sApimachineryPkgApisMetaV1Time;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ExperimentCondition describes the state of a experiment at a certain point.
 */
@ApiModel(description = "ExperimentCondition describes the state of a experiment at a certain point.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-19T21:57:47.017Z[Etc/UTC]")
public class V1alpha1ExperimentCondition {
  public static final String SERIALIZED_NAME_LAST_TRANSITION_TIME = "lastTransitionTime";
  @SerializedName(SERIALIZED_NAME_LAST_TRANSITION_TIME)
  private IoK8sApimachineryPkgApisMetaV1Time lastTransitionTime = null;

  public static final String SERIALIZED_NAME_LAST_UPDATE_TIME = "lastUpdateTime";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATE_TIME)
  private IoK8sApimachineryPkgApisMetaV1Time lastUpdateTime = null;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message = "";

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason = "";

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status = "";

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type = "";


  public V1alpha1ExperimentCondition lastTransitionTime(IoK8sApimachineryPkgApisMetaV1Time lastTransitionTime) {
    
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

   /**
   * Get lastTransitionTime
   * @return lastTransitionTime
  **/
  @ApiModelProperty(required = true, value = "")

  public IoK8sApimachineryPkgApisMetaV1Time getLastTransitionTime() {
    return lastTransitionTime;
  }


  public void setLastTransitionTime(IoK8sApimachineryPkgApisMetaV1Time lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
  }


  public V1alpha1ExperimentCondition lastUpdateTime(IoK8sApimachineryPkgApisMetaV1Time lastUpdateTime) {
    
    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

   /**
   * Get lastUpdateTime
   * @return lastUpdateTime
  **/
  @ApiModelProperty(required = true, value = "")

  public IoK8sApimachineryPkgApisMetaV1Time getLastUpdateTime() {
    return lastUpdateTime;
  }


  public void setLastUpdateTime(IoK8sApimachineryPkgApisMetaV1Time lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }


  public V1alpha1ExperimentCondition message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * A human readable message indicating details about the transition.
   * @return message
  **/
  @ApiModelProperty(required = true, value = "A human readable message indicating details about the transition.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public V1alpha1ExperimentCondition reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * The reason for the condition&#39;s last transition.
   * @return reason
  **/
  @ApiModelProperty(required = true, value = "The reason for the condition's last transition.")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public V1alpha1ExperimentCondition status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Phase of the condition, one of True, False, Unknown.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Phase of the condition, one of True, False, Unknown.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public V1alpha1ExperimentCondition type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of deployment condition.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of deployment condition.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ExperimentCondition v1alpha1ExperimentCondition = (V1alpha1ExperimentCondition) o;
    return Objects.equals(this.lastTransitionTime, v1alpha1ExperimentCondition.lastTransitionTime) &&
        Objects.equals(this.lastUpdateTime, v1alpha1ExperimentCondition.lastUpdateTime) &&
        Objects.equals(this.message, v1alpha1ExperimentCondition.message) &&
        Objects.equals(this.reason, v1alpha1ExperimentCondition.reason) &&
        Objects.equals(this.status, v1alpha1ExperimentCondition.status) &&
        Objects.equals(this.type, v1alpha1ExperimentCondition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastTransitionTime, lastUpdateTime, message, reason, status, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ExperimentCondition {\n");
    sb.append("    lastTransitionTime: ").append(toIndentedString(lastTransitionTime)).append("\n");
    sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
