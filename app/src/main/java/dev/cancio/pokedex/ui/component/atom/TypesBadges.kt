@file:Suppress("OPT_IN_IS_NOT_ENABLED")

package dev.cancio.pokedex.ui.component.atom

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.cancio.pokedex.model.PokemonType
import dev.cancio.pokedex.model.enum.Poketype

@Composable
fun TypesBadges(pokemonType: PokemonType){
    with(pokemonType.typeContent){
        Box(
            Modifier
                .width(30.dp)
                .height(30.dp)
                .background(
                    secondaryColor,
                    shape = RoundedCornerShape(30.dp)
                )
                .padding(5.dp)
        ){
            Image(
                imageVector = ImageVector.vectorResource(id = icon),
                contentDescription = "pokemon",
                colorFilter = ColorFilter.tint(primaryColor),
                modifier = Modifier.size(25.dp)
            )
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Preview
@Composable
fun Preview(){
    val pokemonTypeList = listOf(
        PokemonType(Poketype.normal,"")
    )
    LazyRow{
        items(
            items = pokemonTypeList,
            itemContent = { TypesBadges(it)}
        )
    }

}