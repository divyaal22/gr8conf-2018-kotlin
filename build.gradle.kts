/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn how to create Gradle builds at https://guides.gradle.org/creating-new-gradle-builds/
 */

buildscript {
    repositories {
        mavenLocal()
        jcenter()
    }
}

group = "gr8conf"

plugins {
    id("nebula.kotlin") version "1.2.51"
}

apply<JavaLibraryPlugin>()
apply<GroovyPlugin>()

repositories {
    mavenLocal()
    jcenter()
}

dependencies {
    compile("org.jetbrains.kotlin:kotlin-reflect:1.2.51")
    compile("org.codehaus.groovy:groovy:2.5.0")
    compile("com.fasterxml.jackson.module:jackson-module-kotlin:2.9.6")
    compile("me.drmaas:ratpack-kotlin-dsl:1.5.0")
}

tasks {
    val wrapper by creating(Wrapper::class) {
        gradleVersion = "4.7"
    }
}