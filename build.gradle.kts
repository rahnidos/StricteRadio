// AGP 9 compiles Kotlin itself and ships Kotlin Gradle plugin 2.2.10.
// This classpath upgrades that plugin to the version pinned in the catalog.
// The Compose compiler plugin must use the same version.
buildscript {
    dependencies {
        classpath(libs.kotlin.gradle.plugin)
    }
}

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.compose.compiler) apply false
    alias(libs.plugins.kotlin.serialization) apply false
}
