@file:Suppress("OPT_IN_IS_NOT_ENABLED")

package dev.cancio.pokedex.ui.component.atom

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ListItem
import androidx.compose.material3.Text
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import dev.cancio.pokedex.R
import dev.cancio.pokedex.model.Pokemon
import dev.cancio.pokedex.ui.theme.md_theme_dark_secondary
import dev.cancio.pokedex.ui.theme.md_theme_light_outline

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun PokemonList(pokemon: Pokemon) {
    ListItem(
        text = { Text(text = pokemon.name) },
        icon = {
            Box(
                modifier = Modifier
                    .width(40.dp)
                    .height(40.dp)
                    .background(
                        pokemon.color,
                        shape = RoundedCornerShape(30.dp)
                    )
                    .padding(5.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.pikachu),
                    contentDescription = "pokemon",
                    modifier = Modifier.size(40.dp)
                )
            }
        }
    )
}