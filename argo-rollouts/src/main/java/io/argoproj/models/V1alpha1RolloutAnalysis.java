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
import io.argoproj.models.V1alpha1AnalysisRunArgument;
import io.argoproj.models.V1alpha1DryRun;
import io.argoproj.models.V1alpha1MeasurementRetention;
import io.argoproj.models.V1alpha1RolloutAnalysisTemplate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * RolloutAnalysis defines a template that is used to create a analysisRun
 */
@ApiModel(description = "RolloutAnalysis defines a template that is used to create a analysisRun")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-19T21:57:47.017Z[Etc/UTC]")
public class V1alpha1RolloutAnalysis {
  public static final String SERIALIZED_NAME_ARGS = "args";
  @SerializedName(SERIALIZED_NAME_ARGS)
  private List<V1alpha1AnalysisRunArgument> args = null;

  public static final String SERIALIZED_NAME_DRY_RUN = "dryRun";
  @SerializedName(SERIALIZED_NAME_DRY_RUN)
  private List<V1alpha1DryRun> dryRun = null;

  public static final String SERIALIZED_NAME_MEASUREMENT_RETENTION = "measurementRetention";
  @SerializedName(SERIALIZED_NAME_MEASUREMENT_RETENTION)
  private List<V1alpha1MeasurementRetention> measurementRetention = null;

  public static final String SERIALIZED_NAME_TEMPLATES = "templates";
  @SerializedName(SERIALIZED_NAME_TEMPLATES)
  private List<V1alpha1RolloutAnalysisTemplate> templates = null;


  public V1alpha1RolloutAnalysis args(List<V1alpha1AnalysisRunArgument> args) {
    
    this.args = args;
    return this;
  }

  public V1alpha1RolloutAnalysis addArgsItem(V1alpha1AnalysisRunArgument argsItem) {
    if (this.args == null) {
      this.args = new ArrayList<>();
    }
    this.args.add(argsItem);
    return this;
  }

   /**
   * Args the arguments that will be added to the AnalysisRuns
   * @return args
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Args the arguments that will be added to the AnalysisRuns")

  public List<V1alpha1AnalysisRunArgument> getArgs() {
    return args;
  }


  public void setArgs(List<V1alpha1AnalysisRunArgument> args) {
    this.args = args;
  }


  public V1alpha1RolloutAnalysis dryRun(List<V1alpha1DryRun> dryRun) {
    
    this.dryRun = dryRun;
    return this;
  }

  public V1alpha1RolloutAnalysis addDryRunItem(V1alpha1DryRun dryRunItem) {
    if (this.dryRun == null) {
      this.dryRun = new ArrayList<>();
    }
    this.dryRun.add(dryRunItem);
    return this;
  }

   /**
   * DryRun object contains the settings for running the analysis in Dry-Run mode
   * @return dryRun
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DryRun object contains the settings for running the analysis in Dry-Run mode")

  public List<V1alpha1DryRun> getDryRun() {
    return dryRun;
  }


  public void setDryRun(List<V1alpha1DryRun> dryRun) {
    this.dryRun = dryRun;
  }


  public V1alpha1RolloutAnalysis measurementRetention(List<V1alpha1MeasurementRetention> measurementRetention) {
    
    this.measurementRetention = measurementRetention;
    return this;
  }

  public V1alpha1RolloutAnalysis addMeasurementRetentionItem(V1alpha1MeasurementRetention measurementRetentionItem) {
    if (this.measurementRetention == null) {
      this.measurementRetention = new ArrayList<>();
    }
    this.measurementRetention.add(measurementRetentionItem);
    return this;
  }

   /**
   * MeasurementRetention object contains the settings for retaining the number of measurements during the analysis
   * @return measurementRetention
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MeasurementRetention object contains the settings for retaining the number of measurements during the analysis")

  public List<V1alpha1MeasurementRetention> getMeasurementRetention() {
    return measurementRetention;
  }


  public void setMeasurementRetention(List<V1alpha1MeasurementRetention> measurementRetention) {
    this.measurementRetention = measurementRetention;
  }


  public V1alpha1RolloutAnalysis templates(List<V1alpha1RolloutAnalysisTemplate> templates) {
    
    this.templates = templates;
    return this;
  }

  public V1alpha1RolloutAnalysis addTemplatesItem(V1alpha1RolloutAnalysisTemplate templatesItem) {
    if (this.templates == null) {
      this.templates = new ArrayList<>();
    }
    this.templates.add(templatesItem);
    return this;
  }

   /**
   * Templates reference to a list of analysis templates to combine for an AnalysisRun
   * @return templates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Templates reference to a list of analysis templates to combine for an AnalysisRun")

  public List<V1alpha1RolloutAnalysisTemplate> getTemplates() {
    return templates;
  }


  public void setTemplates(List<V1alpha1RolloutAnalysisTemplate> templates) {
    this.templates = templates;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1RolloutAnalysis v1alpha1RolloutAnalysis = (V1alpha1RolloutAnalysis) o;
    return Objects.equals(this.args, v1alpha1RolloutAnalysis.args) &&
        Objects.equals(this.dryRun, v1alpha1RolloutAnalysis.dryRun) &&
        Objects.equals(this.measurementRetention, v1alpha1RolloutAnalysis.measurementRetention) &&
        Objects.equals(this.templates, v1alpha1RolloutAnalysis.templates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(args, dryRun, measurementRetention, templates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1RolloutAnalysis {\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    measurementRetention: ").append(toIndentedString(measurementRetention)).append("\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
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

