package de.syntaxinstitut.dogcrounding.data.datamodels

import com.squareup.moshi.Json

data class ApiResponse(
    @Json(name = "message")
    val images: List<String>
)
