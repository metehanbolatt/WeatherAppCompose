package com.metehanbolat.weatherappcompose.data.repository

import com.metehanbolat.weatherappcompose.data.mappers.toWeatherInfo
import com.metehanbolat.weatherappcompose.data.remote.WeatherApi
import com.metehanbolat.weatherappcompose.domain.repository.WeatherRepository
import com.metehanbolat.weatherappcompose.domain.util.Resource
import com.metehanbolat.weatherappcompose.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi
): WeatherRepository {

    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    long = long
                ).toWeatherInfo()
            )
        } catch (e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred!")
        }
    }
}