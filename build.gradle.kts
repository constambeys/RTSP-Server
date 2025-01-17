// Top-level build file where you can add configuration options common to all sub-projects/modules.
val libraryGroup by rootProject.extra { "com.github.pedroSG94" }
val vCode by rootProject.extra { 127 }
val vName by rootProject.extra { "1.2.7" }
val coroutinesVersion by rootProject.extra { "1.7.3" }
val rootEncoderVersion by rootProject.extra { "2.4.4" }

plugins {
    id("com.android.application") version "8.3.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.23" apply false
    id("org.jetbrains.dokka") version "1.9.20" apply true
}

tasks.register("clean") {
    delete(layout.buildDirectory)
}

tasks.dokkaHtmlMultiModule.configure {
    outputDirectory.set(File("docs"))
}
