package dev.toothlonely.vkeducation.data

import retrofit2.http.GET

interface AppsListService {
    @GET("catalog")
    suspend fun getAppsList(): List<AppDetailsDto>
}