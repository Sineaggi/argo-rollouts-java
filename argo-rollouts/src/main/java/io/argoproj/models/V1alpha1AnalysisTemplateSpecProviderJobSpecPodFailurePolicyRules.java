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
import io.argoproj.models.V1alpha1AnalysisTemplateSpecProviderJobSpecPodFailurePolicyOnExitCodes;
import io.argoproj.models.V1alpha1AnalysisTemplateSpecProviderJobSpecPodFailurePolicyOnPodConditions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * V1alpha1AnalysisTemplateSpecProviderJobSpecPodFailurePolicyRules
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-19T02:24:32.086Z[Etc/UTC]")
public class V1alpha1AnalysisTemplateSpecProviderJobSpecPodFailurePolicyRules {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_ON_EXIT_CODES = "onExitCodes";
  @SerializedName(SERIALIZED_NAME_ON_EXIT_CODES)
  private V1alpha1AnalysisTemplateSpecProviderJobSpecPodFailurePolicyOnExitCodes onExitCodes;

  public static final String SERIALIZED_NAME_ON_POD_CONDITIONS = "onPodConditions";
  @SerializedName(SERIALIZED_NAME_ON_POD_CONDITIONS)
  private List<V1alpha1AnalysisTemplateSpecProviderJobSpecPodFailurePolicyOnPodConditions> onPodConditions = new ArrayList<>();


  public V1alpha1AnalysisTemplateSpecProviderJobSpecPodFailurePolicyRules action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @ApiModelProperty(required = true, value = "")

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public V1alpha1AnalysisTemplateSpecProviderJobSpecPodFailurePolicyRules onExitCodes(V1alpha1AnalysisTemplateSpecProviderJobSpecPodFailurePolicyOnExitCodes onExitCodes) {
    
    this.onExitCodes = onExitCodes;
    return this;
  }

   /**
   * Get onExitCodes
   * @return onExitCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1AnalysisTemplateSpecProviderJobSpecPodFailurePolicyOnExitCodes getOnExitCodes() {
    return onExitCodes;
  }


  public void setOnExitCodes(V1alpha1AnalysisTemplateSpecProviderJobSpecPodFailurePolicyOnExitCodes onExitCodes) {
    this.onExitCodes = onExitCodes;
  }


  public V1alpha1AnalysisTemplateSpecProviderJobSpecPodFailurePolicyRules onPodConditions(List<V1alpha1AnalysisTemplateSpecProviderJobSpecPodFailurePolicyOnPodConditions> onPodConditions) {
    
    this.onPodConditions = onPodConditions;
    return this;
  }

  public V1alpha1AnalysisTemplateSpecProviderJobSpecPodFailurePolicyRules addOnPodConditionsItem(V1alpha1AnalysisTemplateSpecProviderJobSpecPodFailurePolicyOnPodConditions onPodConditionsItem) {
    this.onPodConditions.add(onPodConditionsItem);
    return this;
  }

   /**
   * Get onPodConditions
   * @return onPodConditions
  **/
  @ApiModelProperty(required = true, value = "")

  public List<V1alpha1AnalysisTemplateSpecProviderJobSpecPodFailurePolicyOnPodConditions> getOnPodConditions() {
    return onPodConditions;
  }


  public void setOnPodConditions(List<V1alpha1AnalysisTemplateSpecProviderJobSpecPodFailurePolicyOnPodConditions> onPodConditions) {
    this.onPodConditions = onPodConditions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1AnalysisTemplateSpecProviderJobSpecPodFailurePolicyRules v1alpha1AnalysisTemplateSpecProviderJobSpecPodFailurePolicyRules = (V1alpha1AnalysisTemplateSpecProviderJobSpecPodFailurePolicyRules) o;
    return Objects.equals(this.action, v1alpha1AnalysisTemplateSpecProviderJobSpecPodFailurePolicyRules.action) &&
        Objects.equals(this.onExitCodes, v1alpha1AnalysisTemplateSpecProviderJobSpecPodFailurePolicyRules.onExitCodes) &&
        Objects.equals(this.onPodConditions, v1alpha1AnalysisTemplateSpecProviderJobSpecPodFailurePolicyRules.onPodConditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, onExitCodes, onPodConditions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1AnalysisTemplateSpecProviderJobSpecPodFailurePolicyRules {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    onExitCodes: ").append(toIndentedString(onExitCodes)).append("\n");
    sb.append("    onPodConditions: ").append(toIndentedString(onPodConditions)).append("\n");
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
