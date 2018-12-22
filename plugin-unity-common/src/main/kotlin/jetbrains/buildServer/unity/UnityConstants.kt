/*
 * Copyright 2000-2018 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * See LICENSE in the project root for license information.
 */

package jetbrains.buildServer.unity

/**
 * Cargo runner constants.
 */
object UnityConstants {
    const val RUNNER_TYPE = "unity"
    const val RUNNER_DISPLAY_NAME = "Unity"
    const val RUNNER_DESCRIPTION = "Provides build support for Unity projects"
    const val UNITY_CONFIG_NAME = "$RUNNER_TYPE.path."

    const val PARAM_PROJECT_PATH = "projectPath"
    const val PARAM_EXECUTE_METHOD = "executeMethod"
    const val PARAM_BUILD_TARGET = "buildTarget"
    const val PARAM_BUILD_PLAYER = "buildPlayer"
    const val PARAM_BUILD_PLAYER_PATH = "buildPlayerPath"
    const val PARAM_NO_GRAPHICS = "noGraphics"
    const val PARAM_ARGUMENTS = "arguments"
    const val PARAM_UNITY_VERSION = "unityVersion"
    const val PARAM_RUN_EDITOR_TESTS = "runEditorTests"
    const val PARAM_TEST_PLATFORM = "testPlatform"
    const val PARAM_TEST_CATEGORIES = "testCategories"
    const val PARAM_TEST_NAMES = "testNames"

    const val VAR_UNITY_HOME = "UNITY_HOME"
}
