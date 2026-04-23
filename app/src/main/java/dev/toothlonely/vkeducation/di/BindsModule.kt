package dev.toothlonely.vkeducation.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.toothlonely.vkeducation.data.appdetails.AppDetailsRepositorImpl
import dev.toothlonely.vkeducation.data.appslist.AppsListRepositoryImpl
import dev.toothlonely.vkeducation.domain.AppDetailsRepository
import dev.toothlonely.vkeducation.domain.AppsListRepository
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