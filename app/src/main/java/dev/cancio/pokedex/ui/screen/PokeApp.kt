package dev.cancio.pokedex.ui.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dev.cancio.pokedex.ui.theme.PokedexTheme

@Composable
fun PokeApp() {
    PokedexTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            PokedexTheme {
                HomeScreen()
            }
        }
    }
}