package dev.cancio.pokedex.model

data class NamedApiResource(
    val name: String,
    val url: String
) : ResourceSummary {
    constructor(name: String, category: String, id: Int) : this(name, resourceUrl(id, category))

    override val category by lazy { urlToCat(url) }
    override val id by lazy { urlToId(url) }
}


interface ResourceSummary {
    val id: Int
    val category: String
}

private fun resourceUrl(id: Int, category: String): String {
    return "/api/v2/$category/$id/"
}

private fun urlToId(url: String): Int {
    return "/-?[0-9]+/$".toRegex().find(url)!!.value.filter { it.isDigit() || it == '-' }.toInt()
}

private fun urlToCat(url: String): String {
    return "/[a-z\\-]+/-?[0-9]+/$".toRegex().find(url)!!.value.filter { it.isLetter() || it == '-' }
}