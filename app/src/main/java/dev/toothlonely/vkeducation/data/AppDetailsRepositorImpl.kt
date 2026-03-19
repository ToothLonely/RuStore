package dev.toothlonely.vkeducation.data

import dev.toothlonely.vkeducation.domain.AppDetails
import dev.toothlonely.vkeducation.domain.AppDetailsRepository

class AppDetailsRepositorImpl : AppDetailsRepository {
    private val appApi = AppApi()

    override suspend fun get(): AppDetails {
        val dto = appApi.get()
        val domain = AppDetailsMapper.toDomain(dto)
        return domain
    }
}