package dev.toothlonely.vkeducation.presentation.screen.appslist.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import dev.toothlonely.vkeducation.domain.AppDetails

@Composable
fun AppItem(
    application: AppDetails,
    modifier: Modifier,
) {

    val applicationNameTextStyle = TextStyle(
        color = Color.Black,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp
    )

    val applicationDescriptionTextStyle = TextStyle(
        color = Color(0xFF454545),
        fontSize = 13.sp
    )

    val applicationCategoryTextStyle = TextStyle(
        color = Color.Gray,
        fontSize = 12.sp
    )

    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        AsyncImage(
            model = application.iconUrl,
            contentDescription = application.description,
            modifier = Modifier
                .clip(shape = RoundedCornerShape(percent = 20))
        )

        Spacer(Modifier.width(15.dp))

        Column(
            verticalArrangement = Arrangement.spacedBy(7.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = application.name,
                style = applicationNameTextStyle
            )
            Text(
                text = application.description,
                style = applicationDescriptionTextStyle,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            Text(
                text = application.category,
                style = applicationCategoryTextStyle
            )
        }
    }
}