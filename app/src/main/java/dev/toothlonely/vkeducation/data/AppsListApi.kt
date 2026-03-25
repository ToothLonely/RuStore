package dev.toothlonely.vkeducation.data

interface AppsListApi {
    suspend fun getAppsList(): List<AppDetailsDto>
}