package com.android.example.myapplication.repository

import android.util.Log
import com.android.example.myapplication.data.Result
import com.android.example.myapplication.data.UserVitals
import com.android.example.myapplication.data.source.VitalDataSource
import com.android.example.myapplication.di.AppModule
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import timber.log.Timber
import javax.inject.Inject

class DefaultVitalRepository @Inject constructor(
    @AppModule.VitalRemoteDataSource private val albumsRemoteDataSource: VitalDataSource,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) : VitalRepository {

    override suspend fun getUserVitals(): Result<UserVitals> {
        return withContext(ioDispatcher) {
            getVitalsDataFromRemote()
        }
    }

    private suspend fun getVitalsDataFromRemote(): Result<UserVitals> {
        val remoteUserVitals = albumsRemoteDataSource.getUserVitals()
        Timber.tag("OkHttp").d("Remote data : " + remoteUserVitals.toString() + "")
        Log.d("OkHttp", "Remote data : " + remoteUserVitals.toString() + "")

        return remoteUserVitals
    }
}