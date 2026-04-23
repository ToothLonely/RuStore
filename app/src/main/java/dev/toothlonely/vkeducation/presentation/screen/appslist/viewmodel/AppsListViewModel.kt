package dev.toothlonely.vkeducation.presentation.screen.appslist.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.toothlonely.vkeducation.R
import dev.toothlonely.vkeducation.domain.AppsListRepository
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AppsListViewModel @Inject constructor(
    private val repository: AppsListRepository
) : ViewModel() {

    private val _state = MutableStateFlow<AppsListState>(AppsListState.Loading)
    val state = _state.asStateFlow()

    private val _events = Channel<AppsListEvent>(Channel.BUFFERED)
    val events = _events.receiveAsFlow()

    init {
        loadApps()
    }

    private fun loadApps() {
        viewModelScope.launch {
            runCatching {
                _state.value = AppsListState.Loading
                delay(1000L)
                val apps = repository.getAppsList()
                _state.value = AppsListState.Loaded(apps)
            }.onFailure { throwable ->
                Log.e("NETWORK", "Error", throwable)
                _state.value = AppsListState.ErrorLoading
            }
        }
    }

    fun onLabelClick() = viewModelScope.launch {
        _events.send(AppsListEvent.OnRuStoreLabelClicked(R.string.on_label_click_message))
    }
}