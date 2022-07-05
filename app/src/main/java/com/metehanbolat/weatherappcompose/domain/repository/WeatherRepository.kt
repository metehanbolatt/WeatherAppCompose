package com.metehanbolat.weatherappcompose.domain.repository

import com.metehanbolat.weatherappcompose.domain.util.Resource
import com.metehanbolat.weatherappcompose.domain.weather.WeatherInfo

interface WeatherRepository {

    suspend fun getWeatherData(lat: Double, long: Double) : Resource<WeatherInfo>

}