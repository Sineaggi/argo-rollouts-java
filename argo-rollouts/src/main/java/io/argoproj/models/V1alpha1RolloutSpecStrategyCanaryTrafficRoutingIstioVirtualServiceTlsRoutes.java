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
import java.util.List;

/**
 * V1alpha1RolloutSpecStrategyCanaryTrafficRoutingIstioVirtualServiceTlsRoutes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-19T02:24:32.086Z[Etc/UTC]")
public class V1alpha1RolloutSpecStrategyCanaryTrafficRoutingIstioVirtualServiceTlsRoutes {
  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Long port;

  public static final String SERIALIZED_NAME_SNI_HOSTS = "sniHosts";
  @SerializedName(SERIALIZED_NAME_SNI_HOSTS)
  private List<String> sniHosts = null;


  public V1alpha1RolloutSpecStrategyCanaryTrafficRoutingIstioVirtualServiceTlsRoutes port(Long port) {
    
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getPort() {
    return port;
  }


  public void setPort(Long port) {
    this.port = port;
  }


  public V1alpha1RolloutSpecStrategyCanaryTrafficRoutingIstioVirtualServiceTlsRoutes sniHosts(List<String> sniHosts) {
    
    this.sniHosts = sniHosts;
    return this;
  }

  public V1alpha1RolloutSpecStrategyCanaryTrafficRoutingIstioVirtualServiceTlsRoutes addSniHostsItem(String sniHostsItem) {
    if (this.sniHosts == null) {
      this.sniHosts = new ArrayList<>();
    }
    this.sniHosts.add(sniHostsItem);
    return this;
  }

   /**
   * Get sniHosts
   * @return sniHosts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSniHosts() {
    return sniHosts;
  }


  public void setSniHosts(List<String> sniHosts) {
    this.sniHosts = sniHosts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1RolloutSpecStrategyCanaryTrafficRoutingIstioVirtualServiceTlsRoutes v1alpha1RolloutSpecStrategyCanaryTrafficRoutingIstioVirtualServiceTlsRoutes = (V1alpha1RolloutSpecStrategyCanaryTrafficRoutingIstioVirtualServiceTlsRoutes) o;
    return Objects.equals(this.port, v1alpha1RolloutSpecStrategyCanaryTrafficRoutingIstioVirtualServiceTlsRoutes.port) &&
        Objects.equals(this.sniHosts, v1alpha1RolloutSpecStrategyCanaryTrafficRoutingIstioVirtualServiceTlsRoutes.sniHosts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(port, sniHosts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1RolloutSpecStrategyCanaryTrafficRoutingIstioVirtualServiceTlsRoutes {\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    sniHosts: ").append(toIndentedString(sniHosts)).append("\n");
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

