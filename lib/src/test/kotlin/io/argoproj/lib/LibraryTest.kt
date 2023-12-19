package io.argoproj.lib

import io.argoproj.models.V1alpha1Rollout
import io.argoproj.models.V1alpha1RolloutList
import io.kubernetes.client.common.KubernetesObject
import io.kubernetes.client.util.ModelMapper
import io.kubernetes.client.util.Yaml
import java.io.InputStreamReader
import java.io.StringReader
import kotlin.test.Test
import kotlin.test.assertTrue

class LibraryTest {
    @Test
    fun testLoadRollout() {
        ModelMapper.addModelMap(
            "argoproj.io",
            "v1alpha1",
            "Rollout",
            "rollouts",
            V1alpha1Rollout::class.java,
            V1alpha1RolloutList::class.java,
        );
        val obj = InputStreamReader(LibraryTest::class.java.getResourceAsStream("/wednesday-test-app.yaml")).use {
            Yaml.loadAll(it)
        }
        val rollout = obj.first { it is KubernetesObject && it.kind == "Rollout" } as V1alpha1Rollout
        rollout.metadata?.name
    }
}
