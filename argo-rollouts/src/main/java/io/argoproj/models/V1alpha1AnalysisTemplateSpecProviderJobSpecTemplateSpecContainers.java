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
import io.argoproj.models.V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecEnv;
import io.argoproj.models.V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecEnvFrom;
import io.argoproj.models.V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecLifecycle;
import io.argoproj.models.V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecLivenessProbe;
import io.argoproj.models.V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecPorts;
import io.argoproj.models.V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecResources;
import io.argoproj.models.V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecSecurityContext;
import io.argoproj.models.V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecVolumeDevices;
import io.argoproj.models.V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecVolumeMounts;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-19T02:24:32.086Z[Etc/UTC]")
public class V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers {
  public static final String SERIALIZED_NAME_ARGS = "args";
  @SerializedName(SERIALIZED_NAME_ARGS)
  private List<String> args = null;

  public static final String SERIALIZED_NAME_COMMAND = "command";
  @SerializedName(SERIALIZED_NAME_COMMAND)
  private List<String> command = null;

  public static final String SERIALIZED_NAME_ENV = "env";
  @SerializedName(SERIALIZED_NAME_ENV)
  private List<V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecEnv> env = null;

  public static final String SERIALIZED_NAME_ENV_FROM = "envFrom";
  @SerializedName(SERIALIZED_NAME_ENV_FROM)
  private List<V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecEnvFrom> envFrom = null;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_IMAGE_PULL_POLICY = "imagePullPolicy";
  @SerializedName(SERIALIZED_NAME_IMAGE_PULL_POLICY)
  private String imagePullPolicy;

  public static final String SERIALIZED_NAME_LIFECYCLE = "lifecycle";
  @SerializedName(SERIALIZED_NAME_LIFECYCLE)
  private V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecLifecycle lifecycle;

  public static final String SERIALIZED_NAME_LIVENESS_PROBE = "livenessProbe";
  @SerializedName(SERIALIZED_NAME_LIVENESS_PROBE)
  private V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecLivenessProbe livenessProbe;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PORTS = "ports";
  @SerializedName(SERIALIZED_NAME_PORTS)
  private List<V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecPorts> ports = null;

  public static final String SERIALIZED_NAME_READINESS_PROBE = "readinessProbe";
  @SerializedName(SERIALIZED_NAME_READINESS_PROBE)
  private V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecLivenessProbe readinessProbe;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecResources resources;

  public static final String SERIALIZED_NAME_SECURITY_CONTEXT = "securityContext";
  @SerializedName(SERIALIZED_NAME_SECURITY_CONTEXT)
  private V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecSecurityContext securityContext;

  public static final String SERIALIZED_NAME_STARTUP_PROBE = "startupProbe";
  @SerializedName(SERIALIZED_NAME_STARTUP_PROBE)
  private V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecLivenessProbe startupProbe;

  public static final String SERIALIZED_NAME_STDIN = "stdin";
  @SerializedName(SERIALIZED_NAME_STDIN)
  private Boolean stdin;

  public static final String SERIALIZED_NAME_STDIN_ONCE = "stdinOnce";
  @SerializedName(SERIALIZED_NAME_STDIN_ONCE)
  private Boolean stdinOnce;

  public static final String SERIALIZED_NAME_TERMINATION_MESSAGE_PATH = "terminationMessagePath";
  @SerializedName(SERIALIZED_NAME_TERMINATION_MESSAGE_PATH)
  private String terminationMessagePath;

  public static final String SERIALIZED_NAME_TERMINATION_MESSAGE_POLICY = "terminationMessagePolicy";
  @SerializedName(SERIALIZED_NAME_TERMINATION_MESSAGE_POLICY)
  private String terminationMessagePolicy;

  public static final String SERIALIZED_NAME_TTY = "tty";
  @SerializedName(SERIALIZED_NAME_TTY)
  private Boolean tty;

  public static final String SERIALIZED_NAME_VOLUME_DEVICES = "volumeDevices";
  @SerializedName(SERIALIZED_NAME_VOLUME_DEVICES)
  private List<V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecVolumeDevices> volumeDevices = null;

