package dev.toothlonely.vkeducation.data

import kotlinx.coroutines.delay
import javax.inject.Inject

class AppsListApiImpl @Inject constructor(): AppsListApi {
    override suspend fun getAppsList(): List<AppDetailsDto> {
        delay(100L)
        return STUB.getAllApps()
    }

}