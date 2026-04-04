package dev.toothlonely.vkeducation.di

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.toothlonely.vkeducation.data.appdetails.AppDetailsService
import dev.toothlonely.vkeducation.data.appslist.AppsListService
import dev.toothlonely.vkeducation.data.BASE_URL
import dev.toothlonely.vkeducation.data.appdetails.local.AppDatabase
import dev.toothlonely.vkeducation.data.appdetails.local.AppDetailsDao
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
    fun provideAppDetailsService(retrofit: Retrofit) =
        retrofit.create(AppDetailsService::class.java)

    @Provides
    @Singleton
    fun provideDatabase(app: Application): AppDatabase {
        return Room.databaseBuilder(
            app,
            AppDatabase::class.java,
            AppDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideAppDetailsDao(database: AppDatabase): AppDetailsDao {
        return database.appDetailsDao()
    }
}