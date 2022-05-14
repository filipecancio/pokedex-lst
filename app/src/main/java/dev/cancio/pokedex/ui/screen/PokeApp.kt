@file:Suppress("OPT_IN_IS_NOT_ENABLED")

package dev.cancio.pokedex.ui.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import dev.cancio.pokedex.ui.component.organism.MainNavigation
import dev.cancio.pokedex.ui.component.organism.PokeBar
import dev.cancio.pokedex.ui.component.organism.PokedexRoutes.MainRoute
import dev.cancio.pokedex.ui.theme.PokedexTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PokeApp() {
    PokedexTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background,
        ) {
            val navController = rememberNavController()
            Scaffold(
                bottomBar = { PokeBar(navController, MainRoute.itemList )}
            ) {
                MainNavigation(navController, MainRoute.itemList )
            }
        }
    }
}