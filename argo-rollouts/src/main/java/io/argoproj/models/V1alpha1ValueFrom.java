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
import io.argoproj.models.V1alpha1FieldRef;
import io.argoproj.models.V1alpha1SecretKeyRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1alpha1ValueFrom
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-19T21:57:47.017Z[Etc/UTC]")
public class V1alpha1ValueFrom {
  public static final String SERIALIZED_NAME_FIELD_REF = "fieldRef";
  @SerializedName(SERIALIZED_NAME_FIELD_REF)
  private V1alpha1FieldRef fieldRef;

  public static final String SERIALIZED_NAME_SECRET_KEY_REF = "secretKeyRef";
  @SerializedName(SERIALIZED_NAME_SECRET_KEY_REF)
  private V1alpha1SecretKeyRef secretKeyRef;


  public V1alpha1ValueFrom fieldRef(V1alpha1FieldRef fieldRef) {
    
    this.fieldRef = fieldRef;
    return this;
  }

   /**
   * Get fieldRef
   * @return fieldRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1FieldRef getFieldRef() {
    return fieldRef;
  }


  public void setFieldRef(V1alpha1FieldRef fieldRef) {
    this.fieldRef = fieldRef;
  }


  public V1alpha1ValueFrom secretKeyRef(V1alpha1SecretKeyRef secretKeyRef) {
    
    this.secretKeyRef = secretKeyRef;
    return this;
  }

   /**
   * Get secretKeyRef
   * @return secretKeyRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1SecretKeyRef getSecretKeyRef() {
    return secretKeyRef;
  }


  public void setSecretKeyRef(V1alpha1SecretKeyRef secretKeyRef) {
    this.secretKeyRef = secretKeyRef;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ValueFrom v1alpha1ValueFrom = (V1alpha1ValueFrom) o;
    return Objects.equals(this.fieldRef, v1alpha1ValueFrom.fieldRef) &&
        Objects.equals(this.secretKeyRef, v1alpha1ValueFrom.secretKeyRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldRef, secretKeyRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ValueFrom {\n");
    sb.append("    fieldRef: ").append(toIndentedString(fieldRef)).append("\n");
    sb.append("    secretKeyRef: ").append(toIndentedString(secretKeyRef)).append("\n");
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

