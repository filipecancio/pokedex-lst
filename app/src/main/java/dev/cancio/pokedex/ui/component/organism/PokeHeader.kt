package dev.cancio.pokedex.ui.component.organism

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import dev.cancio.pokedex.ui.theme.Typography
import dev.cancio.pokedex.ui.theme.red_1
import dev.cancio.pokedex.ui.theme.yellow_1

@Composable
fun PokeHeader() {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = "Pokedex",
                style = Typography.headlineSmall,
                color = red_1
            )
        },
        actions = {
            IconButton(onClick = { /* doSomething() */ }) {
                Icon(
                    imageVector = Icons.Filled.AccountCircle,
                    contentDescription = "Localized description",
                    tint = red_1
                )
            }
        },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = yellow_1
        ),
    )
}
/*


 */