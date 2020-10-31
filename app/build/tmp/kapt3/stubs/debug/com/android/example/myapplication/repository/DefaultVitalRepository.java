package com.android.example.myapplication.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/android/example/myapplication/repository/DefaultVitalRepository;", "Lcom/android/example/myapplication/repository/VitalRepository;", "albumsRemoteDataSource", "Lcom/android/example/myapplication/data/source/VitalDataSource;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/android/example/myapplication/data/source/VitalDataSource;Lkotlinx/coroutines/CoroutineDispatcher;)V", "getUserVitals", "Lcom/android/example/myapplication/data/Result;", "Lcom/android/example/myapplication/data/UserVitals;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVitalsDataFromRemote", "app_debug"})
public final class DefaultVitalRepository implements com.android.example.myapplication.repository.VitalRepository {
    private final com.android.example.myapplication.data.source.VitalDataSource albumsRemoteDataSource = null;
    private final kotlinx.coroutines.CoroutineDispatcher ioDispatcher = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getUserVitals(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.android.example.myapplication.data.Result<com.android.example.myapplication.data.UserVitals>> p0) {
        return null;
    }
    
    @javax.inject.Inject()
    public DefaultVitalRepository(@org.jetbrains.annotations.NotNull()
    @com.android.example.myapplication.di.AppModule.VitalRemoteDataSource()
    com.android.example.myapplication.data.source.VitalDataSource albumsRemoteDataSource, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher ioDispatcher) {
        super();
    }
}