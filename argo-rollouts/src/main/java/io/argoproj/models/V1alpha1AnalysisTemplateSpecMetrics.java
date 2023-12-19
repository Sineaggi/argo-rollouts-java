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
import io.argoproj.models.V1alpha1AnalysisTemplateSpecProvider;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1alpha1AnalysisTemplateSpecMetrics
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-19T02:24:32.086Z[Etc/UTC]")
public class V1alpha1AnalysisTemplateSpecMetrics {
  public static final String SERIALIZED_NAME_CONSECUTIVE_ERROR_LIMIT = "consecutiveErrorLimit";
  @SerializedName(SERIALIZED_NAME_CONSECUTIVE_ERROR_LIMIT)
  private Object consecutiveErrorLimit;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Object count;

  public static final String SERIALIZED_NAME_FAILURE_CONDITION = "failureCondition";
  @SerializedName(SERIALIZED_NAME_FAILURE_CONDITION)
  private String failureCondition;

  public static final String SERIALIZED_NAME_FAILURE_LIMIT = "failureLimit";
  @SerializedName(SERIALIZED_NAME_FAILURE_LIMIT)
  private Object failureLimit;

  public static final String SERIALIZED_NAME_INCONCLUSIVE_LIMIT = "inconclusiveLimit";
  @SerializedName(SERIALIZED_NAME_INCONCLUSIVE_LIMIT)
  private Object inconclusiveLimit;

  public static final String SERIALIZED_NAME_INITIAL_DELAY = "initialDelay";
  @SerializedName(SERIALIZED_NAME_INITIAL_DELAY)
  private String initialDelay;

  public static final String SERIALIZED_NAME_INTERVAL = "interval";
  @SerializedName(SERIALIZED_NAME_INTERVAL)
  private String interval;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROVIDER = "provider";
  @SerializedName(SERIALIZED_NAME_PROVIDER)
  private V1alpha1AnalysisTemplateSpecProvider provider;

  public static final String SERIALIZED_NAME_SUCCESS_CONDITION = "successCondition";
  @SerializedName(SERIALIZED_NAME_SUCCESS_CONDITION)
  private String successCondition;


  public V1alpha1AnalysisTemplateSpecMetrics consecutiveErrorLimit(Object consecutiveErrorLimit) {
    
    this.consecutiveErrorLimit = consecutiveErrorLimit;
    return this;
  }

   /**
   * Get consecutiveErrorLimit
   * @return consecutiveErrorLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getConsecutiveErrorLimit() {
    return consecutiveErrorLimit;
  }


  public void setConsecutiveErrorLimit(Object consecutiveErrorLimit) {
    this.consecutiveErrorLimit = consecutiveErrorLimit;
  }


  public V1alpha1AnalysisTemplateSpecMetrics count(Object count) {
    
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getCount() {
    return count;
  }


  public void setCount(Object count) {
    this.count = count;
  }


  public V1alpha1AnalysisTemplateSpecMetrics failureCondition(String failureCondition) {
    
    this.failureCondition = failureCondition;
    return this;
  }

   /**
   * Get failureCondition
   * @return failureCondition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFailureCondition() {
    return failureCondition;
  }


  public void setFailureCondition(String failureCondition) {
    this.failureCondition = failureCondition;
  }


  public V1alpha1AnalysisTemplateSpecMetrics failureLimit(Object failureLimit) {
    
    this.failureLimit = failureLimit;
    return this;
  }

   /**
   * Get failureLimit
   * @return failureLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getFailureLimit() {
    return failureLimit;
  }


  public void setFailureLimit(Object failureLimit) {
    this.failureLimit = failureLimit;
  }


  public V1alpha1AnalysisTemplateSpecMetrics inconclusiveLimit(Object inconclusiveLimit) {
    
    this.inconclusiveLimit = inconclusiveLimit;
    return this;
  }

   /**
   * Get inconclusiveLimit
   * @return inconclusiveLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getInconclusiveLimit() {
    return inconclusiveLimit;
  }


  public void setInconclusiveLimit(Object inconclusiveLimit) {
    this.inconclusiveLimit = inconclusiveLimit;
  }


  public V1alpha1AnalysisTemplateSpecMetrics initialDelay(String initialDelay) {
    
    this.initialDelay = initialDelay;
    return this;
  }

   /**
   * Get initialDelay
   * @return initialDelay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInitialDelay() {
    return initialDelay;
  }


  public void setInitialDelay(String initialDelay) {
    this.initialDelay = initialDelay;
  }


  public V1alpha1AnalysisTemplateSpecMetrics interval(String interval) {
    
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInterval() {
    return interval;
  }


  public void setInterval(String interval) {
    this.interval = interval;
  }


  public V1alpha1AnalysisTemplateSpecMetrics name(String name) {
    
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


  public V1alpha1AnalysisTemplateSpecMetrics provider(V1alpha1AnalysisTemplateSpecProvider provider) {
    
    this.provider = provider;
    return this;
  }

   /**
   * Get provider
   * @return provider
  **/
  @ApiModelProperty(required = true, value = "")

  public V1alpha1AnalysisTemplateSpecProvider getProvider() {
    return provider;
  }


  public void setProvider(V1alpha1AnalysisTemplateSpecProvider provider) {
    this.provider = provider;
  }


  public V1alpha1AnalysisTemplateSpecMetrics successCondition(String successCondition) {
    
    this.successCondition = successCondition;
    return this;
  }

   /**
   * Get successCondition
   * @return successCondition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSuccessCondition() {
    return successCondition;
  }


  public void setSuccessCondition(String successCondition) {
    this.successCondition = successCondition;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1AnalysisTemplateSpecMetrics v1alpha1AnalysisTemplateSpecMetrics = (V1alpha1AnalysisTemplateSpecMetrics) o;
    return Objects.equals(this.consecutiveErrorLimit, v1alpha1AnalysisTemplateSpecMetrics.consecutiveErrorLimit) &&
        Objects.equals(this.count, v1alpha1AnalysisTemplateSpecMetrics.count) &&
        Objects.equals(this.failureCondition, v1alpha1AnalysisTemplateSpecMetrics.failureCondition) &&
        Objects.equals(this.failureLimit, v1alpha1AnalysisTemplateSpecMetrics.failureLimit) &&
        Objects.equals(this.inconclusiveLimit, v1alpha1AnalysisTemplateSpecMetrics.inconclusiveLimit) &&
        Objects.equals(this.initialDelay, v1alpha1AnalysisTemplateSpecMetrics.initialDelay) &&
        Objects.equals(this.interval, v1alpha1AnalysisTemplateSpecMetrics.interval) &&
        Objects.equals(this.name, v1alpha1AnalysisTemplateSpecMetrics.name) &&
        Objects.equals(this.provider, v1alpha1AnalysisTemplateSpecMetrics.provider) &&
        Objects.equals(this.successCondition, v1alpha1AnalysisTemplateSpecMetrics.successCondition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consecutiveErrorLimit, count, failureCondition, failureLimit, inconclusiveLimit, initialDelay, interval, name, provider, successCondition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1AnalysisTemplateSpecMetrics {\n");
    sb.append("    consecutiveErrorLimit: ").append(toIndentedString(consecutiveErrorLimit)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    failureCondition: ").append(toIndentedString(failureCondition)).append("\n");
    sb.append("    failureLimit: ").append(toIndentedString(failureLimit)).append("\n");
    sb.append("    inconclusiveLimit: ").append(toIndentedString(inconclusiveLimit)).append("\n");
    sb.append("    initialDelay: ").append(toIndentedString(initialDelay)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    successCondition: ").append(toIndentedString(successCondition)).append("\n");
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
