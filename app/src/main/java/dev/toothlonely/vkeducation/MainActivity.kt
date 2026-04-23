package dev.toothlonely.vkeducation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import dev.toothlonely.vkeducation.presentation.navigation.Navigation
import dev.toothlonely.vkeducation.presentation.ui.theme.VKEducationTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VKEducationTheme {
                val snackBarHostState = remember { SnackbarHostState() }
                Scaffold(
                    snackbarHost = {
                        SnackbarHost(hostState = snackBarHostState)
                    },
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    MainNavigation(
                        snackBarHostState = snackBarHostState,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun MainNavigation(snackBarHostState: SnackbarHostState, modifier: Modifier) {
    val navController = rememberNavController()
    Navigation(
        snackBarHostState = snackBarHostState,
        navController = navController,
        modifier = modifier
    )
}