package dev.cancio.pokedex.ui.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.cancio.pokedex.ui.component.atom.FeaturedCard
import dev.cancio.pokedex.ui.component.atom.PokemonList

@Composable
fun HomeScreen() {
    val items = listOf("Pokemon","Pokemon","Pokemon","Pokemon","Pokemon")
    LazyColumn(
        Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        item {
            FeaturedCard()
        }
        items(
            count = items.size,
            itemContent = { PokemonList() }
        )
    }
}