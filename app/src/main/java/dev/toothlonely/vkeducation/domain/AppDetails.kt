package dev.toothlonely.vkeducation.domain

data class AppDetails(
    val id: String = "",
    val name: String,
    val developer: String,
    val category: String,
    val ageRating: Int,
    val size: Double,
    val iconUrl: String,
    val screenshotUrlList: List<String>? = null,
    val description: String,
)