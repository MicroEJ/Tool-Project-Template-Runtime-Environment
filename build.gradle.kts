plugins {
    id("com.microej.gradle.runtime-environment") version "0.20.0-SNAPSHOT"
}

group = "com.mycompany"
version = "0.1.0-RC"

dependencies {
    implementation("com.microej.kernelapi:edc:1.2.0")
    implementation("ej.api:edc:1.3.7")
}
