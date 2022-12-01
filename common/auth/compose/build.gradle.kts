plugins {
    id("multiplatform-compose-setup")
    id("android-setup")
}

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                implementation(project(":common:auth:presentation"))

                implementation(Dependencies.Other.ViewModel.core)
            }
        }
    }
}