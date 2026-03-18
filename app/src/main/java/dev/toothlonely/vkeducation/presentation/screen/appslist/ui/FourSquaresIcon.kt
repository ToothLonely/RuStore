package dev.toothlonely.vkeducation.presentation.screen.appslist.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun FourSquaresIcon() {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .size(35.dp)
            .clip(shape = RoundedCornerShape(percent = 30))
            .background(Color(0xFF7FAEFF))
            .padding(7.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()
        ) {
            SquareIcon(modifier = Modifier.size(8.dp))
            SquareIcon(modifier = Modifier.size(8.dp))
        }
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()
        ) {
            SquareIcon(modifier = Modifier.size(8.dp))
            SquareIcon(modifier = Modifier.size(8.dp))
        }
    }
}

@Composable
@Preview(showBackground = true)
fun FourSquaresIconPreview() {
    FourSquaresIcon()
}