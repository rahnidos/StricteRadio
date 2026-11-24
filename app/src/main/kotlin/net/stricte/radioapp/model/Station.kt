package net.stricte.radioapp.model

import kotlinx.serialization.Serializable

@Serializable
data class Station(
    val id: String,
    val name: String,
    val streams: List<String>,
    val colorHex: Long? = null,
    val iconUrl: String? = null
)