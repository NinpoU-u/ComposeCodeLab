package com.example.composecodelab.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Same as Light for now
private val ShrineDarkColorPalette = darkColors(
    primary = ShrinePink100,
    primaryVariant = ShrinePink500,
    secondary = ShrinePink50,
    background = ShrinePink100,
    surface = ShrinePink10,
    error = Color(0xffc5032b),
    onPrimary = ShrinePink900,
    onSecondary = ShrinePink900,
    onBackground = ShrinePink900,
    onSurface = ShrinePink900,
    onError = ShrinePink10
)

internal val ShrineLightColorPalette = lightColors(
    primary = ShrinePink100,
    primaryVariant = ShrinePink500,
    secondary = ShrinePink50,
    background = ShrinePink100,
    surface = ShrinePink10,
    error = Color(0xffc5032b),
    onPrimary = ShrinePink900,
    onSecondary = ShrinePink900,
    onBackground = ShrinePink900,
    onSurface = ShrinePink900,
    onError = ShrinePink10
)

@Composable
fun ShrineTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        ShrineDarkColorPalette
    } else {
        ShrineLightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}