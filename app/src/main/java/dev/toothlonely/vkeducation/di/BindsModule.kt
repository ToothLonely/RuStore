package dev.toothlonely.vkeducation.di

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.toothlonely.vkeducation.data.AppDetailsRepositorImpl
import dev.toothlonely.vkeducation.data.AppDetailsService
import dev.toothlonely.vkeducation.data.AppsListRepositoryImpl
import dev.toothlonely.vkeducation.data.AppsListService
import dev.toothlonely.vkeducation.domain.AppDetailsRepository
import dev.toothlonely.vkeducation.domain.AppsListRepository
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.kotlinx.serialization.asConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface BindsModule {

    @Binds
    @Singleton
    fun provideAppDetailsRepository(impl: AppDetailsRepositorImpl): AppDetailsRepository

    @Binds
    @Singleton
    fun provideAppsListRepository(impl: AppsListRepositoryImpl): AppsListRepository
}