package dev.cancio.pokedex.api

import dev.cancio.pokedex.model.Pokemon

data class PokemonResponse(
    val count: Int = 0,
    val next: String? = null,
    val previous: String? = null,
    val results: List<Pokemon> = emptyList()
) {
    companion object {
        val POKEMON_PAGINATION_MOCK = PokemonResponse(
            count = 1126,
            next = "https://pokeapi.co/api/v2/pokemon?offset=20&limit=20",
            previous = null,
            results = listOf(
                Pokemon(
                    name = "bulbasaur",
                    url = "https://pokeapi.co/api/v2/pokemon/1/"
                ),
                Pokemon(
                    name = "ivysaur",
                    url = "https://pokeapi.co/api/v2/pokemon/2/"
                ),
                Pokemon(
                    name = "venusaur",
                    url = "https://pokeapi.co/api/v2/pokemon/3/"
                ),
                Pokemon(
                    name = "charmander",
                    url = "https://pokeapi.co/api/v2/pokemon/4/"
                ),
                Pokemon(
                    name = "charmeleon",
                    url = "https://pokeapi.co/api/v2/pokemon/5/"
                ),
                Pokemon(
                    name = "charizard",
                    url = "https://pokeapi.co/api/v2/pokemon/6/"
                ),
                Pokemon(
                    name = "squirtle",
                    url = "https://pokeapi.co/api/v2/pokemon/7/"
                ),
                Pokemon(
                    name = "wartortle",
                    url = "https://pokeapi.co/api/v2/pokemon/8/"
                ),
                Pokemon(
                    name = "blastoise",
                    url = "https://pokeapi.co/api/v2/pokemon/9/"
                ),
                Pokemon(
                    name = "caterpie",
                    url = "https://pokeapi.co/api/v2/pokemon/10/"
                ),
                Pokemon(
                    name = "metapod",
                    url = "https://pokeapi.co/api/v2/pokemon/11/"
                ),
                Pokemon(
                    name = "butterfree",
                    url = "https://pokeapi.co/api/v2/pokemon/12/"
                ),
                Pokemon(
                    name = "weedle",
                    url = "https://pokeapi.co/api/v2/pokemon/13/"
                ),
                Pokemon(
                    name = "kakuna",
                    url = "https://pokeapi.co/api/v2/pokemon/14/"
                ),
                Pokemon(
                    name = "beedrill",
                    url = "https://pokeapi.co/api/v2/pokemon/15/"
                ),
                Pokemon(
                    name = "pidgey",
                    url = "https://pokeapi.co/api/v2/pokemon/16/"
                ),
                Pokemon(
                    name = "pidgeotto",
                    url = "https://pokeapi.co/api/v2/pokemon/17/"
                ),
                Pokemon(
                    name = "pidgeot",
                    url = "https://pokeapi.co/api/v2/pokemon/18/"
                ),
                Pokemon(
                    name = "rattata",
                    url = "https://pokeapi.co/api/v2/pokemon/19/"
                ),
                Pokemon(
                    name = "raticate",
                    url = "https://pokeapi.co/api/v2/pokemon/20/"
                ),
            )
        )
    }
}