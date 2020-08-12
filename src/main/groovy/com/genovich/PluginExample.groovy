package com.genovich

import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project

class PluginExample implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.pluginManager.apply("com.android.library")
        project.pluginManager.apply("kotlin-android")
        project.pluginManager.apply("kotlin-android-extensions")
        project.pluginManager.apply("kotlin-kapt")

        project.android {
            compileSdkVersion Versions.sdk.compile

            defaultConfig {
                minSdkVersion Versions.sdk.min
                targetSdkVersion Versions.sdk.target
            }

            // prefix: modulename_
            resourcePrefix "${project.name.replace("-", "_")}_"

            lintOptions {
                baseline "lint-baseline.xml"
            }

            compileOptions {
                encoding 'UTF-8'
                sourceCompatibility JavaVersion.VERSION_1_8
                targetCompatibility JavaVersion.VERSION_1_8
            }

            testOptions {
                unitTests {
                    returnDefaultValues true
                    includeAndroidResources true
                }
            }
        }

        project.repositories {
            google()
            mavenCentral()
            jcenter()
        }

        project.dependencies {
            implementation Dependencies.okhttp
            implementation Dependencies.gson

            implementation Dependencies.retrofit.retrofit
            implementation Dependencies.retrofit.converterGson

            implementation Dependencies.androidx.appcompat
            implementation Dependencies.androidx.core
            implementation Dependencies.androidx.fragment

            implementation Dependencies.androidx.lifecycle.extensions
            implementation Dependencies.androidx.lifecycle.savedState
            implementation Dependencies.androidx.lifecycle.viewModel
            implementation Dependencies.androidx.lifecycle.liveData
            implementation Dependencies.androidx.lifecycle.process

            // JSR-310 android backport
            implementation Dependencies.threeten.androidBackport
            // added for documentation, should be the same version as in ABP to avoid conflicts
            compileOnly Dependencies.threeten.backport

            implementation Dependencies.dagger.dagger
            implementation Dependencies.dagger.android
            kapt Dependencies.dagger.compiler
            kapt Dependencies.dagger.androidProcessor

            implementation Dependencies.kotlin.stdlib
            implementation Dependencies.kotlin.coroutines.core
            implementation Dependencies.kotlin.coroutines.android

            testImplementation Dependencies.test.junit
            testImplementation Dependencies.test.assertj
            testImplementation Dependencies.test.kotlin.mockito
            testImplementation Dependencies.test.kotlin.reflect
            testImplementation Dependencies.test.kotlin.coroutines
            testImplementation Dependencies.test.androidx.core
            testImplementation Dependencies.test.androidx.junit
            testImplementation Dependencies.test.robolectric
            testImplementation Dependencies.test.espresso.core
            testImplementation Dependencies.test.espresso.intents
        }
    }
}