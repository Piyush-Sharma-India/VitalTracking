package com.android.example.myapplication.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0005"}, d2 = {"Lcom/android/example/myapplication/network/VitalService;", "", "getUserVitals", "Lcom/android/example/myapplication/data/UserVitals;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface VitalService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "cbeaa5c4-9fe3-4a60-abbf-ca95b70a48df")
    public abstract java.lang.Object getUserVitals(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.android.example.myapplication.data.UserVitals> p0);
}