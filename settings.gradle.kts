pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        // --- EdgeASR Added: JitPack Repository ---
        // 这行代码允许我们直接引用 GitHub 上的开源项目
        maven { url = uri("https://jitpack.io") }
    }
}

rootProject.name = "Voice Recorder"
include(":app")
