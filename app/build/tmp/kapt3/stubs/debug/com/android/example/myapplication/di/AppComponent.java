package com.android.example.myapplication.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/android/example/myapplication/di/AppComponent;", "", "vitalComponent", "Lcom/android/example/myapplication/vital/di/VitalComponent$Factory;", "Factory", "app_debug"})
@dagger.Component(modules = {com.android.example.myapplication.di.AppModule.class, com.android.example.myapplication.di.AppModuleBinds.class, com.android.example.myapplication.di.ViewModelBuilderModule.class, com.android.example.myapplication.di.SubComponentsModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.android.example.myapplication.vital.di.VitalComponent.Factory vitalComponent();
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/android/example/myapplication/di/AppComponent$Factory;", "", "create", "Lcom/android/example/myapplication/di/AppComponent;", "applicationContext", "Landroid/content/Context;", "app_debug"})
    @dagger.Component.Factory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.android.example.myapplication.di.AppComponent create(@org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        android.content.Context applicationContext);
    }
}