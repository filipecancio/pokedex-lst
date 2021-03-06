package dev.cancio.pokedex.ui.component.organism

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.cancio.pokedex.ui.screen.HomeScreen
import dev.cancio.pokedex.ui.screen.LikeScreen
import dev.cancio.pokedex.ui.component.organism.BottomNavItem.Likes
import dev.cancio.pokedex.ui.component.organism.BottomNavItem.Home
import dev.cancio.pokedex.ui.theme.*

@Composable
fun PokeBar(navController: NavController, itemList: List<BottomNavItem>)  {
    var selectedItem by remember { mutableStateOf(0) }
    var containerColor = poke_yellow_02
    var indicatorColor = poke_orange_01
    if(isSystemInDarkTheme()){
        containerColor = poke_bluegray_02
        indicatorColor = poke_magenta_01
    }
    NavigationBar(
        containerColor = containerColor,
    ) {
        itemList.forEachIndexed { index, item ->
            NavigationBarItem(
                colors = NavigationBarItemDefaults.colors(
                    indicatorColor = indicatorColor,
                    selectedIconColor = poke_red_01,
                    unselectedIconColor = poke_red_01,
                    selectedTextColor = poke_red_01,
                    unselectedTextColor = poke_red_01
                ),
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
    object Likes : BottomNavItem("likes", Icons.Filled.Star, "Likes", { LikeScreen() })
}

sealed class PokedexRoutes(val itemList: List<BottomNavItem>){
    object MainRoute: PokedexRoutes(listOf(Home, Likes))
}

@Preview
@Composable
fun previewPokeBar(){
    val navController = rememberNavController()
    PokeBar(navController, PokedexRoutes.MainRoute.itemList)
}