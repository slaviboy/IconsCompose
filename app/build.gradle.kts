plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdk = ApplicationConfiguration.compileSdk
    defaultConfig {
        applicationId = "com.slaviboy.iconscomposeexample"
        minSdk = ApplicationConfiguration.minSdk
        targetSdk = ApplicationConfiguration.targetSdk
        testInstrumentationRunner = ApplicationConfiguration.androidTestInstrumentation
        versionCode = ApplicationConfiguration.versionCode
        versionName = ApplicationConfiguration.versionName
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = ApplicationDependencyVersions.compose
    }
}

dependencies {
    implementation(ApplicationDependencies.dependenciesApp)
    implementation(project(mapOf("path" to ":iconsCompose")))
}