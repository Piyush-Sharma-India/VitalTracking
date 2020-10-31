package com.android.example.myapplication.vital.di

import androidx.lifecycle.ViewModel
import com.android.example.myapplication.vital.VitalListViewModel
import com.android.example.myapplication.di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class VitalListModule {

    @Binds
    @IntoMap
    @ViewModelKey(VitalListViewModel::class)
    abstract fun bindViewModel(vitalListViewModel: VitalListViewModel): ViewModel
}