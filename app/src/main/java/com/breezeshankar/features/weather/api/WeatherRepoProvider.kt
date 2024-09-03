package com.breezeshankar.features.weather.api

import com.breezeshankar.features.task.api.TaskApi
import com.breezeshankar.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}