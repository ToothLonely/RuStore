package dev.toothlonely.vkeducation.data

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

class AppsListApi {
    suspend fun getAppsList(): List<AppDetailsDto> {
        delay(100L)
        return STUB.getAllApps()
    }

}