package dev.cancio.pokedex.model

import androidx.compose.ui.graphics.Color
import dev.cancio.pokedex.model.enum.PokemonColors

data class Pokemon(
    val name: String = "",
    val url: String = ""
) {
    val id: Int
        get() = url.removePrefix("https://pokeapi.co/api/v2/pokemon/").removeSuffix("/").toInt()

    val sprite: String
        get() = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/${id}.png"

    val color: Color
        get() = PokemonColors.values().toList().shuffled().first().color
}