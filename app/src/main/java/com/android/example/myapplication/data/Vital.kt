package com.android.example.myapplication.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Vital(
    val dates: List<String>,
    val type: String,
    val unit: String,
    val values: List<String>
) : Parcelable