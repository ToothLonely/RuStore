package dev.toothlonely.vkeducation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import dev.toothlonely.vkeducation.ui.theme.VKEducationTheme

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VKEducationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val messageFromFirstActivity =
                        intent.getStringExtra(MESSAGE_TAG) ?: ""
                    SecondScreen(
                        message = messageFromFirstActivity,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}