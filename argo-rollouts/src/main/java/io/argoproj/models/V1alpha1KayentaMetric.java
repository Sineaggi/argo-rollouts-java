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
import io.argoproj.models.V1alpha1KayentaScope;
import io.argoproj.models.V1alpha1KayentaThreshold;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * V1alpha1KayentaMetric
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-19T21:57:47.017Z[Etc/UTC]")
public class V1alpha1KayentaMetric {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address = "";

  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private String application = "";

  public static final String SERIALIZED_NAME_CANARY_CONFIG_NAME = "canaryConfigName";
  @SerializedName(SERIALIZED_NAME_CANARY_CONFIG_NAME)
  private String canaryConfigName = "";

  public static final String SERIALIZED_NAME_CONFIGURATION_ACCOUNT_NAME = "configurationAccountName";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_ACCOUNT_NAME)
  private String configurationAccountName = "";

  public static final String SERIALIZED_NAME_METRICS_ACCOUNT_NAME = "metricsAccountName";
  @SerializedName(SERIALIZED_NAME_METRICS_ACCOUNT_NAME)
  private String metricsAccountName = "";

  public static final String SERIALIZED_NAME_SCOPES = "scopes";
  @SerializedName(SERIALIZED_NAME_SCOPES)
  private List<V1alpha1KayentaScope> scopes = new ArrayList<>();

  public static final String SERIALIZED_NAME_STORAGE_ACCOUNT_NAME = "storageAccountName";
  @SerializedName(SERIALIZED_NAME_STORAGE_ACCOUNT_NAME)
  private String storageAccountName = "";

  public static final String SERIALIZED_NAME_THRESHOLD = "threshold";
  @SerializedName(SERIALIZED_NAME_THRESHOLD)
  private V1alpha1KayentaThreshold threshold;


  public V1alpha1KayentaMetric address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(required = true, value = "")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public V1alpha1KayentaMetric application(String application) {
    
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  @ApiModelProperty(required = true, value = "")

  public String getApplication() {
    return application;
  }


  public void setApplication(String application) {
    this.application = application;
  }


  public V1alpha1KayentaMetric canaryConfigName(String canaryConfigName) {
    
    this.canaryConfigName = canaryConfigName;
    return this;
  }

   /**
   * Get canaryConfigName
   * @return canaryConfigName
  **/
  @ApiModelProperty(required = true, value = "")

  public String getCanaryConfigName() {
    return canaryConfigName;
  }


  public void setCanaryConfigName(String canaryConfigName) {
    this.canaryConfigName = canaryConfigName;
  }


  public V1alpha1KayentaMetric configurationAccountName(String configurationAccountName) {
    
    this.configurationAccountName = configurationAccountName;
    return this;
  }

   /**
   * Get configurationAccountName
   * @return configurationAccountName
  **/
  @ApiModelProperty(required = true, value = "")

  public String getConfigurationAccountName() {
    return configurationAccountName;
  }


  public void setConfigurationAccountName(String configurationAccountName) {
    this.configurationAccountName = configurationAccountName;
  }


  public V1alpha1KayentaMetric metricsAccountName(String metricsAccountName) {
    
    this.metricsAccountName = metricsAccountName;
    return this;
  }

   /**
   * Get metricsAccountName
   * @return metricsAccountName
  **/
  @ApiModelProperty(required = true, value = "")

  public String getMetricsAccountName() {
    return metricsAccountName;
  }


  public void setMetricsAccountName(String metricsAccountName) {
    this.metricsAccountName = metricsAccountName;
  }


  public V1alpha1KayentaMetric scopes(List<V1alpha1KayentaScope> scopes) {
    
    this.scopes = scopes;
    return this;
  }

  public V1alpha1KayentaMetric addScopesItem(V1alpha1KayentaScope scopesItem) {
    this.scopes.add(scopesItem);
    return this;
  }

   /**
   * Get scopes
   * @return scopes
  **/
  @ApiModelProperty(required = true, value = "")

  public List<V1alpha1KayentaScope> getScopes() {
    return scopes;
  }


  public void setScopes(List<V1alpha1KayentaScope> scopes) {
    this.scopes = scopes;
  }


  public V1alpha1KayentaMetric storageAccountName(String storageAccountName) {
    
    this.storageAccountName = storageAccountName;
    return this;
  }

   /**
   * Get storageAccountName
   * @return storageAccountName
  **/
  @ApiModelProperty(required = true, value = "")

  public String getStorageAccountName() {
    return storageAccountName;
  }


  public void setStorageAccountName(String storageAccountName) {
    this.storageAccountName = storageAccountName;
  }


  public V1alpha1KayentaMetric threshold(V1alpha1KayentaThreshold threshold) {
    
    this.threshold = threshold;
    return this;
  }

   /**
   * Get threshold
   * @return threshold
  **/
  @ApiModelProperty(required = true, value = "")

  public V1alpha1KayentaThreshold getThreshold() {
    return threshold;
  }


  public void setThreshold(V1alpha1KayentaThreshold threshold) {
    this.threshold = threshold;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1KayentaMetric v1alpha1KayentaMetric = (V1alpha1KayentaMetric) o;
    return Objects.equals(this.address, v1alpha1KayentaMetric.address) &&
        Objects.equals(this.application, v1alpha1KayentaMetric.application) &&
        Objects.equals(this.canaryConfigName, v1alpha1KayentaMetric.canaryConfigName) &&
        Objects.equals(this.configurationAccountName, v1alpha1KayentaMetric.configurationAccountName) &&
        Objects.equals(this.metricsAccountName, v1alpha1KayentaMetric.metricsAccountName) &&
        Objects.equals(this.scopes, v1alpha1KayentaMetric.scopes) &&
        Objects.equals(this.storageAccountName, v1alpha1KayentaMetric.storageAccountName) &&
        Objects.equals(this.threshold, v1alpha1KayentaMetric.threshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, application, canaryConfigName, configurationAccountName, metricsAccountName, scopes, storageAccountName, threshold);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1KayentaMetric {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    canaryConfigName: ").append(toIndentedString(canaryConfigName)).append("\n");
    sb.append("    configurationAccountName: ").append(toIndentedString(configurationAccountName)).append("\n");
    sb.append("    metricsAccountName: ").append(toIndentedString(metricsAccountName)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    storageAccountName: ").append(toIndentedString(storageAccountName)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
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

