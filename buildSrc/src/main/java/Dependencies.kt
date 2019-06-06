@file:Suppress("unused")

object Dependencies {
    // Gradle Plugins
    const val androidGradle = "com.android.tools.build:gradle:${Versions.androidGradle}"
    const val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"

    // Kotlin
    const val kotlinStandardLibrary = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"

    // Android X
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"

    // Arrow
    const val arrowCore = "io.arrow-kt:arrow-core:${Versions.arrow}"

    const val arrowCoreData = "io.arrow-kt:arrow-core-data:${Versions.arrow}"
    const val arrowCoreExtensions = "io.arrow-kt:arrow-core-extensions:${Versions.arrow}"
    const val arrowCoreSyntax = "io.arrow-kt:arrow-syntax:${Versions.arrow}"
    const val arrowCoreTypeClasses = "io.arrow-kt:arrow-typeclasses:${Versions.arrow}"
    const val arrowExtrasData = "io.arrow-kt:arrow-extras-data:${Versions.arrow}"
    const val arrowExtrasExtensions = "io.arrow-kt:arrow-extras-extensions:${Versions.arrow}"
    const val arrowMeta = "io.arrow-kt:arrow-meta:${Versions.arrow}"

    const val jUnit = "junit:junit:${Versions.jUnit}"
    const val testRunner = "androidx.test:runner:${Versions.testRunner}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
}
