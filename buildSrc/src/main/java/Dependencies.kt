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
    const val room = "androidx.room:room-runtime:${Versions.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
    const val roomKtx = "androidx.room:room-ktx:${Versions.room}"
    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"

    // Retrofit
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitMoshiAdapter = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"

    // Moshi
    const val moshi = "com.squareup.moshi:moshi:${Versions.moshi}"
    const val moshiKotlinCodegen = "com.squareup.moshi:moshi-kotlin-codegen:${Versions.moshi}"

    // Dagger 2
    const val dagger = "com.google.dagger:dagger:${Versions.dagger}"
    const val daggerCompiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"

    // Arrow
    const val arrowCore = "io.arrow-kt:arrow-core:${Versions.arrow}"
    const val arrowCoreData = "io.arrow-kt:arrow-core-data:${Versions.arrow}"
    const val arrowCoreExtensions = "io.arrow-kt:arrow-core-extensions:${Versions.arrow}"
    const val arrowCoreSyntax = "io.arrow-kt:arrow-syntax:${Versions.arrow}"
    const val arrowCoreTypeClasses = "io.arrow-kt:arrow-typeclasses:${Versions.arrow}"
    const val arrowExtrasData = "io.arrow-kt:arrow-extras-data:${Versions.arrow}"
    const val arrowExtrasExtensions = "io.arrow-kt:arrow-extras-extensions:${Versions.arrow}"
    const val arrowMeta = "io.arrow-kt:arrow-meta:${Versions.arrow}"

    const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"

    const val jUnit = "junit:junit:${Versions.jUnit}"
    const val testRunner = "androidx.test:runner:${Versions.testRunner}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
}
