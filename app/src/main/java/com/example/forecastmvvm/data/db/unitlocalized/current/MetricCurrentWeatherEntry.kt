package com.example.forecastmvvm.data.db.unitlocalized.current

import androidx.room.ColumnInfo

data class MetricCurrentWeatherEntry(
    @ColumnInfo(name = "temperature")
    override val temperature: Double,
    @ColumnInfo(name = "weatherDescriptions")
    override val conditionText: String,
    @ColumnInfo(name = "weatherIcons")
    override val conditionIconUrl: String,
    @ColumnInfo(name = "windSpeed")
    override val windSpeed: Double,
    @ColumnInfo(name = "windDir")
    override val windDirection: String,
    @ColumnInfo(name = "precip")
    override val precipitationVolume: Double,
    @ColumnInfo(name = "weatherCode")
    override val feelsLikeTemperature: Double,
    @ColumnInfo(name = "windDegree")
    override val visibilityDistance: Double
) : UnitSpecificCurrentWeatherEntry