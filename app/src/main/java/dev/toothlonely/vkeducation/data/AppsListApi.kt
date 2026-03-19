package dev.toothlonely.vkeducation.data

import kotlinx.coroutines.delay

class AppsListApi {
    suspend fun getAppsList(): List<AppDetailsDto> {
        delay(100L)
        return STUB.getAllApps()
    }

}