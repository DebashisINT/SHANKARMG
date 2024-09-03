package com.breezeshankar.features.stockAddCurrentStock.api

import com.breezeshankar.base.BaseResponse
import com.breezeshankar.features.location.model.ShopRevisitStatusRequest
import com.breezeshankar.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezeshankar.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.breezeshankar.features.stockAddCurrentStock.model.CurrentStockGetData
import com.breezeshankar.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}