package com.android.example.myapplication.vital.di

import com.android.example.myapplication.vital.VitalListFragment
import dagger.Subcomponent

@Subcomponent(modules = [VitalListModule::class])
interface VitalComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): VitalComponent
    }

    fun inject(fragment: VitalListFragment)
}