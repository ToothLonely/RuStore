package dev.toothlonely.vkeducation.presentation.navigation

import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import dev.toothlonely.vkeducation.data.STUB
import dev.toothlonely.vkeducation.presentation.screen.appdetails.AppDetailsScreen
import dev.toothlonely.vkeducation.presentation.screen.appslist.ui.AppsListScreen
import kotlinx.serialization.Serializable

sealed interface Screen {

    @Serializable
    data object AppsList : Screen

    @Serializable
    data class AppDetails(val applicationId: String) : Screen
}

@Composable
fun Navigation(
    snackBarHostState: SnackbarHostState,
    navController: NavHostController,
    modifier: Modifier,
) {
    NavHost(
        navController = navController,
        startDestination = Screen.AppsList
    ) {
        composable<Screen.AppsList> {
            AppsListScreen(
                snackBarHostState = snackBarHostState,
                modifier = modifier
            ) { destination ->
                navController.navigate(destination)
            }
        }

        composable<Screen.AppDetails> { backStackEntry ->
            AppDetailsScreen()
        }
    }
}