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
import dev.cancio.pokedex.ui.screen.HomeScreen
import dev.cancio.pokedex.ui.screen.LikeScreen

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

sealed class BottomNavItem(
    val route: String,
    val icon: ImageVector,
    val title: String,
    val screen: (@Composable () -> Unit)) {
    object Home : BottomNavItem("home", Icons.Filled.Home, "Home", { HomeScreen() })
    object Likes : BottomNavItem("likes", Icons.Filled.Favorite, "Likes", { LikeScreen() })
}