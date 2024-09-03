package com.breezeshankar.features.location.shopRevisitStatus

import com.breezeshankar.base.BaseResponse
import com.breezeshankar.features.location.model.ShopDurationRequest
import com.breezeshankar.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}