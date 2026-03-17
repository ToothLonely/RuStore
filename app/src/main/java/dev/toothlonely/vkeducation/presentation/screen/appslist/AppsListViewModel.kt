package dev.toothlonely.vkeducation.presentation.screen.appslist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dev.toothlonely.vkeducation.R
import dev.toothlonely.vkeducation.data.STUB
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch

class AppsListViewModel : ViewModel() {

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
                val apps = STUB.getAllApps()
                _state.value = AppsListState.Loaded(apps)
            }.onFailure {
                _state.value = AppsListState.ErrorLoading
            }
        }
    }

    fun onLabelClick() = viewModelScope.launch {
        _events.send(AppsListEvent.OnRuStoreLabelClicked(R.string.on_label_click_message))
    }
}