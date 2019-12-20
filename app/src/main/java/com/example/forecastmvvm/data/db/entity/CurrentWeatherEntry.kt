package com.example.forecastmvvm.data.db.entity


import androidx.room.*
import com.google.gson.Gson
import com.google.gson.annotations.SerializedName
import com.google.gson.reflect.TypeToken
import java.util.*

const val CURRENT_WEATHER_ID = 0


@Entity(tableName = "current_weather")
data class CurrentWeatherEntry(
//    @Embedded(prefix = "condition_")
//    val condition : Condition,
    val cloudcover: Int,
    val feelslike: Int,
    val humidity: Int,
    @SerializedName("is_day")
    val isDay: String,
    @SerializedName("observation_time")
    val observationTime: String,
    val precip: Double,
    val pressure: Double,
    val temperature: Double,
    @SerializedName("uv_index")
    val uvIndex: Int,
    val visibility: Int,
    @SerializedName("weather_code")
    val weatherCode: Int,
//    @TypeConverters(WeatherDescriptionsConverter::class)
    @SerializedName("weather_descriptions")
    var weatherDescriptions: List<String>,
//    @TypeConverters(WeatherIconsConverter::class)
    @SerializedName("weather_icons")
    var weatherIcons: List<String>,
    @SerializedName("wind_degree")
    val windDegree: Double,
    @SerializedName("wind_dir")
    val windDir: String,
    @SerializedName("wind_speed")
    val windSpeed: Double
){
    @PrimaryKey(autoGenerate = false)
    var id: Int = CURRENT_WEATHER_ID

}