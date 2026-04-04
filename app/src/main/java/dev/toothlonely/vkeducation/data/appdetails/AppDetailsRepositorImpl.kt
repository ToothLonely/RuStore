package dev.toothlonely.vkeducation.data.appdetails

import dev.toothlonely.vkeducation.data.appdetails.local.AppDetailsDao
import dev.toothlonely.vkeducation.data.appdetails.local.AppDetailsEntityMapper
import dev.toothlonely.vkeducation.domain.AppDetails
import dev.toothlonely.vkeducation.domain.AppDetailsRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.withContext
import javax.inject.Inject

class AppDetailsRepositorImpl @Inject constructor(
    private val service: AppDetailsService,
    private val dao: AppDetailsDao,
) : AppDetailsRepository {

    override suspend fun getAppDetails(id: String): Flow<AppDetails> {
        return dao.getAppDetails(id).map { entity ->
            if (entity != null) {
                AppDetailsEntityMapper.toDomain(entity)
            } else {
                val dto = service.getAppDetails(id)
                val domain = AppDetailsMapper.toDomain(dto)
                val entity = AppDetailsEntityMapper.toEntity(domain)
                withContext(Dispatchers.IO) {
                    dao.upsertAppDetails(entity)
                }
                domain
            }
        }
    }
}