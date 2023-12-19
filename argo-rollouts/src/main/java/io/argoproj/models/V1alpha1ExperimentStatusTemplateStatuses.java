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
import java.time.OffsetDateTime;

/**
 * V1alpha1ExperimentStatusTemplateStatuses
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-19T02:24:32.086Z[Etc/UTC]")
public class V1alpha1ExperimentStatusTemplateStatuses {
  public static final String SERIALIZED_NAME_AVAILABLE_REPLICAS = "availableReplicas";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_REPLICAS)
  private Integer availableReplicas;

  public static final String SERIALIZED_NAME_COLLISION_COUNT = "collisionCount";
  @SerializedName(SERIALIZED_NAME_COLLISION_COUNT)
  private Integer collisionCount;

  public static final String SERIALIZED_NAME_LAST_TRANSITION_TIME = "lastTransitionTime";
  @SerializedName(SERIALIZED_NAME_LAST_TRANSITION_TIME)
  private OffsetDateTime lastTransitionTime;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_POD_TEMPLATE_HASH = "podTemplateHash";
  @SerializedName(SERIALIZED_NAME_POD_TEMPLATE_HASH)
  private String podTemplateHash;

  public static final String SERIALIZED_NAME_READY_REPLICAS = "readyReplicas";
  @SerializedName(SERIALIZED_NAME_READY_REPLICAS)
  private Integer readyReplicas;

  public static final String SERIALIZED_NAME_REPLICAS = "replicas";
  @SerializedName(SERIALIZED_NAME_REPLICAS)
  private Integer replicas;

  public static final String SERIALIZED_NAME_SERVICE_NAME = "serviceName";
  @SerializedName(SERIALIZED_NAME_SERVICE_NAME)
  private String serviceName;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_UPDATED_REPLICAS = "updatedReplicas";
  @SerializedName(SERIALIZED_NAME_UPDATED_REPLICAS)
  private Integer updatedReplicas;


  public V1alpha1ExperimentStatusTemplateStatuses availableReplicas(Integer availableReplicas) {
    
    this.availableReplicas = availableReplicas;
    return this;
  }

   /**
   * Get availableReplicas
   * @return availableReplicas
  **/
  @ApiModelProperty(required = true, value = "")

  public Integer getAvailableReplicas() {
    return availableReplicas;
  }


  public void setAvailableReplicas(Integer availableReplicas) {
    this.availableReplicas = availableReplicas;
  }


  public V1alpha1ExperimentStatusTemplateStatuses collisionCount(Integer collisionCount) {
    
    this.collisionCount = collisionCount;
    return this;
  }

   /**
   * Get collisionCount
   * @return collisionCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCollisionCount() {
    return collisionCount;
  }


  public void setCollisionCount(Integer collisionCount) {
    this.collisionCount = collisionCount;
  }


  public V1alpha1ExperimentStatusTemplateStatuses lastTransitionTime(OffsetDateTime lastTransitionTime) {
    
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

   /**
   * Get lastTransitionTime
   * @return lastTransitionTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getLastTransitionTime() {
    return lastTransitionTime;
  }


  public void setLastTransitionTime(OffsetDateTime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
  }


  public V1alpha1ExperimentStatusTemplateStatuses message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public V1alpha1ExperimentStatusTemplateStatuses name(String name) {
    
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


  public V1alpha1ExperimentStatusTemplateStatuses podTemplateHash(String podTemplateHash) {
    
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


  public V1alpha1ExperimentStatusTemplateStatuses readyReplicas(Integer readyReplicas) {
    
    this.readyReplicas = readyReplicas;
    return this;
  }

   /**
   * Get readyReplicas
   * @return readyReplicas
  **/
  @ApiModelProperty(required = true, value = "")

  public Integer getReadyReplicas() {
    return readyReplicas;
  }


  public void setReadyReplicas(Integer readyReplicas) {
    this.readyReplicas = readyReplicas;
  }


  public V1alpha1ExperimentStatusTemplateStatuses replicas(Integer replicas) {
    
    this.replicas = replicas;
    return this;
  }

   /**
   * Get replicas
   * @return replicas
  **/
  @ApiModelProperty(required = true, value = "")

  public Integer getReplicas() {
    return replicas;
  }


  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }


  public V1alpha1ExperimentStatusTemplateStatuses serviceName(String serviceName) {
    
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


  public V1alpha1ExperimentStatusTemplateStatuses status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public V1alpha1ExperimentStatusTemplateStatuses updatedReplicas(Integer updatedReplicas) {
    
    this.updatedReplicas = updatedReplicas;
    return this;
  }

   /**
   * Get updatedReplicas
   * @return updatedReplicas
  **/
  @ApiModelProperty(required = true, value = "")

  public Integer getUpdatedReplicas() {
    return updatedReplicas;
  }


  public void setUpdatedReplicas(Integer updatedReplicas) {
    this.updatedReplicas = updatedReplicas;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ExperimentStatusTemplateStatuses v1alpha1ExperimentStatusTemplateStatuses = (V1alpha1ExperimentStatusTemplateStatuses) o;
    return Objects.equals(this.availableReplicas, v1alpha1ExperimentStatusTemplateStatuses.availableReplicas) &&
        Objects.equals(this.collisionCount, v1alpha1ExperimentStatusTemplateStatuses.collisionCount) &&
        Objects.equals(this.lastTransitionTime, v1alpha1ExperimentStatusTemplateStatuses.lastTransitionTime) &&
        Objects.equals(this.message, v1alpha1ExperimentStatusTemplateStatuses.message) &&
        Objects.equals(this.name, v1alpha1ExperimentStatusTemplateStatuses.name) &&
        Objects.equals(this.podTemplateHash, v1alpha1ExperimentStatusTemplateStatuses.podTemplateHash) &&
        Objects.equals(this.readyReplicas, v1alpha1ExperimentStatusTemplateStatuses.readyReplicas) &&
        Objects.equals(this.replicas, v1alpha1ExperimentStatusTemplateStatuses.replicas) &&
        Objects.equals(this.serviceName, v1alpha1ExperimentStatusTemplateStatuses.serviceName) &&
        Objects.equals(this.status, v1alpha1ExperimentStatusTemplateStatuses.status) &&
        Objects.equals(this.updatedReplicas, v1alpha1ExperimentStatusTemplateStatuses.updatedReplicas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableReplicas, collisionCount, lastTransitionTime, message, name, podTemplateHash, readyReplicas, replicas, serviceName, status, updatedReplicas);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ExperimentStatusTemplateStatuses {\n");
    sb.append("    availableReplicas: ").append(toIndentedString(availableReplicas)).append("\n");
    sb.append("    collisionCount: ").append(toIndentedString(collisionCount)).append("\n");
    sb.append("    lastTransitionTime: ").append(toIndentedString(lastTransitionTime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    podTemplateHash: ").append(toIndentedString(podTemplateHash)).append("\n");
    sb.append("    readyReplicas: ").append(toIndentedString(readyReplicas)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedReplicas: ").append(toIndentedString(updatedReplicas)).append("\n");
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

