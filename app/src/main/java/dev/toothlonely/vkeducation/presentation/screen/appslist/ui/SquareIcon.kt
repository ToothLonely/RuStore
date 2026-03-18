package dev.toothlonely.vkeducation.presentation.screen.appslist.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SquareIcon(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .size(10.dp)
            .background(color = Color.Transparent)
            .border(
                width = 2.dp,
                color = Color.White,
                shape = RoundedCornerShape(3.dp)
            )
    )
}

@Composable
@Preview(showBackground = true)
fun SquareIconPreview() {
    SquareIcon()
}