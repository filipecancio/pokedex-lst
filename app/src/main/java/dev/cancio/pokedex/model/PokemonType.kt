package dev.cancio.pokedex.model

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import dev.cancio.pokedex.R
import dev.cancio.pokedex.model.PokemonType.Type.*
import dev.cancio.pokedex.model.enum.Poketype
import dev.cancio.pokedex.model.enum.Poketype.*
import dev.cancio.pokedex.ui.theme.*

data class PokemonType(
    val slot: Poketype,
    val type: String
) {
    val typeContent: Type
        get() = when (slot) {
            normal -> NormalType
            fighting -> FightingType
            flying -> FlyingType
            poison -> PoisonType
            ground -> GroundType
            rock -> RockType
            bug -> BugType
            ghost -> GhostType
            steel -> SteelType
            fire -> FireType
            water -> WaterType
            grass -> GrassType
            electric -> ElectricType
            psychic -> PsychicType
            ice -> IceType
            dragon -> DragonType
            dark -> DarkType
            fairy -> FairyType
            unknown -> UnknownType
            shadow -> ShadowType
        }

    sealed class Type(
        val title: String,
        val primaryColor: Color,
        val secondaryColor: Color,
        @DrawableRes val icon: Int
    ) {
        object NormalType :Type("normal", black_1,black_08, R.drawable.ic_normal)
        object FightingType :Type("fighting",brown_1,brown_08, R.drawable.ic_fighting)
        object FlyingType :Type("flying",blue_1,blue_08, R.drawable.ic_flying)
        object PoisonType :Type("poison",purple_1,purple_08, R.drawable.ic_poison)
        object GroundType :Type("ground",brown_1,brown_08, R.drawable.ic_ground)
        object RockType :Type("rock",gray_1,gray_08, R.drawable.ic_rock)
        object BugType :Type("bug",green_1,green_08, R.drawable.ic_bug)
        object GhostType :Type("ghost",gray_1,gray_08, R.drawable.ic_ghost)
        object SteelType :Type("steel",gray_1,gray_08, R.drawable.ic_steel)
        object FireType :Type("fire", yellow_1,yellow_08, R.drawable.ic_fire)
        object WaterType :Type("water",blue_1,blue_08, R.drawable.ic_water)
        object GrassType :Type("grass",green_1,green_08, R.drawable.ic_grass)
        object ElectricType :Type("electric",yellow_1,yellow_08, R.drawable.ic_electric)
        object PsychicType :Type("psychic",pink_1,pink_08, R.drawable.ic_psychic)
        object IceType :Type("ice",blue_1,blue_08, R.drawable.ic_ice)
        object DragonType :Type("dragon",blue_1,blue_08, R.drawable.ic_dragon)
        object DarkType :Type("dark",black_1,black_08, R.drawable.ic_dark)
        object FairyType :Type("fairy",pink_1,pink_08, R.drawable.ic_fairy)
        object UnknownType :Type("unknown",white_1,white_08, R.drawable.ic_normal)
        object ShadowType :Type("shadow",black_1,black_08, R.drawable.ic_normal)
    }
}