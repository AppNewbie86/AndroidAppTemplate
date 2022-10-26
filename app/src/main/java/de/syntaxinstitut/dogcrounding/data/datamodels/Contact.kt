package de.syntaxinstitut.dogcrounding.data.datamodels

data class Contact(
    val id: Int,
    val name: String,
    val imageRes: Int,
    val chatHistory: MutableList<String>
)
