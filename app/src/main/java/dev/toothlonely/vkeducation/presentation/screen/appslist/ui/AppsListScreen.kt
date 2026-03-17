package dev.toothlonely.vkeducation.presentation.screen.appslist.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import dev.toothlonely.vkeducation.domain.App
import dev.toothlonely.vkeducation.presentation.navigation.Screen
import dev.toothlonely.vkeducation.presentation.screen.appslist.viewmodel.AppsListEvent
import dev.toothlonely.vkeducation.presentation.screen.appslist.viewmodel.AppsListState
import dev.toothlonely.vkeducation.presentation.screen.appslist.viewmodel.AppsListViewModel

@Composable
fun AppsListScreen(
    snackBarHostState: SnackbarHostState,
    modifier: Modifier = Modifier, onNavigateTo: (Screen) -> Unit
) {

    val viewModel = viewModel<AppsListViewModel>()
    val state by viewModel.state.collectAsStateWithLifecycle()
    val context = LocalContext.current

    LaunchedEffect(viewModel.events) {
        viewModel.events.collect { event ->
            when (event) {
                is AppsListEvent.OnRuStoreLabelClicked -> {
                    snackBarHostState.showSnackbar(message = context.getString(event.messageResId))
                }
            }
        }
    }

    when (val currentState = state) {
        AppsListState.Loading -> {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                CircularProgressIndicator()
            }
        }

        AppsListState.ErrorLoading -> {
            Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
                Text(text = "Не удалось загрузиить список приложений, попробуйте снова")
            }
        }

        is AppsListState.Loaded -> {

            val apps: List<App> = currentState.apps

            Column(
                modifier = modifier
                    .fillMaxSize()
                    .background(color = Color(0xff2c71f4))
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp)
                        .height(110.dp)
                ) {
                    RuStoreLabel {
                        viewModel.onLabelClick()
                    }
                    FourSquaresIcon()
                }
                AppsListView(apps = apps, onNavigateTo = onNavigateTo)
            }
        }
    }
}