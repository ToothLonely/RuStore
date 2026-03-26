package dev.toothlonely.vkeducation.data

import dev.toothlonely.vkeducation.domain.Category
import kotlinx.serialization.Serializable

@Serializable
data class AppDetailsDto(
    val id: String = "",
    val name: String,
    val developer: String = "",
    val category: String,
    val ageRating: Int = 0,
    val size: Double = 0.0,
    val iconUrl: String,
    val screenshots: List<String>? = null,
    val description: String,
)