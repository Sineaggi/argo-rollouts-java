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

/**
 * V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecVolumeDevices
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-19T02:24:32.086Z[Etc/UTC]")
public class V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecVolumeDevices {
  public static final String SERIALIZED_NAME_DEVICE_PATH = "devicePath";
  @SerializedName(SERIALIZED_NAME_DEVICE_PATH)
  private String devicePath;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecVolumeDevices devicePath(String devicePath) {
    
    this.devicePath = devicePath;
    return this;
  }

   /**
   * Get devicePath
   * @return devicePath
  **/
  @ApiModelProperty(required = true, value = "")

  public String getDevicePath() {
    return devicePath;
  }


  public void setDevicePath(String devicePath) {
    this.devicePath = devicePath;
  }


  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecVolumeDevices name(String name) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecVolumeDevices v1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecVolumeDevices = (V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecVolumeDevices) o;
    return Objects.equals(this.devicePath, v1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecVolumeDevices.devicePath) &&
        Objects.equals(this.name, v1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecVolumeDevices.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(devicePath, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecVolumeDevices {\n");
    sb.append("    devicePath: ").append(toIndentedString(devicePath)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

