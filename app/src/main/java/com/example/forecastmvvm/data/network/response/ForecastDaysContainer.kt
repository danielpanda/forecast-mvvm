package com.example.forecastmvvm.data.network.response

import com.google.gson.annotations.SerializedName
import com.example.forecastmvvm.data.db.entity.FutureWeatherEntry

data class ForecastDaysContainer(
    @SerializedName("forecastday")
    val entries: List<FutureWeatherEntry>
)