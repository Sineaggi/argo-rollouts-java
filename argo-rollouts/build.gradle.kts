plugins {
    `java-library`
}

dependencies {
    // implementation("com.google.code.gson:gson:2.10.1")
    // implementation("io.swagger:swagger-annotations:1.6.12")
    api("io.kubernetes:client-java:19.0.0")
}

tasks.withType<JavaCompile>().configureEach {
    options.release.set(11)
}
