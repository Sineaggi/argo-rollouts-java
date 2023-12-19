# Regenerate argo-rollouts models
```shell
mkdir -p /tmp/java && cd /tmp/java
/tmp/java % docker run \
  --rm \
  -v /var/run/docker.sock:/var/run/docker.sock \
  -v "$(pwd)":"$(pwd)" \
  -ti \
  --network host \
  ghcr.io/kubernetes-client/java/crd-model-gen:v1.0.6 \
  /generate.sh \
  -u https://github.com/argoproj/argo-rollouts/releases/download/v1.6.4/install.yaml \
  -n io.argoproj \
  -p io.argoproj \
  -o "$(pwd)"
```

# Fix models

Search and replace
`import io.argoproj.models.V1alpha1AnalysisTemplateSpecProviderJobMetadata;`
with 
`import io.kubernetes.client.openapi.models.V1ObjectMeta;`

Search and replace
`V1alpha1AnalysisTemplateSpecProviderJobMetadata`
with
`V1ObjectMeta`

Make each object that needs to be a k8s object (i.e. `V1alpha1Experiment`) implement `KubernetesObject`

Nested objects need help

# problems
* wrong imports
* not all k8s objects implement `KubernetesObject`
* still uses nullable and generated annotations





# after some hacking we have a new set of search/replacements

io.argoproj.models.IoK8sApimachineryPkgUtilIntstrIntOrString -> io.kubernetes.client.custom.IntOrString

io.argoproj.models.IoK8sApimachineryPkgApisMetaV1Time -> java.time.OffsetDateTime

io.argoproj.models.IoK8sApiBatchV1JobSpec -> io.kubernetes.client.openapi.models.V1JobSpec

io.argoproj.models.IoK8sApimachineryPkgApisMetaV1LabelSelector -> io.kubernetes.client.openapi.models.V1LabelSelector

io.argoproj.models.IoK8sApiBatchV1JobSpec -> io.kubernetes.client.openapi.models.V1JobSpec

io.argoproj.models.IoK8sApiCoreV1PodTemplateSpec -> io.kubernetes.client.openapi.models.V1PodTemplateSpec
