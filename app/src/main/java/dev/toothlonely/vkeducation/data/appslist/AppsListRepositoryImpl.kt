package dev.toothlonely.vkeducation.data.appslist

import dev.toothlonely.vkeducation.data.appdetails.AppDetailsMapper
import dev.toothlonely.vkeducation.domain.AppDetails
import dev.toothlonely.vkeducation.domain.AppsListRepository
import javax.inject.Inject

class AppsListRepositoryImpl @Inject constructor(
    private val service: AppsListService
) : AppsListRepository {
    override suspend fun getAppsList(): List<AppDetails> {
        val apps = service.getAppsList()
        return apps.map { dto ->
            AppDetailsMapper.toDomain(dto)
        }
    }

}