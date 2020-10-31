package com.android.example.myapplication.vital;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0015\u001a\u00020\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010\u00a8\u0006\u0017"}, d2 = {"Lcom/android/example/myapplication/vital/VitalListViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/android/example/myapplication/repository/VitalRepository;", "(Lcom/android/example/myapplication/repository/VitalRepository;)V", "_dataLoading", "Landroidx/lifecycle/MutableLiveData;", "", "_user_vital", "Lcom/android/example/myapplication/data/UserVitals;", "_vitalList", "", "Lcom/android/example/myapplication/data/Vital;", "dataLoading", "Landroidx/lifecycle/LiveData;", "getDataLoading", "()Landroidx/lifecycle/LiveData;", "user_vital", "getUser_vital", "vitalList", "getVitalList", "fetchVitalList", "", "app_debug"})
public final class VitalListViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _dataLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> dataLoading = null;
    private final androidx.lifecycle.MutableLiveData<com.android.example.myapplication.data.UserVitals> _user_vital = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.android.example.myapplication.data.UserVitals> user_vital = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.android.example.myapplication.data.Vital>> _vitalList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.android.example.myapplication.data.Vital>> vitalList = null;
    private final com.android.example.myapplication.repository.VitalRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getDataLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.android.example.myapplication.data.UserVitals> getUser_vital() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.android.example.myapplication.data.Vital>> getVitalList() {
        return null;
    }
    
    public final void fetchVitalList() {
    }
    
    @javax.inject.Inject()
    public VitalListViewModel(@org.jetbrains.annotations.NotNull()
    com.android.example.myapplication.repository.VitalRepository repository) {
        super();
    }
}