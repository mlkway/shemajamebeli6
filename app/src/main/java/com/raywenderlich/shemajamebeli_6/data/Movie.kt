package com.raywenderlich.shemajamebeli_6.data

import androidx.annotation.Keep
import com.squareup.moshi.Json

@Keep
data class Movie<T>(
    @Json(name = "page")
    val page: Int,
    @Json(name = "results")
    val results: T?
)