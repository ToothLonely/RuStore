package dev.toothlonely.vkeducation.data

import dev.toothlonely.vkeducation.domain.AppDetails
import dev.toothlonely.vkeducation.domain.AppsListRepository
import javax.inject.Inject

class AppsListRepositoryImpl @Inject constructor(
    private val api: AppsListApi
) : AppsListRepository {
    override suspend fun getAppsList(): List<AppDetails> {
        val apps = api.getAppsList()
        return apps.map { app ->
            AppDetailsMapper.toDomain(app)
        }
    }

}