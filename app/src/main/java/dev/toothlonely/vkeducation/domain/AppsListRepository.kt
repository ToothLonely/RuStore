package dev.toothlonely.vkeducation.domain

interface AppsListRepository {
    suspend fun getAppsList(): List<AppDetails>
}