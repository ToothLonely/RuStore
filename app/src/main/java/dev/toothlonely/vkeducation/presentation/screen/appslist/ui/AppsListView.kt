package dev.toothlonely.vkeducation.presentation.screen.appslist.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import dev.toothlonely.vkeducation.domain.AppDetails
import dev.toothlonely.vkeducation.presentation.navigation.Screen

@Composable
fun AppsListView(apps: List<AppDetails>, onNavigateTo: (Screen) -> Unit = {}) {
    LazyColumn(
        modifier = Modifier
            .clip(shape = RoundedCornerShape(topEnd = 10.dp, topStart = 10.dp))
            .background(color = Color.White)
    ) {
        itemsIndexed(apps) { index, appItem ->
            AppItem(
                application = appItem,
                modifier = Modifier
                    .clickable {
                        onNavigateTo(Screen.AppDetails(applicationId = appItem.id))
                    }
            )

            if (index < apps.size) {
                HorizontalDivider(
                    thickness = 1.dp,
                    color = Color.LightGray,
                    modifier = Modifier.padding(horizontal = 5.dp)
                )
            }
        }
    }
}