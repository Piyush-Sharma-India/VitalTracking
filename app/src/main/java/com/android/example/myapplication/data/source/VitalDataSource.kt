package com.android.example.myapplication.data.source

import com.android.example.myapplication.data.Result
import com.android.example.myapplication.data.UserVitals

interface VitalDataSource {
    suspend fun getUserVitals(): Result<UserVitals>
}