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
import io.argoproj.models.V1alpha1Measurement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * MetricResult contain a list of the most recent measurements for a single metric along with counters on how often the measurement
 */
@ApiModel(description = "MetricResult contain a list of the most recent measurements for a single metric along with counters on how often the measurement")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-19T21:57:47.017Z[Etc/UTC]")
public class V1alpha1MetricResult {
  public static final String SERIALIZED_NAME_CONSECUTIVE_ERROR = "consecutiveError";
  @SerializedName(SERIALIZED_NAME_CONSECUTIVE_ERROR)
  private Integer consecutiveError;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_DRY_RUN = "dryRun";
  @SerializedName(SERIALIZED_NAME_DRY_RUN)
  private Boolean dryRun;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private Integer error;

  public static final String SERIALIZED_NAME_FAILED = "failed";
  @SerializedName(SERIALIZED_NAME_FAILED)
  private Integer failed;

  public static final String SERIALIZED_NAME_INCONCLUSIVE = "inconclusive";
  @SerializedName(SERIALIZED_NAME_INCONCLUSIVE)
  private Integer inconclusive;

  public static final String SERIALIZED_NAME_MEASUREMENTS = "measurements";
  @SerializedName(SERIALIZED_NAME_MEASUREMENTS)
  private List<V1alpha1Measurement> measurements = null;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = "";

  public static final String SERIALIZED_NAME_PHASE = "phase";
  @SerializedName(SERIALIZED_NAME_PHASE)
  private String phase = "";

  public static final String SERIALIZED_NAME_SUCCESSFUL = "successful";
  @SerializedName(SERIALIZED_NAME_SUCCESSFUL)
  private Integer successful;


  public V1alpha1MetricResult consecutiveError(Integer consecutiveError) {
    
    this.consecutiveError = consecutiveError;
    return this;
  }

   /**
   * ConsecutiveError is the number of times an error was encountered during measurement in succession Resets to zero when non-errors are encountered
   * @return consecutiveError
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ConsecutiveError is the number of times an error was encountered during measurement in succession Resets to zero when non-errors are encountered")

  public Integer getConsecutiveError() {
    return consecutiveError;
  }


  public void setConsecutiveError(Integer consecutiveError) {
    this.consecutiveError = consecutiveError;
  }


  public V1alpha1MetricResult count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * Count is the number of times the metric was measured without Error This is equal to the sum of Successful, Failed, Inconclusive
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Count is the number of times the metric was measured without Error This is equal to the sum of Successful, Failed, Inconclusive")

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  public V1alpha1MetricResult dryRun(Boolean dryRun) {
    
    this.dryRun = dryRun;
    return this;
  }

   /**
   * DryRun indicates whether this metric is running in a dry-run mode or not
   * @return dryRun
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DryRun indicates whether this metric is running in a dry-run mode or not")

  public Boolean getDryRun() {
    return dryRun;
  }


  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }


  public V1alpha1MetricResult error(Integer error) {
    
    this.error = error;
    return this;
  }

   /**
   * Error is the number of times an error was encountered during measurement
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Error is the number of times an error was encountered during measurement")

  public Integer getError() {
    return error;
  }


  public void setError(Integer error) {
    this.error = error;
  }


  public V1alpha1MetricResult failed(Integer failed) {
    
    this.failed = failed;
    return this;
  }

   /**
   * Failed is the number of times the metric was measured Failed
   * @return failed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Failed is the number of times the metric was measured Failed")

  public Integer getFailed() {
    return failed;
  }


  public void setFailed(Integer failed) {
    this.failed = failed;
  }


  public V1alpha1MetricResult inconclusive(Integer inconclusive) {
    
    this.inconclusive = inconclusive;
    return this;
  }

   /**
   * Inconclusive is the number of times the metric was measured Inconclusive
   * @return inconclusive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Inconclusive is the number of times the metric was measured Inconclusive")

  public Integer getInconclusive() {
    return inconclusive;
  }


  public void setInconclusive(Integer inconclusive) {
    this.inconclusive = inconclusive;
  }


  public V1alpha1MetricResult measurements(List<V1alpha1Measurement> measurements) {
    
    this.measurements = measurements;
    return this;
  }

  public V1alpha1MetricResult addMeasurementsItem(V1alpha1Measurement measurementsItem) {
    if (this.measurements == null) {
      this.measurements = new ArrayList<>();
    }
    this.measurements.add(measurementsItem);
    return this;
  }

   /**
   * Measurements holds the most recent measurements collected for the metric
   * @return measurements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Measurements holds the most recent measurements collected for the metric")

  public List<V1alpha1Measurement> getMeasurements() {
    return measurements;
  }


  public void setMeasurements(List<V1alpha1Measurement> measurements) {
    this.measurements = measurements;
  }


  public V1alpha1MetricResult message(String message) {
    
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


  public V1alpha1MetricResult metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public V1alpha1MetricResult putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Metadata stores additional metadata about this metric. It is used by different providers to store the final state which gets used while taking measurements. For example, Prometheus uses this field to store the final resolved query after substituting the template arguments.
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Metadata stores additional metadata about this metric. It is used by different providers to store the final state which gets used while taking measurements. For example, Prometheus uses this field to store the final resolved query after substituting the template arguments.")

  public Map<String, String> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public V1alpha1MetricResult name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name is the name of the metric
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name is the name of the metric")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha1MetricResult phase(String phase) {
    
    this.phase = phase;
    return this;
  }

   /**
   * Phase is the overall aggregate status of the metric
   * @return phase
  **/
  @ApiModelProperty(required = true, value = "Phase is the overall aggregate status of the metric")

  public String getPhase() {
    return phase;
  }


  public void setPhase(String phase) {
    this.phase = phase;
  }


  public V1alpha1MetricResult successful(Integer successful) {
    
    this.successful = successful;
    return this;
  }

   /**
   * Successful is the number of times the metric was measured Successful
   * @return successful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Successful is the number of times the metric was measured Successful")

  public Integer getSuccessful() {
    return successful;
  }


  public void setSuccessful(Integer successful) {
    this.successful = successful;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1MetricResult v1alpha1MetricResult = (V1alpha1MetricResult) o;
    return Objects.equals(this.consecutiveError, v1alpha1MetricResult.consecutiveError) &&
        Objects.equals(this.count, v1alpha1MetricResult.count) &&
        Objects.equals(this.dryRun, v1alpha1MetricResult.dryRun) &&
        Objects.equals(this.error, v1alpha1MetricResult.error) &&
        Objects.equals(this.failed, v1alpha1MetricResult.failed) &&
        Objects.equals(this.inconclusive, v1alpha1MetricResult.inconclusive) &&
        Objects.equals(this.measurements, v1alpha1MetricResult.measurements) &&
        Objects.equals(this.message, v1alpha1MetricResult.message) &&
        Objects.equals(this.metadata, v1alpha1MetricResult.metadata) &&
        Objects.equals(this.name, v1alpha1MetricResult.name) &&
        Objects.equals(this.phase, v1alpha1MetricResult.phase) &&
        Objects.equals(this.successful, v1alpha1MetricResult.successful);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consecutiveError, count, dryRun, error, failed, inconclusive, measurements, message, metadata, name, phase, successful);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1MetricResult {\n");
    sb.append("    consecutiveError: ").append(toIndentedString(consecutiveError)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    inconclusive: ").append(toIndentedString(inconclusive)).append("\n");
    sb.append("    measurements: ").append(toIndentedString(measurements)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
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

