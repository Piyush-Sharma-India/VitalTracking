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

package com.android.example.myapplication.vital


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.android.example.myapplication.data.Result
import com.android.example.myapplication.data.UserVitals
import com.android.example.myapplication.data.Vital
import com.android.example.myapplication.repository.VitalRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

class VitalListViewModel @Inject constructor(private val repository: VitalRepository) :
    ViewModel() {

    private val _dataLoading = MutableLiveData<Boolean>()
    val dataLoading: LiveData<Boolean> = _dataLoading
    private val _user_vital = MutableLiveData<UserVitals>()
    val user_vital: LiveData<UserVitals> = _user_vital

    private val _vitalList = MutableLiveData<List<Vital>>().apply { value = emptyList() }
    val vitalList: LiveData<List<Vital>> = _vitalList

    init {
        fetchVitalList()
    }

    fun fetchVitalList() {
        viewModelScope.launch {
            _dataLoading.value = true
            val userVitalResult = repository.getUserVitals()

            if (userVitalResult is Result.Success) {
                _user_vital.value = userVitalResult.data
                _vitalList.value = userVitalResult.data.vitals
            } else {
                _vitalList.value = emptyList()
            }
            _dataLoading.value = false
        }
    }

//    fun addToCart(album: Album) {
//        viewModelScope.launch(Dispatchers.IO) {
//            //  repository.updateAlbum(album = album)
//        }
//    }
}

