plugins {
    `java-gradle-plugin`
    `kotlin-dsl`
    `maven-publish`
}

repositories {
    mavenCentral()
    maven {
        url = uri("https://jitpack.io")
    }
}