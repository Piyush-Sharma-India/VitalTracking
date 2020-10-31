package com.android.example.myapplication.di

import com.android.example.myapplication.repository.VitalRepository
import com.android.example.myapplication.repository.DefaultVitalRepository
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class AppModuleBinds {

    @Singleton
    @Binds
    abstract fun bindAlbumRepository(repository: DefaultVitalRepository): VitalRepository
}