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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.cancio.pokedex.R
import dev.cancio.pokedex.model.PokemonType
import dev.cancio.pokedex.model.Poketype
import dev.cancio.pokedex.ui.theme.md_theme_dark_onPrimary

@Composable
fun TypesBadges(type: PokemonType){
    Box(
        Modifier
        .width(10.dp)
        .height(10.dp)
        .background(
            type.color,
            shape = RoundedCornerShape(10.dp)
        )
            .padding(2.dp)
    ){
        Image(
            imageVector = ImageVector.vectorResource(id = R.drawable.ic_bug),
            contentDescription = "pokemon",
            colorFilter = ColorFilter.tint(md_theme_dark_onPrimary),
            modifier = Modifier.size(8.dp)
        )
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