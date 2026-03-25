package dev.toothlonely.vkeducation.data

import dev.toothlonely.vkeducation.domain.AppDetails
import dev.toothlonely.vkeducation.domain.AppDetailsRepository
import javax.inject.Inject

class AppDetailsRepositorImpl @Inject constructor(
    private val appApi: AppApi
) : AppDetailsRepository {

    override suspend fun get(): AppDetails {
        val dto = appApi.get()
        val domain = AppDetailsMapper.toDomain(dto)
        return domain
    }
}