package dev.toothlonely.vkeducation.data.appslist

import dev.toothlonely.vkeducation.data.appdetails.AppDetailsDto
import retrofit2.http.GET

interface AppsListService {
    @GET("catalog")
    suspend fun getAppsList(): List<AppDetailsDto>
}