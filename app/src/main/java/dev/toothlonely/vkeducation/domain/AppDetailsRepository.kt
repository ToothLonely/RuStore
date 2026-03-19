package dev.toothlonely.vkeducation.domain

interface AppDetailsRepository {
    suspend fun get(): AppDetails
}