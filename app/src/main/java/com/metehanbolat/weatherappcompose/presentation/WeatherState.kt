package com.metehanbolat.weatherappcompose.presentation

import com.metehanbolat.weatherappcompose.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
