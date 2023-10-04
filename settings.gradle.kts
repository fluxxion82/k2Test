pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven {
            url = uri("https://androidx.dev/storage/compose-compiler/repository/")
        }
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://androidx.dev/storage/compose-compiler/repository/")
        }
    }
}

rootProject.name = "k2Test"
include(":app")
include(":libraryOne")
include(":libraryTwo")

include(":sharedOne")
project(":sharedOne").projectDir = file("./SharedProject/sharedOne")
