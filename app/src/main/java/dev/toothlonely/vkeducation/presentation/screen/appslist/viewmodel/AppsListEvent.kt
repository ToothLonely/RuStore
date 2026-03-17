package dev.toothlonely.vkeducation.presentation.screen.appslist.viewmodel

sealed interface AppsListEvent {
    data class OnRuStoreLabelClicked(val messageResId: Int): AppsListEvent
}