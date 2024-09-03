package com.breezeshankar.features.stockAddCurrentStock.api

import com.breezeshankar.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezeshankar.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}