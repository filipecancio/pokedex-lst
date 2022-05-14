package dev.cancio.pokedex.ui.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.cancio.pokedex.api.PokemonResponse
import dev.cancio.pokedex.ui.component.atom.PokemonList

@Composable
fun LikeScreen() {
    val pokemonList = PokemonResponse.POKEMON_PAGINATION_MOCK.results
    LazyColumn(
        Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        items(
            items = pokemonList,
            itemContent = { PokemonList(it) }
        )
    }
}