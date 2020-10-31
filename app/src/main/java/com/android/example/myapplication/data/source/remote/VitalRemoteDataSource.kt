package com.android.example.myapplication.data.source.remote

import android.util.Log
import com.android.example.myapplication.data.Result
import com.android.example.myapplication.data.UserVitals
import com.android.example.myapplication.data.source.VitalDataSource
import com.android.example.myapplication.network.VitalService
import timber.log.Timber

class VitalRemoteDataSource(private val vitalService: VitalService) : VitalDataSource {

    override suspend fun getUserVitals(): Result<UserVitals> {
        return try {
            Timber.tag("OkHttp").d(vitalService.getUserVitals().toString() + "")
            Timber.tag("OkHttp")
                .d(vitalService.getUserVitals().toString() + "")
            Log.d("OkHttp", vitalService.getUserVitals().toString() + "")

            Result.Success(vitalService.getUserVitals())
        } catch (e: Exception) {
            Timber.tag("OkHttp").d(e.toString() + "")
            Log.d("OkHttp", e.toString() + "")
            Result.Error(e)
        }
    }
}