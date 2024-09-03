package com.breezeshankar.features.location.shopRevisitStatus

import com.breezeshankar.features.location.shopdurationapi.ShopDurationApi
import com.breezeshankar.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}