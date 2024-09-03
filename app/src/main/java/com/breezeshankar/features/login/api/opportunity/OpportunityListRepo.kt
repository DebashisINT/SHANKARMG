package com.breezeshankar.features.login.api.opportunity

import com.breezeshankar.app.Pref
import com.breezeshankar.app.utils.AppUtils
import com.breezeshankar.base.BaseResponse
import com.breezeshankar.features.addshop.model.AudioFetchDataCLass
import com.breezeshankar.features.dashboard.presentation.DashboardActivity
import com.breezeshankar.features.login.model.opportunitymodel.OpportunityStatusListResponseModel
import com.breezeshankar.features.login.model.productlistmodel.ProductListResponseModel
import com.breezeshankar.features.orderITC.SyncDeleteOppt
import com.breezeshankar.features.orderITC.SyncEditOppt
import com.breezeshankar.features.orderITC.SyncOppt
import com.breezeshankar.features.orderList.model.OpportunityListResponseModel
import io.reactivex.Observable
import timber.log.Timber

/**
 * Created by Saikat on 20-11-2018.
 */
class OpportunityListRepo(val apiService: OpportunityListApi) {
    fun getOpportunityStatus(session_token: String): Observable<OpportunityStatusListResponseModel> {
        return apiService.getOpportunityStatusList(session_token)
    }

    fun saveOpportunity(syncOppt: SyncOppt): Observable<BaseResponse> {
        return apiService.saveOpportunity(syncOppt)
    }

    fun editOpportunity(syncEditOppt: SyncEditOppt): Observable<BaseResponse> {
        return apiService.editOpportunity(syncEditOppt)
    }
    fun deleteOpportunity(syncDeleteOppt: SyncDeleteOppt): Observable<BaseResponse> {
        return apiService.deleteOpportunity(syncDeleteOppt)
    }
    fun getOpportunityL(user_id: String): Observable<OpportunityListResponseModel> {
        return apiService.getOpportunityL(user_id)
    }

    fun getAudioL(user_id: String,data_limit_in_days:String): Observable<AudioFetchDataCLass> {
        return apiService.getAudioLApi(user_id,data_limit_in_days)
    }


    fun saveLMSModuleInfo(obj: DashboardActivity.LMSModule): Observable<BaseResponse> {
        return apiService.saveLMSModuleInfoApi(obj)
    }
}