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
import io.argoproj.models.V1alpha1AnalysisTemplateSpecProviderJobMetadata;
import io.argoproj.models.V1alpha1RolloutSpecStrategyBlueGreenAntiAffinity;
import io.argoproj.models.V1alpha1RolloutSpecStrategyCanaryAnalysis;
import io.argoproj.models.V1alpha1RolloutSpecStrategyCanaryPingPong;
import io.argoproj.models.V1alpha1RolloutSpecStrategyCanarySteps;
import io.argoproj.models.V1alpha1RolloutSpecStrategyCanaryTrafficRouting;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * V1alpha1RolloutSpecStrategyCanary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-19T02:24:32.086Z[Etc/UTC]")
public class V1alpha1RolloutSpecStrategyCanary {
  public static final String SERIALIZED_NAME_ABORT_SCALE_DOWN_DELAY_SECONDS = "abortScaleDownDelaySeconds";
  @SerializedName(SERIALIZED_NAME_ABORT_SCALE_DOWN_DELAY_SECONDS)
  private Integer abortScaleDownDelaySeconds;

  public static final String SERIALIZED_NAME_ANALYSIS = "analysis";
  @SerializedName(SERIALIZED_NAME_ANALYSIS)
  private V1alpha1RolloutSpecStrategyCanaryAnalysis analysis;

  public static final String SERIALIZED_NAME_ANTI_AFFINITY = "antiAffinity";
  @SerializedName(SERIALIZED_NAME_ANTI_AFFINITY)
  private V1alpha1RolloutSpecStrategyBlueGreenAntiAffinity antiAffinity;

  public static final String SERIALIZED_NAME_CANARY_METADATA = "canaryMetadata";
  @SerializedName(SERIALIZED_NAME_CANARY_METADATA)
  private V1alpha1AnalysisTemplateSpecProviderJobMetadata canaryMetadata;

  public static final String SERIALIZED_NAME_CANARY_SERVICE = "canaryService";
  @SerializedName(SERIALIZED_NAME_CANARY_SERVICE)
  private String canaryService;

  public static final String SERIALIZED_NAME_DYNAMIC_STABLE_SCALE = "dynamicStableScale";
  @SerializedName(SERIALIZED_NAME_DYNAMIC_STABLE_SCALE)
  private Boolean dynamicStableScale;

  public static final String SERIALIZED_NAME_MAX_SURGE = "maxSurge";
  @SerializedName(SERIALIZED_NAME_MAX_SURGE)
  private Object maxSurge;

  public static final String SERIALIZED_NAME_MAX_UNAVAILABLE = "maxUnavailable";
  @SerializedName(SERIALIZED_NAME_MAX_UNAVAILABLE)
  private Object maxUnavailable;

  public static final String SERIALIZED_NAME_MIN_PODS_PER_REPLICA_SET = "minPodsPerReplicaSet";
  @SerializedName(SERIALIZED_NAME_MIN_PODS_PER_REPLICA_SET)
  private Integer minPodsPerReplicaSet;

  public static final String SERIALIZED_NAME_PING_PONG = "pingPong";
  @SerializedName(SERIALIZED_NAME_PING_PONG)
  private V1alpha1RolloutSpecStrategyCanaryPingPong pingPong;

  public static final String SERIALIZED_NAME_SCALE_DOWN_DELAY_REVISION_LIMIT = "scaleDownDelayRevisionLimit";
  @SerializedName(SERIALIZED_NAME_SCALE_DOWN_DELAY_REVISION_LIMIT)
  private Integer scaleDownDelayRevisionLimit;

  public static final String SERIALIZED_NAME_SCALE_DOWN_DELAY_SECONDS = "scaleDownDelaySeconds";
  @SerializedName(SERIALIZED_NAME_SCALE_DOWN_DELAY_SECONDS)
  private Integer scaleDownDelaySeconds;

  public static final String SERIALIZED_NAME_STABLE_METADATA = "stableMetadata";
  @SerializedName(SERIALIZED_NAME_STABLE_METADATA)
  private V1alpha1AnalysisTemplateSpecProviderJobMetadata stableMetadata;

  public static final String SERIALIZED_NAME_STABLE_SERVICE = "stableService";
  @SerializedName(SERIALIZED_NAME_STABLE_SERVICE)
  private String stableService;

