// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:7.2.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.10")
        classpath("com.github.dcendents:android-maven-gradle-plugin:2.1")
        classpath("com.google.dagger:hilt-android-gradle-plugin:${Hilt.version}")
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }

    group = "com.github.danchoo21"
}

//plugins {
//    id ("com.android.application") version "7.2.0" apply false
//    id ("com.android.library") version "7.2.0" apply false
//    id ("rg.jetbrains.kotlin.android") version "1.6.10" apply false
//    id ("com.google.dagger.hilt.android") version "2.42" apply false
//}

tasks {
    val clean by registering(Delete::class) {
        delete(buildDir)
    }
}

tasks.register<DefaultTask>("command") {
    // Gradle Command
}