@file:Suppress("OPT_IN_IS_NOT_ENABLED")

package dev.cancio.pokedex.ui.component.atom

import androidx.compose.foundation.Image
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import dev.cancio.pokedex.R

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun PokemonList() {
    ListItem(
        text = { Text(text = "Pokemon") },
        icon = {
            Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "pokemon"
        )
        }
    )
}