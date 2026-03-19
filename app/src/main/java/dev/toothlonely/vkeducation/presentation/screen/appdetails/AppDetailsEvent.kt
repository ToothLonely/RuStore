package dev.toothlonely.vkeducation.presentation.screen.appdetails

sealed interface AppDetailsEvent {
    data object UnderDevelopment : AppDetailsEvent
}