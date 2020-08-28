package com.sunnyweather.arthur.logic.network

import com.sunnyweather.arthur.SunnyWeatherApplication
import com.sunnyweather.arthur.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {

    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>
}