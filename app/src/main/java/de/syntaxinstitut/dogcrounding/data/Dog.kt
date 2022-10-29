package de.syntaxinstitut.dogcrounding.data

data class Dog(
    val id: Int,
    val name: String,
    val imageRes: Int,
    val dogHistory: MutableList<String>

)
