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
    private const val kotlinVersion = "1.4.20"
    val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion"
    val stdlibJdk7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlinVersion"
    val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion"

    private const val kotlinCoroutines = "1.3.8"
    val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinCoroutines"
    val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$kotlinCoroutines"
}