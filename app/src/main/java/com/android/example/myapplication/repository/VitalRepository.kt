package com.android.example.myapplication.repository

import com.android.example.myapplication.data.Result
import com.android.example.myapplication.data.UserVitals

interface VitalRepository {
    suspend fun getUserVitals(): Result<UserVitals>
}