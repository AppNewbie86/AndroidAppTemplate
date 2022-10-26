package de.syntaxinstitut.dogcrounding.data

data class Bot(
    val id: Int,
    val name: String,
    val message: String,
    val chatHistory: MutableList<String>
)
