package dev.toothlonely.vkeducation.presentation.screen.appslist

import dev.toothlonely.vkeducation.domain.App

sealed interface AppsListState {

    data object Loading : AppsListState

    data object ErrorLoading : AppsListState

    data class Loaded(val apps: List<App>) : AppsListState
}