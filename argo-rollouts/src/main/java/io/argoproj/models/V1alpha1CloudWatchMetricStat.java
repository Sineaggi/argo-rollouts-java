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
import io.kubernetes.client.custom.IntOrString;
import io.argoproj.models.V1alpha1CloudWatchMetricStatMetric;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1alpha1CloudWatchMetricStat
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-19T21:57:47.017Z[Etc/UTC]")
public class V1alpha1CloudWatchMetricStat {
  public static final String SERIALIZED_NAME_METRIC = "metric";
  @SerializedName(SERIALIZED_NAME_METRIC)
  private V1alpha1CloudWatchMetricStatMetric metric;

  public static final String SERIALIZED_NAME_PERIOD = "period";
  @SerializedName(SERIALIZED_NAME_PERIOD)
  private IntOrString period = null;

  public static final String SERIALIZED_NAME_STAT = "stat";
  @SerializedName(SERIALIZED_NAME_STAT)
  private String stat;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit;


  public V1alpha1CloudWatchMetricStat metric(V1alpha1CloudWatchMetricStatMetric metric) {
    
    this.metric = metric;
    return this;
  }

   /**
   * Get metric
   * @return metric
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1CloudWatchMetricStatMetric getMetric() {
    return metric;
  }


  public void setMetric(V1alpha1CloudWatchMetricStatMetric metric) {
    this.metric = metric;
  }


  public V1alpha1CloudWatchMetricStat period(IntOrString period) {
    
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IntOrString getPeriod() {
    return period;
  }


  public void setPeriod(IntOrString period) {
    this.period = period;
  }


  public V1alpha1CloudWatchMetricStat stat(String stat) {
    
    this.stat = stat;
    return this;
  }

   /**
   * Get stat
   * @return stat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStat() {
    return stat;
  }


  public void setStat(String stat) {
    this.stat = stat;
  }


  public V1alpha1CloudWatchMetricStat unit(String unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * Get unit
   * @return unit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUnit() {
    return unit;
  }


  public void setUnit(String unit) {
    this.unit = unit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1CloudWatchMetricStat v1alpha1CloudWatchMetricStat = (V1alpha1CloudWatchMetricStat) o;
    return Objects.equals(this.metric, v1alpha1CloudWatchMetricStat.metric) &&
        Objects.equals(this.period, v1alpha1CloudWatchMetricStat.period) &&
        Objects.equals(this.stat, v1alpha1CloudWatchMetricStat.stat) &&
        Objects.equals(this.unit, v1alpha1CloudWatchMetricStat.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, period, stat, unit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1CloudWatchMetricStat {\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    stat: ").append(toIndentedString(stat)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

