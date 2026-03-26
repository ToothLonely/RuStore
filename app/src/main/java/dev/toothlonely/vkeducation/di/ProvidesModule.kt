package dev.toothlonely.vkeducation.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.toothlonely.vkeducation.data.AppDetailsService
import dev.toothlonely.vkeducation.data.AppsListService
import dev.toothlonely.vkeducation.data.BASE_URL
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.kotlinx.serialization.asConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ProvidesModule {

    @Provides
    fun provideJson() = Json {
        ignoreUnknownKeys = true
    }

    @Provides
    fun provideInterceptor() = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }

    @Provides
    @Singleton
    fun provideClient(interceptor: HttpLoggingInterceptor) = OkHttpClient.Builder()
        .addInterceptor(interceptor)
        .build()

    @Provides
    @Singleton
    fun provideRetrofit(client: OkHttpClient, json: Json) = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(client)
        .addConverterFactory(json.asConverterFactory("application/json".toMediaType()))
        .build()

    @Provides
    @Singleton
    fun provideAppsListService(retrofit: Retrofit) = retrofit.create(AppsListService::class.java)

    @Provides
    @Singleton
    fun provideAppDetailsService(retrofit: Retrofit) = retrofit.create(AppDetailsService::class.java)


}