package com.breezeshankar.features.weather.api

import com.breezeshankar.base.BaseResponse
import com.breezeshankar.features.task.api.TaskApi
import com.breezeshankar.features.task.model.AddTaskInputModel
import com.breezeshankar.features.weather.model.ForeCastAPIResponse
import com.breezeshankar.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}