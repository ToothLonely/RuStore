package dev.toothlonely.vkeducation.domain

import kotlinx.coroutines.flow.Flow

interface AppDetailsRepository {
    suspend fun getAppDetails(id: String)

    suspend fun toggleWishlist(id: String)

    fun observeAppDetails(id: String): Flow<AppDetails?>
}