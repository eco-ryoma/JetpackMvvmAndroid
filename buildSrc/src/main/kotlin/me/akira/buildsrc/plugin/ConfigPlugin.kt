@file:Suppress("SpellCheckingInspection")

package me.akira.buildsrc.plugin

import me.akira.buildsrc.VersionConfig
import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * @author Akira
 * @date 2020-12-09
 * @description
 * <p>
 * Copyright (c) 2020, eco-ryoma.
 * All rights reserved.
 */
class ConfigPlugin : Plugin<Project> {
    override fun apply(project: Project) {

        with(project) {
            //读取gradle.properties中的配置，如果有则覆盖Version中配置的值
            findProperty("VERSION_NAME")?.also {
                VersionConfig.versionName = it as String
            }
            findProperty("VERSION_CODE")?.also {
                VersionConfig.versionCode = it as Int
            }
        }
    }
}