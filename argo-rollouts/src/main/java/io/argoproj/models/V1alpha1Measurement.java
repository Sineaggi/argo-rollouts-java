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
import java.time.OffsetDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Measurement is a point in time result value of a single metric, and the time it was measured
 */
@ApiModel(description = "Measurement is a point in time result value of a single metric, and the time it was measured")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-19T21:57:47.017Z[Etc/UTC]")
public class V1alpha1Measurement {
  public static final String SERIALIZED_NAME_FINISHED_AT = "finishedAt";
  @SerializedName(SERIALIZED_NAME_FINISHED_AT)
  private OffsetDateTime finishedAt = null;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;

  public static final String SERIALIZED_NAME_PHASE = "phase";
  @SerializedName(SERIALIZED_NAME_PHASE)
  private String phase = "";

  public static final String SERIALIZED_NAME_RESUME_AT = "resumeAt";
  @SerializedName(SERIALIZED_NAME_RESUME_AT)
  private OffsetDateTime resumeAt = null;

  public static final String SERIALIZED_NAME_STARTED_AT = "startedAt";
  @SerializedName(SERIALIZED_NAME_STARTED_AT)
  private OffsetDateTime startedAt = null;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;


  public V1alpha1Measurement finishedAt(OffsetDateTime finishedAt) {
    
    this.finishedAt = finishedAt;
    return this;
  }

   /**
   * Get finishedAt
   * @return finishedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getFinishedAt() {
    return finishedAt;
  }


  public void setFinishedAt(OffsetDateTime finishedAt) {
    this.finishedAt = finishedAt;
  }


  public V1alpha1Measurement message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Message contains a message describing current condition (e.g. error messages)
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Message contains a message describing current condition (e.g. error messages)")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public V1alpha1Measurement metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public V1alpha1Measurement putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Metadata stores additional metadata about this metric result, used by the different providers (e.g. kayenta run ID, job name)
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Metadata stores additional metadata about this metric result, used by the different providers (e.g. kayenta run ID, job name)")

  public Map<String, String> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public V1alpha1Measurement phase(String phase) {
    
    this.phase = phase;
    return this;
  }

   /**
   * Phase is the status of this single measurement
   * @return phase
  **/
  @ApiModelProperty(required = true, value = "Phase is the status of this single measurement")

  public String getPhase() {
    return phase;
  }


  public void setPhase(String phase) {
    this.phase = phase;
  }


  public V1alpha1Measurement resumeAt(OffsetDateTime resumeAt) {
    
    this.resumeAt = resumeAt;
    return this;
  }

   /**
   * Get resumeAt
   * @return resumeAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getResumeAt() {
    return resumeAt;
  }


  public void setResumeAt(OffsetDateTime resumeAt) {
    this.resumeAt = resumeAt;
  }


  public V1alpha1Measurement startedAt(OffsetDateTime startedAt) {
    
    this.startedAt = startedAt;
    return this;
  }

   /**
   * Get startedAt
   * @return startedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getStartedAt() {
    return startedAt;
  }


  public void setStartedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
  }


  public V1alpha1Measurement value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Value is the measured value of the metric
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Value is the measured value of the metric")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1Measurement v1alpha1Measurement = (V1alpha1Measurement) o;
    return Objects.equals(this.finishedAt, v1alpha1Measurement.finishedAt) &&
        Objects.equals(this.message, v1alpha1Measurement.message) &&
        Objects.equals(this.metadata, v1alpha1Measurement.metadata) &&
        Objects.equals(this.phase, v1alpha1Measurement.phase) &&
        Objects.equals(this.resumeAt, v1alpha1Measurement.resumeAt) &&
        Objects.equals(this.startedAt, v1alpha1Measurement.startedAt) &&
        Objects.equals(this.value, v1alpha1Measurement.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(finishedAt, message, metadata, phase, resumeAt, startedAt, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1Measurement {\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    resumeAt: ").append(toIndentedString(resumeAt)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

