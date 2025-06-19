plugins {
    id("com.microej.gradle.runtime-environment") version "1.3.0"
}

group = "com.mycompany"
version = "0.1.0-RC"

dependencies {
    implementation("com.microej.kernelapi:edc:1.2.0")
    api("ej.api:edc:1.3.5")
}
