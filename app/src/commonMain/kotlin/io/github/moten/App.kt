package io.github.moten

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.viewmodel.compose.viewModel
import io.github.moten.app.generated.resources.Res
import io.github.moten.app.generated.resources.round_home_24
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
@Preview
fun App() {
    val viewModel: MainViewModel = viewModel{ MainViewModel() }

    val items = listOf("Home", "repositories", "stars", "profile")
    val selected = remember { mutableIntStateOf(0) }

    AppTheme(
        bottomBar = {
            NavigationBar {
                items.forEachIndexed { index, string ->
                    NavigationBarItem(
                        selected = selected.value == index,
                        onClick = { selected.value = index },
                        icon = {
                            Icon(
                                painter = painterResource( Res.drawable.round_home_24),
                                contentDescription = string
                            )
                        },
                        label = { Text(text = string) }
                    )
                }

            }
        }
    ) {

    }
}