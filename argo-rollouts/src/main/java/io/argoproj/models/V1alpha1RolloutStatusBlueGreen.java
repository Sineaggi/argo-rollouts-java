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
import io.argoproj.models.V1alpha1RolloutStatusBlueGreenPostPromotionAnalysisRunStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1alpha1RolloutStatusBlueGreen
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-19T02:24:32.086Z[Etc/UTC]")
public class V1alpha1RolloutStatusBlueGreen {
  public static final String SERIALIZED_NAME_ACTIVE_SELECTOR = "activeSelector";
  @SerializedName(SERIALIZED_NAME_ACTIVE_SELECTOR)
  private String activeSelector;

  public static final String SERIALIZED_NAME_POST_PROMOTION_ANALYSIS_RUN_STATUS = "postPromotionAnalysisRunStatus";
  @SerializedName(SERIALIZED_NAME_POST_PROMOTION_ANALYSIS_RUN_STATUS)
  private V1alpha1RolloutStatusBlueGreenPostPromotionAnalysisRunStatus postPromotionAnalysisRunStatus;

  public static final String SERIALIZED_NAME_PRE_PROMOTION_ANALYSIS_RUN_STATUS = "prePromotionAnalysisRunStatus";
  @SerializedName(SERIALIZED_NAME_PRE_PROMOTION_ANALYSIS_RUN_STATUS)
  private V1alpha1RolloutStatusBlueGreenPostPromotionAnalysisRunStatus prePromotionAnalysisRunStatus;

  public static final String SERIALIZED_NAME_PREVIEW_SELECTOR = "previewSelector";
  @SerializedName(SERIALIZED_NAME_PREVIEW_SELECTOR)
  private String previewSelector;

  public static final String SERIALIZED_NAME_SCALE_UP_PREVIEW_CHECK_POINT = "scaleUpPreviewCheckPoint";
  @SerializedName(SERIALIZED_NAME_SCALE_UP_PREVIEW_CHECK_POINT)
  private Boolean scaleUpPreviewCheckPoint;


  public V1alpha1RolloutStatusBlueGreen activeSelector(String activeSelector) {
    
    this.activeSelector = activeSelector;
    return this;
  }

   /**
   * Get activeSelector
   * @return activeSelector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getActiveSelector() {
    return activeSelector;
  }


  public void setActiveSelector(String activeSelector) {
    this.activeSelector = activeSelector;
  }


  public V1alpha1RolloutStatusBlueGreen postPromotionAnalysisRunStatus(V1alpha1RolloutStatusBlueGreenPostPromotionAnalysisRunStatus postPromotionAnalysisRunStatus) {
    
    this.postPromotionAnalysisRunStatus = postPromotionAnalysisRunStatus;
    return this;
  }

   /**
   * Get postPromotionAnalysisRunStatus
   * @return postPromotionAnalysisRunStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1RolloutStatusBlueGreenPostPromotionAnalysisRunStatus getPostPromotionAnalysisRunStatus() {
    return postPromotionAnalysisRunStatus;
  }


  public void setPostPromotionAnalysisRunStatus(V1alpha1RolloutStatusBlueGreenPostPromotionAnalysisRunStatus postPromotionAnalysisRunStatus) {
    this.postPromotionAnalysisRunStatus = postPromotionAnalysisRunStatus;
  }


  public V1alpha1RolloutStatusBlueGreen prePromotionAnalysisRunStatus(V1alpha1RolloutStatusBlueGreenPostPromotionAnalysisRunStatus prePromotionAnalysisRunStatus) {
    
    this.prePromotionAnalysisRunStatus = prePromotionAnalysisRunStatus;
    return this;
  }

   /**
   * Get prePromotionAnalysisRunStatus
   * @return prePromotionAnalysisRunStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1RolloutStatusBlueGreenPostPromotionAnalysisRunStatus getPrePromotionAnalysisRunStatus() {
    return prePromotionAnalysisRunStatus;
  }


  public void setPrePromotionAnalysisRunStatus(V1alpha1RolloutStatusBlueGreenPostPromotionAnalysisRunStatus prePromotionAnalysisRunStatus) {
    this.prePromotionAnalysisRunStatus = prePromotionAnalysisRunStatus;
  }


  public V1alpha1RolloutStatusBlueGreen previewSelector(String previewSelector) {
    
    this.previewSelector = previewSelector;
    return this;
  }

   /**
   * Get previewSelector
   * @return previewSelector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPreviewSelector() {
    return previewSelector;
  }


  public void setPreviewSelector(String previewSelector) {
    this.previewSelector = previewSelector;
  }


  public V1alpha1RolloutStatusBlueGreen scaleUpPreviewCheckPoint(Boolean scaleUpPreviewCheckPoint) {
    
    this.scaleUpPreviewCheckPoint = scaleUpPreviewCheckPoint;
    return this;
  }

   /**
   * Get scaleUpPreviewCheckPoint
   * @return scaleUpPreviewCheckPoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getScaleUpPreviewCheckPoint() {
    return scaleUpPreviewCheckPoint;
  }


  public void setScaleUpPreviewCheckPoint(Boolean scaleUpPreviewCheckPoint) {
    this.scaleUpPreviewCheckPoint = scaleUpPreviewCheckPoint;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1RolloutStatusBlueGreen v1alpha1RolloutStatusBlueGreen = (V1alpha1RolloutStatusBlueGreen) o;
    return Objects.equals(this.activeSelector, v1alpha1RolloutStatusBlueGreen.activeSelector) &&
        Objects.equals(this.postPromotionAnalysisRunStatus, v1alpha1RolloutStatusBlueGreen.postPromotionAnalysisRunStatus) &&
        Objects.equals(this.prePromotionAnalysisRunStatus, v1alpha1RolloutStatusBlueGreen.prePromotionAnalysisRunStatus) &&
        Objects.equals(this.previewSelector, v1alpha1RolloutStatusBlueGreen.previewSelector) &&
        Objects.equals(this.scaleUpPreviewCheckPoint, v1alpha1RolloutStatusBlueGreen.scaleUpPreviewCheckPoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeSelector, postPromotionAnalysisRunStatus, prePromotionAnalysisRunStatus, previewSelector, scaleUpPreviewCheckPoint);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1RolloutStatusBlueGreen {\n");
    sb.append("    activeSelector: ").append(toIndentedString(activeSelector)).append("\n");
    sb.append("    postPromotionAnalysisRunStatus: ").append(toIndentedString(postPromotionAnalysisRunStatus)).append("\n");
    sb.append("    prePromotionAnalysisRunStatus: ").append(toIndentedString(prePromotionAnalysisRunStatus)).append("\n");
    sb.append("    previewSelector: ").append(toIndentedString(previewSelector)).append("\n");
    sb.append("    scaleUpPreviewCheckPoint: ").append(toIndentedString(scaleUpPreviewCheckPoint)).append("\n");
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

