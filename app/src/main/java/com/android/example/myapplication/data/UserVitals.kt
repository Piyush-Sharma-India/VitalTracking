package com.android.example.myapplication.data

data class UserVitals(
    val city: String,
    val dob: String,
    val name: String,
    var vitals: List<Vital>
)