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
import io.argoproj.models.V1alpha1ExperimentStatusAnalysisRuns;
import io.argoproj.models.V1alpha1ExperimentStatusTemplateStatuses;
import io.argoproj.models.V1alpha1RolloutStatusConditions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * V1alpha1ExperimentStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-19T02:24:32.086Z[Etc/UTC]")
public class V1alpha1ExperimentStatus {
  public static final String SERIALIZED_NAME_ANALYSIS_RUNS = "analysisRuns";
  @SerializedName(SERIALIZED_NAME_ANALYSIS_RUNS)
  private List<V1alpha1ExperimentStatusAnalysisRuns> analysisRuns = null;

  public static final String SERIALIZED_NAME_AVAILABLE_AT = "availableAt";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_AT)
  private OffsetDateTime availableAt;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1alpha1RolloutStatusConditions> conditions = null;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_PHASE = "phase";
  @SerializedName(SERIALIZED_NAME_PHASE)
  private String phase;

  public static final String SERIALIZED_NAME_TEMPLATE_STATUSES = "templateStatuses";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_STATUSES)
  private List<V1alpha1ExperimentStatusTemplateStatuses> templateStatuses = null;


  public V1alpha1ExperimentStatus analysisRuns(List<V1alpha1ExperimentStatusAnalysisRuns> analysisRuns) {
    
    this.analysisRuns = analysisRuns;
    return this;
  }

  public V1alpha1ExperimentStatus addAnalysisRunsItem(V1alpha1ExperimentStatusAnalysisRuns analysisRunsItem) {
    if (this.analysisRuns == null) {
      this.analysisRuns = new ArrayList<>();
    }
    this.analysisRuns.add(analysisRunsItem);
    return this;
  }

   /**
   * Get analysisRuns
   * @return analysisRuns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1alpha1ExperimentStatusAnalysisRuns> getAnalysisRuns() {
    return analysisRuns;
  }


  public void setAnalysisRuns(List<V1alpha1ExperimentStatusAnalysisRuns> analysisRuns) {
    this.analysisRuns = analysisRuns;
  }


  public V1alpha1ExperimentStatus availableAt(OffsetDateTime availableAt) {
    
    this.availableAt = availableAt;
    return this;
  }

   /**
   * Get availableAt
   * @return availableAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getAvailableAt() {
    return availableAt;
  }


  public void setAvailableAt(OffsetDateTime availableAt) {
    this.availableAt = availableAt;
  }


  public V1alpha1ExperimentStatus conditions(List<V1alpha1RolloutStatusConditions> conditions) {
    
    this.conditions = conditions;
    return this;
  }

  public V1alpha1ExperimentStatus addConditionsItem(V1alpha1RolloutStatusConditions conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Get conditions
   * @return conditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1alpha1RolloutStatusConditions> getConditions() {
    return conditions;
  }


  public void setConditions(List<V1alpha1RolloutStatusConditions> conditions) {
    this.conditions = conditions;
  }


  public V1alpha1ExperimentStatus message(String message) {
    
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


  public V1alpha1ExperimentStatus phase(String phase) {
    
    this.phase = phase;
    return this;
  }

   /**
   * Get phase
   * @return phase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPhase() {
    return phase;
  }


  public void setPhase(String phase) {
    this.phase = phase;
  }


  public V1alpha1ExperimentStatus templateStatuses(List<V1alpha1ExperimentStatusTemplateStatuses> templateStatuses) {
    
    this.templateStatuses = templateStatuses;
    return this;
  }

  public V1alpha1ExperimentStatus addTemplateStatusesItem(V1alpha1ExperimentStatusTemplateStatuses templateStatusesItem) {
    if (this.templateStatuses == null) {
      this.templateStatuses = new ArrayList<>();
    }
    this.templateStatuses.add(templateStatusesItem);
    return this;
  }

   /**
   * Get templateStatuses
   * @return templateStatuses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1alpha1ExperimentStatusTemplateStatuses> getTemplateStatuses() {
    return templateStatuses;
  }


  public void setTemplateStatuses(List<V1alpha1ExperimentStatusTemplateStatuses> templateStatuses) {
    this.templateStatuses = templateStatuses;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ExperimentStatus v1alpha1ExperimentStatus = (V1alpha1ExperimentStatus) o;
    return Objects.equals(this.analysisRuns, v1alpha1ExperimentStatus.analysisRuns) &&
        Objects.equals(this.availableAt, v1alpha1ExperimentStatus.availableAt) &&
        Objects.equals(this.conditions, v1alpha1ExperimentStatus.conditions) &&
        Objects.equals(this.message, v1alpha1ExperimentStatus.message) &&
        Objects.equals(this.phase, v1alpha1ExperimentStatus.phase) &&
        Objects.equals(this.templateStatuses, v1alpha1ExperimentStatus.templateStatuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analysisRuns, availableAt, conditions, message, phase, templateStatuses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ExperimentStatus {\n");
    sb.append("    analysisRuns: ").append(toIndentedString(analysisRuns)).append("\n");
    sb.append("    availableAt: ").append(toIndentedString(availableAt)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    templateStatuses: ").append(toIndentedString(templateStatuses)).append("\n");
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
