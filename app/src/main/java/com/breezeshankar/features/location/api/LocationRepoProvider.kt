package com.breezeshankar.features.location.api

import com.breezeshankar.features.location.shopdurationapi.ShopDurationApi
import com.breezeshankar.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}