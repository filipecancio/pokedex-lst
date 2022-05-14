package dev.cancio.pokedex.ui.component.organism

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import dev.cancio.pokedex.ui.screen.HomeScreen
import dev.cancio.pokedex.ui.screen.LikeScreen
import dev.cancio.pokedex.ui.component.organism.BottomNavItem.Likes
import dev.cancio.pokedex.ui.component.organism.BottomNavItem.Home

@Composable
fun PokeBar(navController: NavController, itemList: List<BottomNavItem>)  {
    var selectedItem by remember { mutableStateOf(0) }
    NavigationBar {
        itemList.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = { Icon(item.icon, contentDescription = null) },
                label = { Text(item.title) },
                selected = selectedItem == index,
                onClick = {
                    selectedItem = index
                    navController.navigate(item.route){
                        navController.graph.startDestinationRoute?.let { route ->
                            popUpTo(route) {
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                }
            )
        }
    }
}

@Composable
fun MainNavigation(navController: NavHostController, itemList: List<BottomNavItem>) {
    NavHost(navController = navController, startDestination = itemList.first().route) {
        itemList.forEach { item -> composable(item.route) { item.screen.invoke() } }
    }
}

sealed class BottomNavItem(
    val route: String,
    val icon: ImageVector,
    val title: String,
    val screen: (@Composable () -> Unit)) {
    object Home : BottomNavItem("home", Icons.Filled.Home, "Home", { HomeScreen() })
    object Likes : BottomNavItem("likes", Icons.Filled.Favorite, "Likes", { LikeScreen() })
}

sealed class PokedexRoutes(val itemList: List<BottomNavItem>){
    object MainRoute: PokedexRoutes(listOf(Home, Likes))
}