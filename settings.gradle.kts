pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "KMM_Mobile_App"
include(":androidApp")
include(":shared")
include(":common:auth:api")
include(":common:auth:presentation")
include(":common:auth:data")
include(":common:tournament:api")
include(":common:tournament:presentation")
include(":common:tournament:data")
include(":common:games:api")
include(":common:games:presentation")
include(":common:games:data")
include(":common:core")
