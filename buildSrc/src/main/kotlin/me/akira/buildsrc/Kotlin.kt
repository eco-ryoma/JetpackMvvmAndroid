@file:Suppress("SpellCheckingInspection")

package me.akira.buildsrc

/**
 * @author Akira
 * @date 2020-12-09
 * @description kotlin相关库
 * <p>
 * Copyright (c) 2020, eco-ryoma.
 * All rights reserved.
 */
object Kotlin {
    private const val kotlinVersion = "1.4.10"
    const val stdlibJdk7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlinVersion"
    const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"

    private const val kotlinCoroutines = "1.3.8"
    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinCoroutines"
    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$kotlinCoroutines"
}