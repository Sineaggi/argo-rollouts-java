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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * V1alpha1RolloutSpecStrategyCanaryTrafficRoutingNginx
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-19T02:24:32.086Z[Etc/UTC]")
public class V1alpha1RolloutSpecStrategyCanaryTrafficRoutingNginx {
  public static final String SERIALIZED_NAME_ADDITIONAL_INGRESS_ANNOTATIONS = "additionalIngressAnnotations";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INGRESS_ANNOTATIONS)
  private Map<String, String> additionalIngressAnnotations = null;

  public static final String SERIALIZED_NAME_ANNOTATION_PREFIX = "annotationPrefix";
  @SerializedName(SERIALIZED_NAME_ANNOTATION_PREFIX)
  private String annotationPrefix;

  public static final String SERIALIZED_NAME_STABLE_INGRESS = "stableIngress";
  @SerializedName(SERIALIZED_NAME_STABLE_INGRESS)
  private String stableIngress;

  public static final String SERIALIZED_NAME_STABLE_INGRESSES = "stableIngresses";
  @SerializedName(SERIALIZED_NAME_STABLE_INGRESSES)
  private List<String> stableIngresses = null;


  public V1alpha1RolloutSpecStrategyCanaryTrafficRoutingNginx additionalIngressAnnotations(Map<String, String> additionalIngressAnnotations) {
    
    this.additionalIngressAnnotations = additionalIngressAnnotations;
    return this;
  }

  public V1alpha1RolloutSpecStrategyCanaryTrafficRoutingNginx putAdditionalIngressAnnotationsItem(String key, String additionalIngressAnnotationsItem) {
    if (this.additionalIngressAnnotations == null) {
      this.additionalIngressAnnotations = new HashMap<>();
    }
    this.additionalIngressAnnotations.put(key, additionalIngressAnnotationsItem);
    return this;
  }

   /**
   * Get additionalIngressAnnotations
   * @return additionalIngressAnnotations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getAdditionalIngressAnnotations() {
    return additionalIngressAnnotations;
  }


  public void setAdditionalIngressAnnotations(Map<String, String> additionalIngressAnnotations) {
    this.additionalIngressAnnotations = additionalIngressAnnotations;
  }


  public V1alpha1RolloutSpecStrategyCanaryTrafficRoutingNginx annotationPrefix(String annotationPrefix) {
    
    this.annotationPrefix = annotationPrefix;
    return this;
  }

   /**
   * Get annotationPrefix
   * @return annotationPrefix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAnnotationPrefix() {
    return annotationPrefix;
  }


  public void setAnnotationPrefix(String annotationPrefix) {
    this.annotationPrefix = annotationPrefix;
  }


  public V1alpha1RolloutSpecStrategyCanaryTrafficRoutingNginx stableIngress(String stableIngress) {
    
    this.stableIngress = stableIngress;
    return this;
  }

   /**
   * Get stableIngress
   * @return stableIngress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStableIngress() {
    return stableIngress;
  }


  public void setStableIngress(String stableIngress) {
    this.stableIngress = stableIngress;
  }


  public V1alpha1RolloutSpecStrategyCanaryTrafficRoutingNginx stableIngresses(List<String> stableIngresses) {
    
    this.stableIngresses = stableIngresses;
    return this;
  }

  public V1alpha1RolloutSpecStrategyCanaryTrafficRoutingNginx addStableIngressesItem(String stableIngressesItem) {
    if (this.stableIngresses == null) {
      this.stableIngresses = new ArrayList<>();
    }
    this.stableIngresses.add(stableIngressesItem);
    return this;
  }

   /**
   * Get stableIngresses
   * @return stableIngresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getStableIngresses() {
    return stableIngresses;
  }


  public void setStableIngresses(List<String> stableIngresses) {
    this.stableIngresses = stableIngresses;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1RolloutSpecStrategyCanaryTrafficRoutingNginx v1alpha1RolloutSpecStrategyCanaryTrafficRoutingNginx = (V1alpha1RolloutSpecStrategyCanaryTrafficRoutingNginx) o;
    return Objects.equals(this.additionalIngressAnnotations, v1alpha1RolloutSpecStrategyCanaryTrafficRoutingNginx.additionalIngressAnnotations) &&
        Objects.equals(this.annotationPrefix, v1alpha1RolloutSpecStrategyCanaryTrafficRoutingNginx.annotationPrefix) &&
        Objects.equals(this.stableIngress, v1alpha1RolloutSpecStrategyCanaryTrafficRoutingNginx.stableIngress) &&
        Objects.equals(this.stableIngresses, v1alpha1RolloutSpecStrategyCanaryTrafficRoutingNginx.stableIngresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalIngressAnnotations, annotationPrefix, stableIngress, stableIngresses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1RolloutSpecStrategyCanaryTrafficRoutingNginx {\n");
    sb.append("    additionalIngressAnnotations: ").append(toIndentedString(additionalIngressAnnotations)).append("\n");
    sb.append("    annotationPrefix: ").append(toIndentedString(annotationPrefix)).append("\n");
    sb.append("    stableIngress: ").append(toIndentedString(stableIngress)).append("\n");
    sb.append("    stableIngresses: ").append(toIndentedString(stableIngresses)).append("\n");
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