  public static final String SERIALIZED_NAME_VOLUME_MOUNTS = "volumeMounts";
  @SerializedName(SERIALIZED_NAME_VOLUME_MOUNTS)
  private List<V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecVolumeMounts> volumeMounts = null;

  public static final String SERIALIZED_NAME_WORKING_DIR = "workingDir";
  @SerializedName(SERIALIZED_NAME_WORKING_DIR)
  private String workingDir;


  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers args(List<String> args) {
    
    this.args = args;
    return this;
  }

  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers addArgsItem(String argsItem) {
    if (this.args == null) {
      this.args = new ArrayList<>();
    }
    this.args.add(argsItem);
    return this;
  }

   /**
   * Get args
   * @return args
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getArgs() {
    return args;
  }


  public void setArgs(List<String> args) {
    this.args = args;
  }


  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers command(List<String> command) {
    
    this.command = command;
    return this;
  }

  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers addCommandItem(String commandItem) {
    if (this.command == null) {
      this.command = new ArrayList<>();
    }
    this.command.add(commandItem);
    return this;
  }

   /**
   * Get command
   * @return command
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCommand() {
    return command;
  }


  public void setCommand(List<String> command) {
    this.command = command;
  }


  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers env(List<V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecEnv> env) {
    
    this.env = env;
    return this;
  }

  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers addEnvItem(V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecEnv envItem) {
    if (this.env == null) {
      this.env = new ArrayList<>();
    }
    this.env.add(envItem);
    return this;
  }

   /**
   * Get env
   * @return env
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecEnv> getEnv() {
    return env;
  }


  public void setEnv(List<V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecEnv> env) {
    this.env = env;
  }


  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers envFrom(List<V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecEnvFrom> envFrom) {
    
    this.envFrom = envFrom;
    return this;
  }

  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers addEnvFromItem(V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecEnvFrom envFromItem) {
    if (this.envFrom == null) {
      this.envFrom = new ArrayList<>();
    }
    this.envFrom.add(envFromItem);
    return this;
  }

   /**
   * Get envFrom
   * @return envFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecEnvFrom> getEnvFrom() {
    return envFrom;
  }


  public void setEnvFrom(List<V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecEnvFrom> envFrom) {
    this.envFrom = envFrom;
  }


  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers image(String image) {
    
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImage() {
    return image;
  }


  public void setImage(String image) {
    this.image = image;
  }


  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers imagePullPolicy(String imagePullPolicy) {
    
    this.imagePullPolicy = imagePullPolicy;
    return this;
  }

   /**
   * Get imagePullPolicy
   * @return imagePullPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImagePullPolicy() {
    return imagePullPolicy;
  }


  public void setImagePullPolicy(String imagePullPolicy) {
    this.imagePullPolicy = imagePullPolicy;
  }


  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers lifecycle(V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecLifecycle lifecycle) {
    
    this.lifecycle = lifecycle;
    return this;
  }

   /**
   * Get lifecycle
   * @return lifecycle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecLifecycle getLifecycle() {
    return lifecycle;
  }


  public void setLifecycle(V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecLifecycle lifecycle) {
    this.lifecycle = lifecycle;
  }


  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers livenessProbe(V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecLivenessProbe livenessProbe) {
    
    this.livenessProbe = livenessProbe;
    return this;
  }

   /**
   * Get livenessProbe
   * @return livenessProbe
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecLivenessProbe getLivenessProbe() {
    return livenessProbe;
  }


  public void setLivenessProbe(V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecLivenessProbe livenessProbe) {
    this.livenessProbe = livenessProbe;
  }


  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers name(String name) {
    
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


  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers ports(List<V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecPorts> ports) {
    
    this.ports = ports;
    return this;
  }

  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers addPortsItem(V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecPorts portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<>();
    }
    this.ports.add(portsItem);
    return this;
  }

   /**
   * Get ports
   * @return ports
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecPorts> getPorts() {
    return ports;
  }


  public void setPorts(List<V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecPorts> ports) {
    this.ports = ports;
  }


  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers readinessProbe(V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecLivenessProbe readinessProbe) {
    
    this.readinessProbe = readinessProbe;
    return this;
  }

   /**
   * Get readinessProbe
   * @return readinessProbe
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecLivenessProbe getReadinessProbe() {
    return readinessProbe;
  }


  public void setReadinessProbe(V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecLivenessProbe readinessProbe) {
    this.readinessProbe = readinessProbe;
  }


  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers resources(V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecResources resources) {
    
    this.resources = resources;
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecResources getResources() {
    return resources;
  }


  public void setResources(V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecResources resources) {
    this.resources = resources;
  }


  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers securityContext(V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecSecurityContext securityContext) {
    
    this.securityContext = securityContext;
    return this;
  }

   /**
   * Get securityContext
   * @return securityContext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecSecurityContext getSecurityContext() {
    return securityContext;
  }


  public void setSecurityContext(V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecSecurityContext securityContext) {
    this.securityContext = securityContext;
  }


  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers startupProbe(V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecLivenessProbe startupProbe) {
    
    this.startupProbe = startupProbe;
    return this;
  }

   /**
   * Get startupProbe
   * @return startupProbe
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecLivenessProbe getStartupProbe() {
    return startupProbe;
  }


  public void setStartupProbe(V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecLivenessProbe startupProbe) {
    this.startupProbe = startupProbe;
  }


  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers stdin(Boolean stdin) {
    
    this.stdin = stdin;
    return this;
  }

   /**
   * Get stdin
   * @return stdin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getStdin() {
    return stdin;
  }


  public void setStdin(Boolean stdin) {
    this.stdin = stdin;
  }


  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers stdinOnce(Boolean stdinOnce) {
    
    this.stdinOnce = stdinOnce;
    return this;
  }

   /**
   * Get stdinOnce
   * @return stdinOnce
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getStdinOnce() {
    return stdinOnce;
  }


  public void setStdinOnce(Boolean stdinOnce) {
    this.stdinOnce = stdinOnce;
  }


  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers terminationMessagePath(String terminationMessagePath) {
    
    this.terminationMessagePath = terminationMessagePath;
    return this;
  }

   /**
   * Get terminationMessagePath
   * @return terminationMessagePath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTerminationMessagePath() {
    return terminationMessagePath;
  }


  public void setTerminationMessagePath(String terminationMessagePath) {
    this.terminationMessagePath = terminationMessagePath;
  }


  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers terminationMessagePolicy(String terminationMessagePolicy) {
    
    this.terminationMessagePolicy = terminationMessagePolicy;
    return this;
  }

   /**
   * Get terminationMessagePolicy
   * @return terminationMessagePolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTerminationMessagePolicy() {
    return terminationMessagePolicy;
  }


  public void setTerminationMessagePolicy(String terminationMessagePolicy) {
    this.terminationMessagePolicy = terminationMessagePolicy;
  }


  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers tty(Boolean tty) {
    
    this.tty = tty;
    return this;
  }

   /**
   * Get tty
   * @return tty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getTty() {
    return tty;
  }


  public void setTty(Boolean tty) {
    this.tty = tty;
  }


  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers volumeDevices(List<V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecVolumeDevices> volumeDevices) {
    
    this.volumeDevices = volumeDevices;
    return this;
  }

  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers addVolumeDevicesItem(V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecVolumeDevices volumeDevicesItem) {
    if (this.volumeDevices == null) {
      this.volumeDevices = new ArrayList<>();
    }
    this.volumeDevices.add(volumeDevicesItem);
    return this;
  }

   /**
   * Get volumeDevices
   * @return volumeDevices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecVolumeDevices> getVolumeDevices() {
    return volumeDevices;
  }


  public void setVolumeDevices(List<V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecVolumeDevices> volumeDevices) {
    this.volumeDevices = volumeDevices;
  }


  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers volumeMounts(List<V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecVolumeMounts> volumeMounts) {
    
    this.volumeMounts = volumeMounts;
    return this;
  }

  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers addVolumeMountsItem(V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecVolumeMounts volumeMountsItem) {
    if (this.volumeMounts == null) {
      this.volumeMounts = new ArrayList<>();
    }
    this.volumeMounts.add(volumeMountsItem);
    return this;
  }

   /**
   * Get volumeMounts
   * @return volumeMounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecVolumeMounts> getVolumeMounts() {
    return volumeMounts;
  }


  public void setVolumeMounts(List<V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecVolumeMounts> volumeMounts) {
    this.volumeMounts = volumeMounts;
  }


  public V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers workingDir(String workingDir) {
    
    this.workingDir = workingDir;
    return this;
  }

   /**
   * Get workingDir
   * @return workingDir
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWorkingDir() {
    return workingDir;
  }


  public void setWorkingDir(String workingDir) {
    this.workingDir = workingDir;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers v1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers = (V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers) o;
    return Objects.equals(this.args, v1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers.args) &&
        Objects.equals(this.command, v1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers.command) &&
        Objects.equals(this.env, v1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers.env) &&
        Objects.equals(this.envFrom, v1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers.envFrom) &&
        Objects.equals(this.image, v1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers.image) &&
        Objects.equals(this.imagePullPolicy, v1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers.imagePullPolicy) &&
        Objects.equals(this.lifecycle, v1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers.lifecycle) &&
        Objects.equals(this.livenessProbe, v1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers.livenessProbe) &&
        Objects.equals(this.name, v1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers.name) &&
        Objects.equals(this.ports, v1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers.ports) &&
        Objects.equals(this.readinessProbe, v1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers.readinessProbe) &&
        Objects.equals(this.resources, v1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers.resources) &&
        Objects.equals(this.securityContext, v1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers.securityContext) &&
        Objects.equals(this.startupProbe, v1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers.startupProbe) &&
        Objects.equals(this.stdin, v1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers.stdin) &&
        Objects.equals(this.stdinOnce, v1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers.stdinOnce) &&
        Objects.equals(this.terminationMessagePath, v1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers.terminationMessagePath) &&
        Objects.equals(this.terminationMessagePolicy, v1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers.terminationMessagePolicy) &&
        Objects.equals(this.tty, v1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers.tty) &&
        Objects.equals(this.volumeDevices, v1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers.volumeDevices) &&
        Objects.equals(this.volumeMounts, v1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers.volumeMounts) &&
        Objects.equals(this.workingDir, v1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers.workingDir);
  }

  @Override
  public int hashCode() {
    return Objects.hash(args, command, env, envFrom, image, imagePullPolicy, lifecycle, livenessProbe, name, ports, readinessProbe, resources, securityContext, startupProbe, stdin, stdinOnce, terminationMessagePath, terminationMessagePolicy, tty, volumeDevices, volumeMounts, workingDir);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1AnalysisTemplateSpecProviderJobSpecTemplateSpecContainers {\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    envFrom: ").append(toIndentedString(envFrom)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imagePullPolicy: ").append(toIndentedString(imagePullPolicy)).append("\n");
    sb.append("    lifecycle: ").append(toIndentedString(lifecycle)).append("\n");
    sb.append("    livenessProbe: ").append(toIndentedString(livenessProbe)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    readinessProbe: ").append(toIndentedString(readinessProbe)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    securityContext: ").append(toIndentedString(securityContext)).append("\n");
    sb.append("    startupProbe: ").append(toIndentedString(startupProbe)).append("\n");
    sb.append("    stdin: ").append(toIndentedString(stdin)).append("\n");
    sb.append("    stdinOnce: ").append(toIndentedString(stdinOnce)).append("\n");
    sb.append("    terminationMessagePath: ").append(toIndentedString(terminationMessagePath)).append("\n");
    sb.append("    terminationMessagePolicy: ").append(toIndentedString(terminationMessagePolicy)).append("\n");
    sb.append("    tty: ").append(toIndentedString(tty)).append("\n");
    sb.append("    volumeDevices: ").append(toIndentedString(volumeDevices)).append("\n");
    sb.append("    volumeMounts: ").append(toIndentedString(volumeMounts)).append("\n");
    sb.append("    workingDir: ").append(toIndentedString(workingDir)).append("\n");
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
