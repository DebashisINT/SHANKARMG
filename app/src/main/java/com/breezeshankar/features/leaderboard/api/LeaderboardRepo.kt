package com.breezeshankar.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezeshankar.app.FileUtils
import com.breezeshankar.app.Pref
import com.breezeshankar.base.BaseResponse
import com.breezeshankar.features.addshop.model.AddLogReqData
import com.breezeshankar.features.addshop.model.AddShopRequestData
import com.breezeshankar.features.addshop.model.AddShopResponse
import com.breezeshankar.features.addshop.model.LogFileResponse
import com.breezeshankar.features.addshop.model.UpdateAddrReq
import com.breezeshankar.features.contacts.CallHisDtls
import com.breezeshankar.features.contacts.CompanyReqData
import com.breezeshankar.features.contacts.ContactMasterRes
import com.breezeshankar.features.contacts.SourceMasterRes
import com.breezeshankar.features.contacts.StageMasterRes
import com.breezeshankar.features.contacts.StatusMasterRes
import com.breezeshankar.features.contacts.TypeMasterRes
import com.breezeshankar.features.dashboard.presentation.DashboardActivity
import com.breezeshankar.features.login.model.WhatsappApiData
import com.breezeshankar.features.login.model.WhatsappApiFetchData
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Puja on 10-10-2024.
 */
class LeaderboardRepo(val apiService: LeaderboardApi) {

    fun branchlist(session_token: String): Observable<LeaderboardBranchData> {
        return apiService.branchList(session_token)
    }
    fun ownDatalist(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOwnData> {
        return apiService.ownDatalist(user_id,activitybased,branchwise,flag)
    }
    fun overAllAPI(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,activitybased,branchwise,flag)
    }
}