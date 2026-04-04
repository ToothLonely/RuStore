package dev.toothlonely.vkeducation.domain

import kotlinx.coroutines.flow.Flow

interface AppDetailsRepository {
    suspend fun getAppDetails(id: String): Flow<AppDetails>
}