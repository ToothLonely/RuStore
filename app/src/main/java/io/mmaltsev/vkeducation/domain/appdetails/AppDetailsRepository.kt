package dev.toothlonely.vkeducation.data

interface AppDetailsRepository {
    suspend fun get(): AppDetails
}