@file:Suppress("SpellCheckingInspection")

package me.akira.buildsrc

/**
 * @author Akira
 * @date 2020-12-09
 * @description androidx依赖库
 * <p>
 * Copyright (c) 2020, eco-ryoma.
 * All rights reserved.
 */
object AndroidX {
    val appcompat = "androidx.appcompat:appcompat:1.2.0"
    val recyclerView = "androidx.recyclerview:recyclerview:1.1.0"
    val core = "androidx.core:core:1.3.2"
    val coreKtx = "androidx.core:core-ktx:1.3.2"
    val constraintlayout = "androidx.constraintlayout:constraintlayout:2.0.4"
    val coordinatorlayout = "androidx.coordinatorlayout:coordinatorlayout:1.1.0"
    val cardview = "androidx.cardview:cardview:1.0.0"
    val multidex = "androidx.multidex:multidex:2.0.1"
    val viewpager = "androidx.viewpager:viewpager:1.0.0"
    val viewpager2 = "androidx.viewpager2:viewpager2:1.0.0"
    val startup = "androidx.startup:startup-runtime:1.0.0"

    object Activity {
        private const val activity_version = "1.1.0"
        val activity = "androidx.activity:activity:$activity_version"
        val activityKtx = "androidx.activity:activity-ktx:$activity_version"
    }

    object Fragment {
        private const val fragment_version = "1.3.0-alpha05"
        val fragment = "androidx.fragment:fragment:$fragment_version"
        val fragmentKtx = "androidx.fragment:fragment-ktx:$fragment_version"
        val fragmentTesting = "androidx.fragment:fragment-testing:$fragment_version"
    }

    object Lifecycle {
        private const val lifecycle_version = "2.2.0"
        val liveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version"
        val viewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
        val viewModelSavedState =
            "androidx.lifecycle:lifecycle-viewmodel-savedstate:$lifecycle_version"
        val commonJava8 = "androidx.lifecycle:lifecycle-common-java8:$lifecycle_version"
        val service = "androidx.lifecycle:lifecycle-service:$lifecycle_version"
    }

    object Navigation {
        private const val navigation_version = "2.3.2"
        val fragment = "androidx.navigation:navigation-fragment:$navigation_version"
        val ui = "androidx.navigation:navigation-ui:$navigation_version"

        val fragmentKtx = "androidx.navigation:navigation-fragment-ktx:$navigation_version"
        val uiKtx = "androidx.navigation:navigation-ui-ktx:$navigation_version"
    }

    object Room {
        private const val room_version = "2.2.5"
        val roomRuntime = "androidx.room:room-runtime:$room_version"
        val roomCompiler = "androidx.room:room-compiler:$room_version"
        val roomKtx = "androidx.room:room-ktx:$room_version"
        val roomTest = "androidx.room:room-testing:$room_version"
    }

    object Paging {
        private const val paging_version = "2.1.2"

        val pagingRuntime = "androidx.paging:paging-runtime:$paging_version"
        val pagingRuntimeKtx = "androidx.paging:paging-runtime-ktx:$paging_version"

        val pagingCommon = "androidx.paging:paging-common:$paging_version"
        val pagingCommonKtx = "androidx.paging:paging-common-ktx:$paging_version"

        val pagingRxjava2 = "androidx.paging:paging-rxjava2:$paging_version"
        val pagingRxjava2Ktx = "androidx.paging:paging-rxjava2-ktx:$paging_version"
    }

    object Preference {
        private const val preference_version = "1.1.1"
        val preference = "androidx.preference:preference:$preference_version"
        val preferenceKtx = "androidx.preference:preference-ktx:$preference_version"
    }
}