package dev.cancio.pokedex.model

import androidx.compose.ui.graphics.Color
import dev.cancio.pokedex.model.Poketype.*

data class PokemonType(
    val slot: Poketype,
    val type: String
){
    val color: Color
    get() = when(slot){
        normal-> PokemonColors.BLACK.color
        fighting-> PokemonColors.BROWN.color
        flying-> PokemonColors.BLUE.color
        poison-> PokemonColors.PURPLE.color
        ground-> PokemonColors.BROWN.color
        rock-> PokemonColors.GRAY.color
        bug-> PokemonColors.GREEN.color
        ghost-> PokemonColors.GRAY.color
        steel-> PokemonColors.GRAY.color
        fire-> PokemonColors.YELLOW.color
        water-> PokemonColors.BLUE.color
        grass-> PokemonColors.GREEN.color
        electric-> PokemonColors.YELLOW.color
        psychic-> PokemonColors.PINK.color
        ice-> PokemonColors.BLUE.color
        dragon-> PokemonColors.BLUE.color
        dark-> PokemonColors.BLACK.color
        fairy-> PokemonColors.PINK.color
        unknown-> PokemonColors.WHITE.color
        shadow-> PokemonColors.BLACK.color
    }
}

enum class Poketype(val slot: Int){
    normal(1),
    fighting(2),
    flying(3),
    poison(4),
    ground(5),
    rock(6),
    bug(7),
    ghost(8),
    steel(9),
    fire(10),
    water(11),
    grass(12),
    electric(13),
    psychic(14),
    ice(15),
    dragon(16),
    dark(17),
    fairy(18),
    unknown(19),
    shadow(20),
}