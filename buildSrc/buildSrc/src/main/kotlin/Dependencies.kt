object Dependencies {

    object Kotlin {
        private const val version = "1.7.10"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"

        object Serialization {
            private const val plugin = "1.6.21"
            const val gradlePlugin = "org.jetbrains.kotlin:kotlin-serialization:$plugin"

            private const val version = "1.4.0"
            const val serialization = "org.jetbrains.kotlinx:kotlinx-serialization-json:$version"
        }

        object Coroutines {
            private const val version = "1.6.4"
            const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
        }
    }

    object Image {
        object Coil {
            private const val version = "2.2.2"
            const val core = "io.coil-kt:coil:$version"
            const val compose = "io.coil-kt:coil-compose:$version"
        }
    }

    object Compose {
        private const val version = "1.2.1"
        const val gradlePlugin = "org.jetbrains.compose:compose-gradle-plugin:$version"
    }

    object Android {
        private const val version = "7.3.1"
        const val gradlePlugin = "com.android.tools.build:gradle:$version"
        const val composeActivity = "androidx.activity:activity-compose:1.6.1"

        object Compose {
            private const val version = "1.3.1"
            const val runtime = "androidx.compose.runtime:runtime:$version"
            const val ui = "androidx.compose.ui:ui:$version"
            const val material = "androidx.compose.material:material:$version"
            const val tooling = "androidx.compose.ui:ui-tooling:$version"
            const val icons = "androidx.compose.material:material-icons-core:$version"        }
    }

    object Settings {
        private const val version = "1.0.0-RC"
        const val core = "com.russhwolf:multiplatform-settings:$version"
        const val noargs= "com.russhwolf:multiplatform-settings-no-arg:$version"
    }

    object Kodein {
        private const val version = "7.16.0"
        const val core = "org.kodein.di:kodein-di:$version"
    }

    object Ktor {
        private const val version = "2.1.3"
        const val core = "io.ktor:ktor-client-core:$version"
        const val json = "io.ktor:ktor-client-json:$version"
        const val ios = "io.ktor:ktor-client-ios:$version"
        const val negotiation = "io.ktor:ktor-client-content-negotiation:$version"
        const val kotlin_json = "io.ktor:ktor-serialization-kotlinx-json:$version"
        const val serialization = "io.ktor:ktor-client-serialization:$version"
        const val logging = "io.ktor:ktor-client-logging:$version"
        const val android = "io.ktor:ktor-client-android:$version"
        const val okhttp = "io.ktor:ktor-client-okhttp:$version"
    }

    object SqlDelight {
        private const val version = "1.5.4"
        const val gradlePlugin = "com.squareup.sqldelight:gradle-plugin:$version"
        const val core = "com.squareup.sqldelight:runtime:$version"
        const val runtime = "com.squareup.sqldelight:runtime:$version"
        const val android = "com.squareup.sqldelight:android-driver:$version"
        const val ios = "com.squareup.sqldelight:native-driver:$version"
        const val desktop = "com.squareup.sqldelight:sqlite-driver:$version"
    }

    object Other {
        object ViewModel {
            private const val version = "0.12"
            const val core = "com.adeo:kviewmodel:$version"
            const val compose = "com.adeo:kviewmodel-compose:$version"
            const val odyssey = "com.adeo:kviewmodel-odyssey:$version"
        }

        object Navigation {
            private const val version = "1.2.0"
            const val core = "io.github.alexgladkov:odyssey-core:$version"
            const val compose = "io.github.alexgladkov:odyssey-compose:$version"
        }
    }
}