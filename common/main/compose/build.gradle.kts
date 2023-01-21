plugins {
  id("multiplatform-compose-setup")
  id("android-setup")
}

kotlin {
  sourceSets {
    commonMain {
      dependencies {
//        implementation(project(":common:main:presentation"))
        implementation(project(":common:core-compose"))
        implementation(project(":common:core-utils"))
      }
    }
  }
}