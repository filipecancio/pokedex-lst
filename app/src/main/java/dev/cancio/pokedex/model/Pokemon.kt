package dev.cancio.pokedex.model

import androidx.compose.ui.graphics.Color

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

enum class PokemonColors(val color: Color) {
    BLACK(Color(0xFF000000)),
    BLUE(Color(0xFF1D8ACB)),
    BROWN(Color(0xFF5C4C08)),
    GRAY(Color(0xFFCFCFCF)),
    GREEN(Color(0xFF4BA35D)),
    PINK(Color(0xFFBF2871)),
    PURPLE(Color(0xFF315FC1)),
    RED(Color(0xFFF25F5C)),
    WHITE(Color(0xFFFFFFFF)),
    YELLOW(Color(0xFFFCD116)),
}