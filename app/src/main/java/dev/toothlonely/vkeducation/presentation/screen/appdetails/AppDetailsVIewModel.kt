package dev.toothlonely.vkeducation.presentation.screen.appdetails

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.toRoute
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.toothlonely.vkeducation.domain.GetAppDetailsUseCase
import dev.toothlonely.vkeducation.presentation.navigation.Screen
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.Channel.Factory.BUFFERED
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AppDetailsViewModel @Inject constructor(
    private val getAppDetailsUseCase: GetAppDetailsUseCase,
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val appId = savedStateHandle.toRoute<Screen.AppDetails>().applicationId

    private val _state = MutableStateFlow<AppDetailsState>(AppDetailsState.Loading)
    val state = _state.asStateFlow()

    private val _events = Channel<AppDetailsEvent>(BUFFERED)
    val events = _events.receiveAsFlow()

    init {
        getAppDetails()
    }

    fun showUnderDevelopmentMessage() {
        viewModelScope.launch {
            _events.send(AppDetailsEvent.UnderDevelopment)
        }
    }

    fun collapseDescription() {
        _state.update { currentState ->
            if (currentState is AppDetailsState.Content) {
                currentState.copy(descriptionCollapsed = true)
            } else {
                currentState
            }
        }
    }

    fun getAppDetails() {
        viewModelScope.launch {
            _state.value = AppDetailsState.Loading

            runCatching {
                val appDetails = getAppDetailsUseCase(appId)

                _state.value = AppDetailsState.Content(
                    appDetails = appDetails,
                    descriptionCollapsed = false,
                )
            }.onFailure {
                _state.value = AppDetailsState.Error
            }
        }
    }
}