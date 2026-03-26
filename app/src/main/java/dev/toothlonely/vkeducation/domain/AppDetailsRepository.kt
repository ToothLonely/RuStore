package dev.toothlonely.vkeducation.domain

interface AppDetailsRepository {
    suspend fun getAppDetails(id: String): AppDetails
}