package dev.toothlonely.vkeducation.presentation.screen.appslist

sealed interface AppsListEvent {
    data class OnRuStoreLabelClicked(val message: String): AppsListEvent
}