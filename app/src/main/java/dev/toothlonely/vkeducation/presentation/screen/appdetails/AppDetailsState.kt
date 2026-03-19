package dev.toothlonely.vkeducation.presentation.screen.appdetails

import androidx.compose.runtime.Immutable
import dev.toothlonely.vkeducation.domain.AppDetails

@Immutable
sealed interface AppDetailsState {
    data object Error : AppDetailsState
    data object Loading : AppDetailsState
    data class Content(
        val appDetails: AppDetails,
        val descriptionCollapsed: Boolean,
    ) : AppDetailsState
}