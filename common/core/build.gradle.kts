plugins {
    id("multiplatform-setup")
    id("android-setup")
    kotlin("plugin.serialization")
}

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                api(Dependencies.Kotlin.Serialization.serialization)
                api(Dependencies.Kotlin.Coroutines.core)

                api(Dependencies.Ktor.core)
                implementation(Dependencies.Ktor.json)
                implementation(Dependencies.Ktor.serialization)
                implementation(Dependencies.Ktor.negotiation)
                implementation(Dependencies.Ktor.kotlin_json)
                implementation(Dependencies.Ktor.logging)

                api(Dependencies.Kodein.core)

                api(Dependencies.SqlDelight.core)
            }
        }

        androidMain {
            dependencies {
                implementation(Dependencies.Ktor.android)
            }
        }

        iosMain {
            dependencies {
                implementation(Dependencies.Ktor.ios)
            }
        }

        iosSimulatorArm64Main {
            dependencies {
                implementation(Dependencies.Ktor.ios)
            }
        }

        desktopMain {
            dependencies {
                implementation(Dependencies.Ktor.okhttp)
            }
        }
    }
}