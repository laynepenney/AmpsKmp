enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven { url = File(rootDir, "repo").toURI() }
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven { url = File(rootDir, "repo").toURI() }
    }
}

rootProject.name = "AmpsKMP"
include(":android")
include(":shared")
//includeBuild("../AmpsKMPLib")