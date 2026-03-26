package dev.toothlonely.vkeducation.domain

import javax.inject.Inject

class GetAppDetailsUseCase @Inject constructor(
    private val appDetailsRepository: AppDetailsRepository,
) {
    suspend operator fun invoke(id: String): AppDetails {
        val app: AppDetails = appDetailsRepository.getAppDetails(id)

        if (app.category == "") {
            throw IllegalStateException()
        }

        return app
    }
}