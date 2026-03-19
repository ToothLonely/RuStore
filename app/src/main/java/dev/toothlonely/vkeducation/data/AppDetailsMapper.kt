package dev.toothlonely.vkeducation.data

import dev.toothlonely.vkeducation.domain.AppDetails

class AppDetailsMapper {
    companion object {
        fun toDomain(dto: AppDetailsDto) = AppDetails(
            name = dto.name,
            developer = dto.developer,
            category = CategoryMapper.toDomain(dto.category),
            ageRating = dto.ageRating,
            size = dto.size,
            iconUrl = dto.iconUrl,
            screenshotUrlList = dto.screenshotUrlList,
            description = dto.description,
        )
    }
}