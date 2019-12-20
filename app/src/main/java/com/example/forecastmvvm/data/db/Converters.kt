package com.example.forecastmvvm.data.db

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import org.threeten.bp.LocalDate
import org.threeten.bp.format.DateTimeFormatter

class Converters {

    @TypeConverter
    fun stringToSomeObjectList(data: String?): List<String> {
        val gson = Gson()
        if (data == null) {
            return emptyList()
        }

        val listType = object : TypeToken<List<String>>() {

        }.type

        return gson.fromJson(data, listType)
    }

    @TypeConverter
    fun someObjectListToString(someObjects: List<String>): String {
        val gson = Gson()
        return gson.toJson(someObjects)
    }

    @TypeConverter
    fun stringToInt(data: String?): List<Int> {
        val gson = Gson()
        if (data == null) {
            return emptyList()
        }

        val listType = object : TypeToken<List<Int>>() {

        }.type

        return gson.fromJson(data, listType)
    }

    @TypeConverter
    fun intToString(someObjects: List<Int>): String {
        val gson = Gson()
        return gson.toJson(someObjects)
    }

//    @TypeConverter
//    @JvmStatic
//    fun stringToDate(str: String?) = str?.let {
//        LocalDate.parse(it, DateTimeFormatter.ISO_LOCAL_DATE)
//    }
//
//    @TypeConverter
//    @JvmStatic
//    fun dateToString(dateTime: LocalDate?) = dateTime?.format(DateTimeFormatter.ISO_LOCAL_DATE)
}