package io.github.moten

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    modifier: Modifier = Modifier,
    content: @Composable (PaddingValues) -> Unit
) = MaterialTheme(
    colorScheme = if (darkTheme) darkColorScheme() else lightColorScheme()
) {
    Scaffold(
        modifier = modifier,
        content = content
    )
}