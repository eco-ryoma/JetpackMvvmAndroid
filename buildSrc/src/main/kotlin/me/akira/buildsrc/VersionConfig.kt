@file:Suppress("SpellCheckingInspection")

package me.akira.buildsrc

/**
 * <pre>
 *     @author   : chenyijun
 *     @date     : 2020-08-07
 *     describe  : 依赖库版本信息配置
 * <p>
 *     Copyright(c) 2020 CUNW, All Rights Reserved.
 * </pre>
 */
object VersionConfig {

    val compileSdkVersion = 30
    val buildToolsVersion = "30.0.2"
    val minSdkVersion = 19
    val targetSdkVersion = 30

    //在gradle.properties中配置会覆盖该值
    var versionName = "1.1.0"
    var versionCode = 1
}