@file:Suppress("OPT_IN_IS_NOT_ENABLED")

package dev.cancio.pokedex.ui.component.atom

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.capitalize
import androidx.compose.ui.unit.dp
import dev.cancio.pokedex.R
import dev.cancio.pokedex.model.Pokemon
import dev.cancio.pokedex.model.PokemonType
import dev.cancio.pokedex.model.enum.Poketype
import dev.cancio.pokedex.ui.theme.*
import java.util.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FeaturedCard(pokemon: Pokemon) {
    Box(
        Modifier
            .fillMaxWidth()
            .height(300.dp)
    ) {
        Box(
            modifier = Modifier
                .background(
                    md_theme_light_primaryContainer,
                    shape = RoundedCornerShape(30.dp)
                )
                .fillMaxWidth()
                .height(200.dp)
                .align(Alignment.BottomEnd)
        )
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.End
        ) {
            Image(
                painter = painterResource(id = R.drawable.pikachu),
                contentDescription = "pokemon",
                modifier = Modifier.size(200.dp)
            )
            Column(
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = pokemon.name.capital(),
                        style = Typography.headlineMedium,
                        color = red_1
                    )
                    TypesBadges(PokemonType())
                    TypesBadges(PokemonType())
                }
                Text(
                    text = "Featured Pokemon",
                    style = Typography.titleMedium,
                    color = white_1
                )
            }
        }
    }
}

fun String.capital() =
    this.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }