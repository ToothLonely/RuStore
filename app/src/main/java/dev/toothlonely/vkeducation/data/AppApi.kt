package dev.toothlonely.vkeducation.data

interface AppApi {
    suspend fun get(): AppDetailsDto
}