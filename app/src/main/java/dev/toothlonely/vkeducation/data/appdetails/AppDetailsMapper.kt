package dev.toothlonely.vkeducation.data.appdetails

import dev.toothlonely.vkeducation.domain.AppDetails

class AppDetailsMapper {
    companion object {
        fun toDomain(dto: AppDetailsDto) = AppDetails(
            id = dto.id,
            name = dto.name,
            developer = dto.developer,
            category = dto.category,
            ageRating = dto.ageRating,
            size = dto.size,
            iconUrl = dto.iconUrl,
            screenshotUrlList = dto.screenshots,
            description = dto.description,
        )
    }
}