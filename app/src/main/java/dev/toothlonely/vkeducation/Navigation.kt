package dev.toothlonely.vkeducation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import kotlinx.serialization.Serializable

sealed interface Screen {

    @Serializable
    data object AppsList : Screen

    @Serializable
    data class AppInfo(val applicationId: Int) : Screen
}

@Composable
fun Navigation(
    navController: NavHostController,
    modifier: Modifier,
) {
    NavHost(
        navController = navController,
        startDestination = Screen.AppsList
    ) {
        composable<Screen.AppsList> {
            AppsListScreen(modifier = modifier) { destination ->
                navController.navigate(destination)
            }
        }

        composable<Screen.AppInfo> { backStackEntry ->
/*            val appItem = backStackEntry.toRoute<Screen.AppInfo>()
            AppInfoScreen(applicationId = appItem.applicationId)*/
            AppDetailsScreen()
        }
    }
}