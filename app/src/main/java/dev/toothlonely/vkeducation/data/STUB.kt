package dev.toothlonely.vkeducation.data

import dev.toothlonely.vkeducation.domain.AppDetails
import dev.toothlonely.vkeducation.domain.Category

object STUB {

    private val apps = listOf(
        AppDetails(
            name = "ChatFlow",
            developer = "",
            category = Category.APP,
            ageRating = 0,
            size = 0f,
            iconUrl = "https://picsum.photos/200?1",
            screenshotUrlList = emptyList(),
            description = "Fast and secure messenger for everyday communication."
        ),
        AppDetails(
            name = "TaskZen",
            developer = "",
            category = Category.APP,
            ageRating = 0,
            size = 0f,
            iconUrl = "https://picsum.photos/200?2",
            screenshotUrlList = emptyList(),
            description = "Minimalistic task manager to keep your day organized."
        ),
        AppDetails(
            name = "FitPulse",
            developer = "",
            category = Category.APP,
            ageRating = 0,
            size = 0f,
            iconUrl = "https://picsum.photos/200?3",
            screenshotUrlList = emptyList(),
            description = "Track workouts and daily fitness progress."
        ),
        AppDetails(
            name = "PhotoMagic",
            developer = "",
            category = Category.APP,
            ageRating = 0,
            size = 0f,
            iconUrl = "https://picsum.photos/200?4",
            screenshotUrlList = emptyList(),
            description = "Powerful photo editor with filters and effects."
        ),
        AppDetails(
            name = "NoteSphere",
            developer = "",
            category = Category.APP,
            ageRating = 0,
            size = 0f,
            iconUrl = "https://picsum.photos/200?5",
            screenshotUrlList = emptyList(),
            description = "Smart notes with cloud synchronization."
        ),
        AppDetails(
            name = "WeatherCast",
            developer = "",
            category = Category.APP,
            ageRating = 0,
            size = 0f,
            iconUrl = "https://picsum.photos/200?6",
            screenshotUrlList = emptyList(),
            description = "Accurate weather forecasts with widgets."
        ),
        AppDetails(
            name = "TravelMate",
            developer = "",
            category = Category.APP,
            ageRating = 0,
            size = 0f,
            iconUrl = "https://picsum.photos/200?7",
            screenshotUrlList = emptyList(),
            description = "Plan trips and explore destinations."
        ),
        AppDetails(
            name = "BudgetWise",
            developer = "",
            category = Category.APP,
            ageRating = 0,
            size = 0f,
            iconUrl = "https://picsum.photos/200?8",
            screenshotUrlList = emptyList(),
            description = "Track your personal finances and spending."
        ),
        AppDetails(
            name = "MusicWave",
            developer = "",
            category = Category.APP,
            ageRating = 0,
            size = 0f,
            iconUrl = "https://picsum.photos/200?9",
            screenshotUrlList = emptyList(),
            description = "Discover and listen to millions of songs."
        ),
        AppDetails(
            name = "QuickTranslate",
            developer = "",
            category = Category.APP,
            ageRating = 0,
            size = 0f,
            iconUrl = "https://picsum.photos/200?10",
            screenshotUrlList = emptyList(),
            description = "Instant translation for dozens of languages."
        ),
        AppDetails(
            name = "FocusTimer",
            developer = "",
            category = Category.APP,
            ageRating = 0,
            size = 0f,
            iconUrl = "https://picsum.photos/200?11",
            screenshotUrlList = emptyList(),
            description = "Pomodoro timer for better productivity."
        ),
        AppDetails(
            name = "RecipeBook",
            developer = "",
            category = Category.APP,
            ageRating = 0,
            size = 0f,
            iconUrl = "https://picsum.photos/200?12",
            screenshotUrlList = emptyList(),
            description = "Explore and save recipes from around the world."
        ),
        AppDetails(
            name = "MapTrail",
            developer = "",
            category = Category.APP,
            ageRating = 0,
            size = 0f,
            iconUrl = "https://picsum.photos/200?13",
            screenshotUrlList = emptyList(),
            description = "Offline maps and navigation tools."
        ),
        AppDetails(
            name = "DailyNews",
            developer = "",
            category = Category.APP,
            ageRating = 0,
            size = 0f,
            iconUrl = "https://picsum.photos/200?14",
            screenshotUrlList = emptyList(),
            description = "Stay updated with global news."
        ),
        AppDetails(
            name = "SketchPad",
            developer = "",
            category = Category.APP,
            ageRating = 0,
            size = 0f,
            iconUrl = "https://picsum.photos/200?15",
            screenshotUrlList = emptyList(),
            description = "Draw and sketch digitally."
        ),
        AppDetails(
            name = "LanguageLeap",
            developer = "",
            category = Category.APP,
            ageRating = 0,
            size = 0f,
            iconUrl = "https://picsum.photos/200?16",
            screenshotUrlList = emptyList(),
            description = "Learn new languages interactively."
        ),
        AppDetails(
            name = "SmartScanner",
            developer = "",
            category = Category.APP,
            ageRating = 0,
            size = 0f,
            iconUrl = "https://picsum.photos/200?17",
            screenshotUrlList = emptyList(),
            description = "Scan documents and export as PDF."
        ),
        AppDetails(
            name = "HabitForge",
            developer = "",
            category = Category.APP,
            ageRating = 0,
            size = 0f,
            iconUrl = "https://picsum.photos/200?18",
            screenshotUrlList = emptyList(),
            description = "Build better habits with reminders."
        ),
        AppDetails(
            name = "GameHub",
            developer = "",
            category = Category.GAME,
            ageRating = 0,
            size = 0f,
            iconUrl = "https://picsum.photos/200?19",
            screenshotUrlList = emptyList(),
            description = "Collection of fun casual games."
        ),
        AppDetails(
            name = "SleepWell",
            developer = "",
            category = Category.APP,
            ageRating = 0,
            size = 0f,
            iconUrl = "https://picsum.photos/200?20",
            screenshotUrlList = emptyList(),
            description = "Relaxing sounds and sleep tracking."
        )
    )

    fun getAllApps() = apps

    fun getAppByName(name: String) = apps.find { it.name == name }
}