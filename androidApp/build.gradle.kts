plugins {
    id("com.android.application")
    id("org.jetbrains.compose")
    kotlin("android")
}

android {
    namespace = "com.example.kmmmobileapp.android"
    compileSdk = 33
    defaultConfig {
        applicationId = "com.example.kmmmobileapp.android"
        minSdk = 28
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.0"
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation(project(":common:core"))
    implementation(project(":common:umbrella-core"))
    implementation(project(":common:umbrella-compose"))
    implementation(project(":common:games:api"))
    implementation(project(":common:umbrella-core"))

    implementation(Dependencies.Android.Compose.runtime)
    implementation(Dependencies.Android.Compose.ui)
    implementation(Dependencies.Android.Compose.material)
    implementation(Dependencies.Android.Compose.icons)
    implementation(Dependencies.Android.Compose.tooling)

    implementation("com.google.android.material:material:1.7.0")
    implementation("androidx.appcompat:appcompat:1.5.1")
}