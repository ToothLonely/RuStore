package dev.toothlonely.vkeducation.data

import dev.toothlonely.vkeducation.domain.Category

class CategoryMapper {

    companion object {
        fun toDomain(category: String): Category = when (category) {
            "APP" -> Category.APP
            "GAME" -> Category.GAME
            else -> throw IllegalStateException("")
        }
    }
}