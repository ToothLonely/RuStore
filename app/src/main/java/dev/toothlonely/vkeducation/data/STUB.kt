package dev.toothlonely.vkeducation.data

object STUB {

    private val apps = listOf(
        AppDetailsDto(
            name = "ChatFlow",
            developer = "",
            category = "APP",
            ageRating = 0,
            size = 0f,
            iconUrl = "https://picsum.photos/200?1",
            screenshotUrlList = emptyList(),
            description = "Fast and secure messenger for everyday communication."
        ),
        AppDetailsDto(
            name = "TaskZen",
            developer = "",
            category = "APP",
            ageRating = 0,
            size = 0f,
            iconUrl = "https://picsum.photos/200?2",
            screenshotUrlList = emptyList(),
            description = "Minimalistic task manager to keep your day organized."
        ),
        AppDetailsDto(
            name = "FitPulse",
            developer = "",
            category = "APP",
            ageRating = 0,
            size = 0f,
            iconUrl = "https://picsum.photos/200?3",
            screenshotUrlList = emptyList(),
            description = "Track workouts and daily fitness progress."
        ),
        AppDetailsDto(
            name = "PhotoMagic",
            developer = "",
            category = "APP",
            ageRating = 0,
            size = 0f,
            iconUrl = "https://picsum.photos/200?4",
            screenshotUrlList = emptyList(),
            description = "Powerful photo editor with filters and effects."
        ),
        AppDetailsDto(
            name = "NoteSphere",
            developer = "",
            category = "APP",
            ageRating = 0,
            size = 0f,
            iconUrl = "https://picsum.photos/200?5",
            screenshotUrlList = emptyList(),
            description = "Smart notes with cloud synchronization."
        ),
        AppDetailsDto(
            name = "WeatherCast",
            developer = "",
            category = "APP",
            ageRating = 0,
            size = 0f,
            iconUrl = "https://picsum.photos/200?6",
            screenshotUrlList = emptyList(),
            description = "Accurate weather forecasts with widgets."
        ),
        AppDetailsDto(
            name = "TravelMate",
            developer = "",
            category = "APP",
            ageRating = 0,
            size = 0f,
            iconUrl = "https://picsum.photos/200?7",
            screenshotUrlList = emptyList(),
            description = "Plan trips and explore destinations."
        ),
        AppDetailsDto(
            name = "BudgetWise",
            developer = "",
            category = "APP",
            ageRating = 0,
            size = 0f,
            iconUrl = "https://picsum.photos/200?8",
            screenshotUrlList = emptyList(),
            description = "Track your personal finances and spending."
        ),
        AppDetailsDto(
            name = "MusicWave",
            developer = "",
            category = "APP",
            ageRating = 0,
            size = 0f,
            iconUrl = "https://picsum.photos/200?9",
            screenshotUrlList = emptyList(),
            description = "Discover and listen to millions of songs."
        ),
        AppDetailsDto(
            name = "QuickTranslate",
            developer = "",
            category = "APP",
            ageRating = 0,
            size = 0f,
            iconUrl = "https://picsum.photos/200?10",
            screenshotUrlList = emptyList(),
            description = "Instant translation for dozens of languages."
        ),
        AppDetailsDto(
            name = "FocusTimer",
            developer = "",
            category = "APP",
            ageRating = 0,
            size = 0f,
            iconUrl = "https://picsum.photos/200?11",
            screenshotUrlList = emptyList(),
            description = "Pomodoro timer for better productivity."
        ),
        AppDetailsDto(
            name = "RecipeBook",
            developer = "",
            category = "GAME",
            ageRating = 0,
            size = 0f,
            iconUrl = "https://picsum.photos/200?12",
            screenshotUrlList = emptyList(),
            description = "Explore and save recipes from around the world."
        ),
        AppDetailsDto(
            name = "MapTrail",
            developer = "",
            category = "GAME",
            ageRating = 0,
            size = 0f,
            iconUrl = "https://picsum.photos/200?13",
            screenshotUrlList = emptyList(),
            description = "Offline maps and navigation tools."
        ),
        AppDetailsDto(
            name = "DailyNews",
            developer = "",
            category = "GAME",
            ageRating = 0,
            size = 0f,
            iconUrl = "https://picsum.photos/200?14",
            screenshotUrlList = emptyList(),
            description = "Stay updated with global news."
        ),
        AppDetailsDto(
            name = "SketchPad",
            developer = "",
            category = "GAME",
            ageRating = 0,
            size = 0f,
            iconUrl = "https://picsum.photos/200?15",
            screenshotUrlList = emptyList(),
            description = "Draw and sketch digitally."
        ),
        AppDetailsDto(
            name = "LanguageLeap",
            developer = "",
            category = "GAME",
            ageRating = 0,
            size = 0f,
            iconUrl = "https://picsum.photos/200?16",
            screenshotUrlList = emptyList(),
            description = "Learn new languages interactively."
        ),
        AppDetailsDto(
            name = "SmartScanner",
            developer = "",
            category = "GAME",
            ageRating = 0,
            size = 0f,
            iconUrl = "https://picsum.photos/200?17",
            screenshotUrlList = emptyList(),
            description = "Scan documents and export as PDF."
        ),
        AppDetailsDto(
            name = "HabitForge",
            developer = "",
            category = "GAME",
            ageRating = 0,
            size = 0f,
            iconUrl = "https://picsum.photos/200?18",
            screenshotUrlList = emptyList(),
            description = "Build better habits with reminders."
        ),
        AppDetailsDto(
            name = "GameHub",
            developer = "",
            category = "GAME",
            ageRating = 0,
            size = 0f,
            iconUrl = "https://picsum.photos/200?19",
            screenshotUrlList = emptyList(),
            description = "Collection of fun casual games."
        ),
        AppDetailsDto(
            name = "SleepWell",
            developer = "",
            category = "GAME",
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