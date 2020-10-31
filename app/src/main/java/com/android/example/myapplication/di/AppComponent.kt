package com.android.example.myapplication.di

import android.content.Context
import com.android.example.myapplication.vital.di.VitalComponent
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import javax.inject.Singleton

@Singleton
@Component(
    modules = [AppModule::class,
        AppModuleBinds::class,
        ViewModelBuilderModule::class,
        SubComponentsModule::class]
)
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance applicationContext: Context): AppComponent
    }

    fun vitalComponent(): VitalComponent.Factory
}

@Module(subcomponents = [VitalComponent::class])
object SubComponentsModule