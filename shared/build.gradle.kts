import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
}

kotlin {
    androidTarget {
        compilations.all {
            compileTaskProvider.configure {
                compilerOptions {
                    jvmTarget.set(JvmTarget.JVM_1_8)
                }
            }
        }
    }
    
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "shared"
            isStatic = true
        }
    }

    sourceSets {
        commonMain.dependencies {
            //put your multiplatform dependencies here
            implementation(libs.ampskmp.lib.shared.common)
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
        iosX64Main.dependencies {
            implementation(libs.ampskmp.lib.shared.iosx64)
        }
        iosArm64Main.dependencies {
            implementation(libs.ampskmp.lib.shared.iosarm64)
        }
        iosSimulatorArm64Main.dependencies {
            implementation(libs.ampskmp.lib.shared.iossimulatorarm64)
        }
    }
}

android {
    namespace = "layne.pro.sample.ampskmp"
    compileSdk = 35
    defaultConfig {
        minSdk = 24
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}
