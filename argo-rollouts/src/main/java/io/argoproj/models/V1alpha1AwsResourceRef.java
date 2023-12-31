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
 * V1alpha1AwsResourceRef
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-19T21:57:47.017Z[Etc/UTC]")
public class V1alpha1AwsResourceRef {
  public static final String SERIALIZED_NAME_ARN = "arn";
  @SerializedName(SERIALIZED_NAME_ARN)
  private String arn = "";

  public static final String SERIALIZED_NAME_FULL_NAME = "fullName";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  private String fullName = "";

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = "";


  public V1alpha1AwsResourceRef arn(String arn) {
    
    this.arn = arn;
    return this;
  }

   /**
   * Get arn
   * @return arn
  **/
  @ApiModelProperty(required = true, value = "")

  public String getArn() {
    return arn;
  }


  public void setArn(String arn) {
    this.arn = arn;
  }


  public V1alpha1AwsResourceRef fullName(String fullName) {
    
    this.fullName = fullName;
    return this;
  }

   /**
   * FullName is the full name of the resource
   * @return fullName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "FullName is the full name of the resource")

  public String getFullName() {
    return fullName;
  }


  public void setFullName(String fullName) {
    this.fullName = fullName;
  }


  public V1alpha1AwsResourceRef name(String name) {
    
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
    V1alpha1AwsResourceRef v1alpha1AwsResourceRef = (V1alpha1AwsResourceRef) o;
    return Objects.equals(this.arn, v1alpha1AwsResourceRef.arn) &&
        Objects.equals(this.fullName, v1alpha1AwsResourceRef.fullName) &&
        Objects.equals(this.name, v1alpha1AwsResourceRef.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arn, fullName, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1AwsResourceRef {\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
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

