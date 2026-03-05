package dev.toothlonely.vkeducation

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.InputTransformation
import androidx.compose.foundation.text.input.OutputTransformation
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.foundation.text.input.insert
import androidx.compose.foundation.text.input.maxLength
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.foundation.text.input.then
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.text.isDigitsOnly
import dev.toothlonely.vkeducation.ui.theme.VKEducationTheme
import androidx.core.net.toUri

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VKEducationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    FirstScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun FirstScreen(modifier: Modifier = Modifier) {

    var text by remember { mutableStateOf("") }
    val context = LocalContext.current
    val phoneNumber = rememberTextFieldState()

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.fillMaxSize()
    ) {
        OutlinedTextField(
            value = text,
            onValueChange = {
                text = it
            },
            label = {
                Text(text = stringResource(R.string.text_for_second_activity))
            },
            placeholder = {
                Text(text = stringResource(R.string.edit_text_placeholder))
            }
        )

        Button(
            onClick = {
                openSecondActivity(context, text)
            }
        ) {
            Text("Открыть вторую Activity")
        }

        OutlinedTextField(
            state = phoneNumber,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number
            ),
            inputTransformation = InputTransformation.maxLength(10).then {
                if (!asCharSequence().isDigitsOnly()) revertAllChanges()
            },
            outputTransformation = OutputTransformation {
                if (length > 0) insert(0, "(")
                if (length > 4) insert(4, ")")
                if (length > 8) insert(8, "-")
            },
            prefix = { Text("+7") }
        )

        Button(
            onClick = {
                openPhoneCall(context, phoneNumber.text as String)
            }
        ) {
            Text("Позвонить другу")
        }
    }
}

private fun openSecondActivity(context: Context, message: String) {
    val intent = Intent(context, SecondActivity::class.java).apply {
        putExtra("secondActivityMessage", message)
    }
    context.startActivity(intent)
}

private fun openPhoneCall(context: Context, phoneNumber: String) {
    val intent = Intent(Intent.ACTION_DIAL).apply {
        data = "tel:$phoneNumber".toUri()
    }
    context.startActivity(intent)
}

@Preview(showBackground = true)
@Composable
fun FirstScreenPreview() {
    VKEducationTheme {
        FirstScreen()
    }
}