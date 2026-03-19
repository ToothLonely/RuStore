package dev.toothlonely.vkeducation.presentation.screen.appslist.viewmodel

import dev.toothlonely.vkeducation.domain.AppDetails

sealed interface AppsListState {

    data object Loading : AppsListState

    data object ErrorLoading : AppsListState

    data class Loaded(val apps: List<AppDetails>) : AppsListState
}