pluginManagement {
    repositories {
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
        maven("https://repo.papermc.io/repository/maven-public/")
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.9.0"
}

rootProject.name = "silverwolfpaper"

include(
    "api",
    "core", 
    "silverwolfpaper-api",
    "silverwolfpaper-server",
    "aspaper-api",
    "aspaper-server"
)