package dev.toothlonely.vkeducation.data

import dev.toothlonely.vkeducation.domain.AppDetails
import dev.toothlonely.vkeducation.domain.AppDetailsRepository
import javax.inject.Inject

class AppDetailsRepositorImpl @Inject constructor(
    private val service: AppDetailsService
) : AppDetailsRepository {

    override suspend fun getAppDetails(id: String): AppDetails {
        val dto = service.getAppDetails(id)
        val domain = AppDetailsMapper.toDomain(dto)
        return domain
    }
}