  public static final String SERIALIZED_NAME_STEPS = "steps";
  @SerializedName(SERIALIZED_NAME_STEPS)
  private List<V1alpha1RolloutSpecStrategyCanarySteps> steps = null;

  public static final String SERIALIZED_NAME_TRAFFIC_ROUTING = "trafficRouting";
  @SerializedName(SERIALIZED_NAME_TRAFFIC_ROUTING)
  private V1alpha1RolloutSpecStrategyCanaryTrafficRouting trafficRouting;


  public V1alpha1RolloutSpecStrategyCanary abortScaleDownDelaySeconds(Integer abortScaleDownDelaySeconds) {
    
    this.abortScaleDownDelaySeconds = abortScaleDownDelaySeconds;
    return this;
  }

   /**
   * Get abortScaleDownDelaySeconds
   * @return abortScaleDownDelaySeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAbortScaleDownDelaySeconds() {
    return abortScaleDownDelaySeconds;
  }


  public void setAbortScaleDownDelaySeconds(Integer abortScaleDownDelaySeconds) {
    this.abortScaleDownDelaySeconds = abortScaleDownDelaySeconds;
  }


  public V1alpha1RolloutSpecStrategyCanary analysis(V1alpha1RolloutSpecStrategyCanaryAnalysis analysis) {
    
    this.analysis = analysis;
    return this;
  }

   /**
   * Get analysis
   * @return analysis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1RolloutSpecStrategyCanaryAnalysis getAnalysis() {
    return analysis;
  }


  public void setAnalysis(V1alpha1RolloutSpecStrategyCanaryAnalysis analysis) {
    this.analysis = analysis;
  }


  public V1alpha1RolloutSpecStrategyCanary antiAffinity(V1alpha1RolloutSpecStrategyBlueGreenAntiAffinity antiAffinity) {
    
    this.antiAffinity = antiAffinity;
    return this;
  }

   /**
   * Get antiAffinity
   * @return antiAffinity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1RolloutSpecStrategyBlueGreenAntiAffinity getAntiAffinity() {
    return antiAffinity;
  }


  public void setAntiAffinity(V1alpha1RolloutSpecStrategyBlueGreenAntiAffinity antiAffinity) {
    this.antiAffinity = antiAffinity;
  }


  public V1alpha1RolloutSpecStrategyCanary canaryMetadata(V1alpha1AnalysisTemplateSpecProviderJobMetadata canaryMetadata) {
    
    this.canaryMetadata = canaryMetadata;
    return this;
  }

   /**
   * Get canaryMetadata
   * @return canaryMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1AnalysisTemplateSpecProviderJobMetadata getCanaryMetadata() {
    return canaryMetadata;
  }


  public void setCanaryMetadata(V1alpha1AnalysisTemplateSpecProviderJobMetadata canaryMetadata) {
    this.canaryMetadata = canaryMetadata;
  }


  public V1alpha1RolloutSpecStrategyCanary canaryService(String canaryService) {
    
    this.canaryService = canaryService;
    return this;
  }

   /**
   * Get canaryService
   * @return canaryService
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCanaryService() {
    return canaryService;
  }


  public void setCanaryService(String canaryService) {
    this.canaryService = canaryService;
  }


  public V1alpha1RolloutSpecStrategyCanary dynamicStableScale(Boolean dynamicStableScale) {
    
    this.dynamicStableScale = dynamicStableScale;
    return this;
  }

   /**
   * Get dynamicStableScale
   * @return dynamicStableScale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDynamicStableScale() {
    return dynamicStableScale;
  }


  public void setDynamicStableScale(Boolean dynamicStableScale) {
    this.dynamicStableScale = dynamicStableScale;
  }


  public V1alpha1RolloutSpecStrategyCanary maxSurge(Object maxSurge) {
    
    this.maxSurge = maxSurge;
    return this;
  }

   /**
   * Get maxSurge
   * @return maxSurge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getMaxSurge() {
    return maxSurge;
  }


  public void setMaxSurge(Object maxSurge) {
    this.maxSurge = maxSurge;
  }


  public V1alpha1RolloutSpecStrategyCanary maxUnavailable(Object maxUnavailable) {
    
    this.maxUnavailable = maxUnavailable;
    return this;
  }

   /**
   * Get maxUnavailable
   * @return maxUnavailable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getMaxUnavailable() {
    return maxUnavailable;
  }


  public void setMaxUnavailable(Object maxUnavailable) {
    this.maxUnavailable = maxUnavailable;
  }


  public V1alpha1RolloutSpecStrategyCanary minPodsPerReplicaSet(Integer minPodsPerReplicaSet) {
    
    this.minPodsPerReplicaSet = minPodsPerReplicaSet;
    return this;
  }

   /**
   * Get minPodsPerReplicaSet
   * @return minPodsPerReplicaSet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMinPodsPerReplicaSet() {
    return minPodsPerReplicaSet;
  }


  public void setMinPodsPerReplicaSet(Integer minPodsPerReplicaSet) {
    this.minPodsPerReplicaSet = minPodsPerReplicaSet;
  }


  public V1alpha1RolloutSpecStrategyCanary pingPong(V1alpha1RolloutSpecStrategyCanaryPingPong pingPong) {
    
    this.pingPong = pingPong;
    return this;
  }

   /**
   * Get pingPong
   * @return pingPong
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1RolloutSpecStrategyCanaryPingPong getPingPong() {
    return pingPong;
  }


  public void setPingPong(V1alpha1RolloutSpecStrategyCanaryPingPong pingPong) {
    this.pingPong = pingPong;
  }


  public V1alpha1RolloutSpecStrategyCanary scaleDownDelayRevisionLimit(Integer scaleDownDelayRevisionLimit) {
    
    this.scaleDownDelayRevisionLimit = scaleDownDelayRevisionLimit;
    return this;
  }

   /**
   * Get scaleDownDelayRevisionLimit
   * @return scaleDownDelayRevisionLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getScaleDownDelayRevisionLimit() {
    return scaleDownDelayRevisionLimit;
  }


  public void setScaleDownDelayRevisionLimit(Integer scaleDownDelayRevisionLimit) {
    this.scaleDownDelayRevisionLimit = scaleDownDelayRevisionLimit;
  }


  public V1alpha1RolloutSpecStrategyCanary scaleDownDelaySeconds(Integer scaleDownDelaySeconds) {
    
    this.scaleDownDelaySeconds = scaleDownDelaySeconds;
    return this;
  }

   /**
   * Get scaleDownDelaySeconds
   * @return scaleDownDelaySeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getScaleDownDelaySeconds() {
    return scaleDownDelaySeconds;
  }


  public void setScaleDownDelaySeconds(Integer scaleDownDelaySeconds) {
    this.scaleDownDelaySeconds = scaleDownDelaySeconds;
  }


  public V1alpha1RolloutSpecStrategyCanary stableMetadata(V1alpha1AnalysisTemplateSpecProviderJobMetadata stableMetadata) {
    
    this.stableMetadata = stableMetadata;
    return this;
  }

   /**
   * Get stableMetadata
   * @return stableMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1AnalysisTemplateSpecProviderJobMetadata getStableMetadata() {
    return stableMetadata;
  }


  public void setStableMetadata(V1alpha1AnalysisTemplateSpecProviderJobMetadata stableMetadata) {
    this.stableMetadata = stableMetadata;
  }


  public V1alpha1RolloutSpecStrategyCanary stableService(String stableService) {
    
    this.stableService = stableService;
    return this;
  }

   /**
   * Get stableService
   * @return stableService
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStableService() {
    return stableService;
  }


  public void setStableService(String stableService) {
    this.stableService = stableService;
  }


  public V1alpha1RolloutSpecStrategyCanary steps(List<V1alpha1RolloutSpecStrategyCanarySteps> steps) {
    
    this.steps = steps;
    return this;
  }

  public V1alpha1RolloutSpecStrategyCanary addStepsItem(V1alpha1RolloutSpecStrategyCanarySteps stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    return this;
  }

   /**
   * Get steps
   * @return steps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1alpha1RolloutSpecStrategyCanarySteps> getSteps() {
    return steps;
  }


  public void setSteps(List<V1alpha1RolloutSpecStrategyCanarySteps> steps) {
    this.steps = steps;
  }


  public V1alpha1RolloutSpecStrategyCanary trafficRouting(V1alpha1RolloutSpecStrategyCanaryTrafficRouting trafficRouting) {
    
    this.trafficRouting = trafficRouting;
    return this;
  }

   /**
   * Get trafficRouting
   * @return trafficRouting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1RolloutSpecStrategyCanaryTrafficRouting getTrafficRouting() {
    return trafficRouting;
  }


  public void setTrafficRouting(V1alpha1RolloutSpecStrategyCanaryTrafficRouting trafficRouting) {
    this.trafficRouting = trafficRouting;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1RolloutSpecStrategyCanary v1alpha1RolloutSpecStrategyCanary = (V1alpha1RolloutSpecStrategyCanary) o;
    return Objects.equals(this.abortScaleDownDelaySeconds, v1alpha1RolloutSpecStrategyCanary.abortScaleDownDelaySeconds) &&
        Objects.equals(this.analysis, v1alpha1RolloutSpecStrategyCanary.analysis) &&
        Objects.equals(this.antiAffinity, v1alpha1RolloutSpecStrategyCanary.antiAffinity) &&
        Objects.equals(this.canaryMetadata, v1alpha1RolloutSpecStrategyCanary.canaryMetadata) &&
        Objects.equals(this.canaryService, v1alpha1RolloutSpecStrategyCanary.canaryService) &&
        Objects.equals(this.dynamicStableScale, v1alpha1RolloutSpecStrategyCanary.dynamicStableScale) &&
        Objects.equals(this.maxSurge, v1alpha1RolloutSpecStrategyCanary.maxSurge) &&
        Objects.equals(this.maxUnavailable, v1alpha1RolloutSpecStrategyCanary.maxUnavailable) &&
        Objects.equals(this.minPodsPerReplicaSet, v1alpha1RolloutSpecStrategyCanary.minPodsPerReplicaSet) &&
        Objects.equals(this.pingPong, v1alpha1RolloutSpecStrategyCanary.pingPong) &&
        Objects.equals(this.scaleDownDelayRevisionLimit, v1alpha1RolloutSpecStrategyCanary.scaleDownDelayRevisionLimit) &&
        Objects.equals(this.scaleDownDelaySeconds, v1alpha1RolloutSpecStrategyCanary.scaleDownDelaySeconds) &&
        Objects.equals(this.stableMetadata, v1alpha1RolloutSpecStrategyCanary.stableMetadata) &&
        Objects.equals(this.stableService, v1alpha1RolloutSpecStrategyCanary.stableService) &&
        Objects.equals(this.steps, v1alpha1RolloutSpecStrategyCanary.steps) &&
        Objects.equals(this.trafficRouting, v1alpha1RolloutSpecStrategyCanary.trafficRouting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abortScaleDownDelaySeconds, analysis, antiAffinity, canaryMetadata, canaryService, dynamicStableScale, maxSurge, maxUnavailable, minPodsPerReplicaSet, pingPong, scaleDownDelayRevisionLimit, scaleDownDelaySeconds, stableMetadata, stableService, steps, trafficRouting);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1RolloutSpecStrategyCanary {\n");
    sb.append("    abortScaleDownDelaySeconds: ").append(toIndentedString(abortScaleDownDelaySeconds)).append("\n");
    sb.append("    analysis: ").append(toIndentedString(analysis)).append("\n");
    sb.append("    antiAffinity: ").append(toIndentedString(antiAffinity)).append("\n");
    sb.append("    canaryMetadata: ").append(toIndentedString(canaryMetadata)).append("\n");
    sb.append("    canaryService: ").append(toIndentedString(canaryService)).append("\n");
    sb.append("    dynamicStableScale: ").append(toIndentedString(dynamicStableScale)).append("\n");
    sb.append("    maxSurge: ").append(toIndentedString(maxSurge)).append("\n");
    sb.append("    maxUnavailable: ").append(toIndentedString(maxUnavailable)).append("\n");
    sb.append("    minPodsPerReplicaSet: ").append(toIndentedString(minPodsPerReplicaSet)).append("\n");
    sb.append("    pingPong: ").append(toIndentedString(pingPong)).append("\n");
    sb.append("    scaleDownDelayRevisionLimit: ").append(toIndentedString(scaleDownDelayRevisionLimit)).append("\n");
    sb.append("    scaleDownDelaySeconds: ").append(toIndentedString(scaleDownDelaySeconds)).append("\n");
    sb.append("    stableMetadata: ").append(toIndentedString(stableMetadata)).append("\n");
    sb.append("    stableService: ").append(toIndentedString(stableService)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    trafficRouting: ").append(toIndentedString(trafficRouting)).append("\n");
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

