package com.android.example.myapplication.di

import com.android.example.myapplication.data.source.VitalDataSource
import com.android.example.myapplication.data.source.remote.VitalRemoteDataSource
import com.android.example.myapplication.network.VitalService
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.Dispatchers
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import timber.log.Timber
import javax.inject.Qualifier
import javax.inject.Singleton

@Module
object AppModule {

    private const val BASE_URL = "https://run.mocky.io/v3/"

    @Qualifier
    @Retention(AnnotationRetention.RUNTIME)
    annotation class VitalRemoteDataSource

    @Singleton
    @VitalRemoteDataSource
    @Provides
    fun provideVitalRemoteDataSource(vitalService: VitalService): VitalDataSource {
        return VitalRemoteDataSource(vitalService)
    }

    @Singleton
    @Provides
    fun provideRetrofit(moshi: Moshi, okHttpClient: OkHttpClient): Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .client(okHttpClient)
        .build()

    @Singleton
    @Provides
    fun provideMoshi(): Moshi {
        return Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()
    }

    @Singleton
    @Provides
    fun provideAlbumService(retrofit: Retrofit): VitalService {
        return retrofit.create(VitalService::class.java)
    }

    @Singleton
    @Provides
    fun provideIoDispatcher() = Dispatchers.IO


    @Singleton
    @Provides
    fun getOkHttpClient(): OkHttpClient {

        val logging =
            HttpLoggingInterceptor(object : HttpLoggingInterceptor.Logger {
                override fun log(message: String) {
                    Timber.tag("OkHttp").d(message)
                }
            })

        logging.setLevel(HttpLoggingInterceptor.Level.BASIC)
        return OkHttpClient.Builder()
            .addInterceptor(logging)
            .build()
    }
}