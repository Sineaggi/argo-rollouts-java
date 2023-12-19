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
import io.argoproj.models.V1alpha1RolloutSpecStrategyCanaryTrafficRoutingAlbStickinessConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * V1alpha1RolloutSpecStrategyCanaryTrafficRoutingAlb
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-19T02:24:32.086Z[Etc/UTC]")
public class V1alpha1RolloutSpecStrategyCanaryTrafficRoutingAlb {
  public static final String SERIALIZED_NAME_ANNOTATION_PREFIX = "annotationPrefix";
  @SerializedName(SERIALIZED_NAME_ANNOTATION_PREFIX)
  private String annotationPrefix;

  public static final String SERIALIZED_NAME_INGRESS = "ingress";
  @SerializedName(SERIALIZED_NAME_INGRESS)
  private String ingress;

  public static final String SERIALIZED_NAME_INGRESSES = "ingresses";
  @SerializedName(SERIALIZED_NAME_INGRESSES)
  private List<String> ingresses = null;

  public static final String SERIALIZED_NAME_ROOT_SERVICE = "rootService";
  @SerializedName(SERIALIZED_NAME_ROOT_SERVICE)
  private String rootService;

  public static final String SERIALIZED_NAME_SERVICE_PORT = "servicePort";
  @SerializedName(SERIALIZED_NAME_SERVICE_PORT)
  private Integer servicePort;

  public static final String SERIALIZED_NAME_STICKINESS_CONFIG = "stickinessConfig";
  @SerializedName(SERIALIZED_NAME_STICKINESS_CONFIG)
  private V1alpha1RolloutSpecStrategyCanaryTrafficRoutingAlbStickinessConfig stickinessConfig;


  public V1alpha1RolloutSpecStrategyCanaryTrafficRoutingAlb annotationPrefix(String annotationPrefix) {
    
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


  public V1alpha1RolloutSpecStrategyCanaryTrafficRoutingAlb ingress(String ingress) {
    
    this.ingress = ingress;
    return this;
  }

   /**
   * Get ingress
   * @return ingress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIngress() {
    return ingress;
  }


  public void setIngress(String ingress) {
    this.ingress = ingress;
  }


  public V1alpha1RolloutSpecStrategyCanaryTrafficRoutingAlb ingresses(List<String> ingresses) {
    
    this.ingresses = ingresses;
    return this;
  }

  public V1alpha1RolloutSpecStrategyCanaryTrafficRoutingAlb addIngressesItem(String ingressesItem) {
    if (this.ingresses == null) {
      this.ingresses = new ArrayList<>();
    }
    this.ingresses.add(ingressesItem);
    return this;
  }

   /**
   * Get ingresses
   * @return ingresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIngresses() {
    return ingresses;
  }


  public void setIngresses(List<String> ingresses) {
    this.ingresses = ingresses;
  }


  public V1alpha1RolloutSpecStrategyCanaryTrafficRoutingAlb rootService(String rootService) {
    
    this.rootService = rootService;
    return this;
  }

   /**
   * Get rootService
   * @return rootService
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRootService() {
    return rootService;
  }


  public void setRootService(String rootService) {
    this.rootService = rootService;
  }


  public V1alpha1RolloutSpecStrategyCanaryTrafficRoutingAlb servicePort(Integer servicePort) {
    
    this.servicePort = servicePort;
    return this;
  }

   /**
   * Get servicePort
   * @return servicePort
  **/
  @ApiModelProperty(required = true, value = "")

  public Integer getServicePort() {
    return servicePort;
  }


  public void setServicePort(Integer servicePort) {
    this.servicePort = servicePort;
  }


  public V1alpha1RolloutSpecStrategyCanaryTrafficRoutingAlb stickinessConfig(V1alpha1RolloutSpecStrategyCanaryTrafficRoutingAlbStickinessConfig stickinessConfig) {
    
    this.stickinessConfig = stickinessConfig;
    return this;
  }

   /**
   * Get stickinessConfig
   * @return stickinessConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1RolloutSpecStrategyCanaryTrafficRoutingAlbStickinessConfig getStickinessConfig() {
    return stickinessConfig;
  }


  public void setStickinessConfig(V1alpha1RolloutSpecStrategyCanaryTrafficRoutingAlbStickinessConfig stickinessConfig) {
    this.stickinessConfig = stickinessConfig;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1RolloutSpecStrategyCanaryTrafficRoutingAlb v1alpha1RolloutSpecStrategyCanaryTrafficRoutingAlb = (V1alpha1RolloutSpecStrategyCanaryTrafficRoutingAlb) o;
    return Objects.equals(this.annotationPrefix, v1alpha1RolloutSpecStrategyCanaryTrafficRoutingAlb.annotationPrefix) &&
        Objects.equals(this.ingress, v1alpha1RolloutSpecStrategyCanaryTrafficRoutingAlb.ingress) &&
        Objects.equals(this.ingresses, v1alpha1RolloutSpecStrategyCanaryTrafficRoutingAlb.ingresses) &&
        Objects.equals(this.rootService, v1alpha1RolloutSpecStrategyCanaryTrafficRoutingAlb.rootService) &&
        Objects.equals(this.servicePort, v1alpha1RolloutSpecStrategyCanaryTrafficRoutingAlb.servicePort) &&
        Objects.equals(this.stickinessConfig, v1alpha1RolloutSpecStrategyCanaryTrafficRoutingAlb.stickinessConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotationPrefix, ingress, ingresses, rootService, servicePort, stickinessConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1RolloutSpecStrategyCanaryTrafficRoutingAlb {\n");
    sb.append("    annotationPrefix: ").append(toIndentedString(annotationPrefix)).append("\n");
    sb.append("    ingress: ").append(toIndentedString(ingress)).append("\n");
    sb.append("    ingresses: ").append(toIndentedString(ingresses)).append("\n");
    sb.append("    rootService: ").append(toIndentedString(rootService)).append("\n");
    sb.append("    servicePort: ").append(toIndentedString(servicePort)).append("\n");
    sb.append("    stickinessConfig: ").append(toIndentedString(stickinessConfig)).append("\n");
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

