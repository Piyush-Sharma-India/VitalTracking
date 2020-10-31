package com.android.example.myapplication.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0006H\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/android/example/myapplication/di/AppModule;", "", "()V", "BASE_URL", "", "getOkHttpClient", "Lokhttp3/OkHttpClient;", "provideAlbumService", "Lcom/android/example/myapplication/network/VitalService;", "retrofit", "Lretrofit2/Retrofit;", "provideIoDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "provideMoshi", "Lcom/squareup/moshi/Moshi;", "provideRetrofit", "moshi", "okHttpClient", "provideVitalRemoteDataSource", "Lcom/android/example/myapplication/data/source/VitalDataSource;", "vitalService", "VitalRemoteDataSource", "app_debug"})
@dagger.Module()
public final class AppModule {
    private static final java.lang.String BASE_URL = "https://run.mocky.io/v3/";
    public static final com.android.example.myapplication.di.AppModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @com.android.example.myapplication.di.AppModule.VitalRemoteDataSource()
    @javax.inject.Singleton()
    public final com.android.example.myapplication.data.source.VitalDataSource provideVitalRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.android.example.myapplication.network.VitalService vitalService) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi, @org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.squareup.moshi.Moshi provideMoshi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.android.example.myapplication.network.VitalService provideAlbumService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final kotlinx.coroutines.CoroutineDispatcher provideIoDispatcher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final okhttp3.OkHttpClient getOkHttpClient() {
        return null;
    }
    
    private AppModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Lcom/android/example/myapplication/di/AppModule$VitalRemoteDataSource;", "", "app_debug"})
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
    @kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.RUNTIME)
    @javax.inject.Qualifier()
    public static abstract @interface VitalRemoteDataSource {
    }
}