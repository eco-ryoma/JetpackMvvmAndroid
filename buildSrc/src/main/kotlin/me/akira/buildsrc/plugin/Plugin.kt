@file:Suppress("SpellCheckingInspection")

package me.akira.buildsrc.plugin

import org.gradle.api.Project

/**
 * @author Akira
 * @date 2020-12-09
 * @description
 * <p>
 * Copyright (c) 2020, eco-ryoma.
 * All rights reserved.
 */
internal fun Project.configurePlugins() {
    plugins.apply("kotlin-android")
    plugins.apply("kotlin-android-extensions")
    plugins.apply("kotlin-kapt")
}