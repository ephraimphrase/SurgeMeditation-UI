package com.surgetech.surge_meditation

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

data class Feature(
    val title: String,
    @DrawableRes val iconid: Int,
    val lightColor: Color,
    val mediumColor: Color,
    val darkColor: Color,
)
