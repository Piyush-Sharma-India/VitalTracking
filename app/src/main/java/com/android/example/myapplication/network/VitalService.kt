/*
 * Copyright 2019, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.android.example.myapplication.network

import com.android.example.myapplication.data.UserVitals
import retrofit2.http.GET

interface VitalService {

    @GET("cbeaa5c4-9fe3-4a60-abbf-ca95b70a48df")
    suspend fun getUserVitals(): UserVitals
}

