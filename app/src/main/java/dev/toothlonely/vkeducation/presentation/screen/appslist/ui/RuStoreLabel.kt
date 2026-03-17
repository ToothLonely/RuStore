package dev.toothlonely.vkeducation.presentation.screen.appslist.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.toothlonely.vkeducation.R

@Composable
fun RuStoreLabel(onClick: () -> Unit = {}) {

    val ruStoreLabelTextStyle = TextStyle(
        fontWeight = FontWeight.ExtraBold,
        fontSize = 18.sp,
        color = Color.White
    )

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier.clickable {
            onClick()
        }
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .height(35.dp)
                .width(35.dp)
                .clip(shape = RoundedCornerShape(percent = 30))
                .background(color = Color.White)
        ) {
            Icon(
                painter = painterResource(R.drawable.rustore),
                contentDescription = null,
                tint = Color.Unspecified
            )
        }
        Text(text = "RuStore", style = ruStoreLabelTextStyle)
    }
}