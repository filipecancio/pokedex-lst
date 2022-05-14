@file:Suppress("OPT_IN_IS_NOT_ENABLED")

package dev.cancio.pokedex.ui.component.atom

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.cancio.pokedex.model.PokemonType
import dev.cancio.pokedex.model.Poketype

@Composable
fun TypesBadges(type: PokemonType){
    Box(
        Modifier
        .width(8.dp)
        .height(8.dp)
        .background(
            type.color,
            shape = RoundedCornerShape(8.dp)
        ))
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