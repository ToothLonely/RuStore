package dev.toothlonely.vkeducation.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.toothlonely.vkeducation.data.AppApi
import dev.toothlonely.vkeducation.data.AppApiImpl
import dev.toothlonely.vkeducation.data.AppDetailsRepositorImpl
import dev.toothlonely.vkeducation.data.AppsListApi
import dev.toothlonely.vkeducation.data.AppsListApiImpl
import dev.toothlonely.vkeducation.data.AppsListRepositoryImpl
import dev.toothlonely.vkeducation.domain.AppDetailsRepository
import dev.toothlonely.vkeducation.domain.AppsListRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface Module {

    @Binds
    @Singleton
    fun provideAppDetailsRepository(impl: AppDetailsRepositorImpl): AppDetailsRepository

    @Binds
    @Singleton
    fun provideAppsListRepository(impl: AppsListRepositoryImpl): AppsListRepository

    @Binds
    fun provideAppsListApi(impl: AppsListApiImpl): AppsListApi

    @Binds
    fun provideAppApi(impl: AppApiImpl): AppApi
}