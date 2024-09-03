package com.breezeshankar.features.nearbyuserlist.api

import com.breezeshankar.app.Pref
import com.breezeshankar.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezeshankar.features.newcollection.model.NewCollectionListResponseModel
import com.breezeshankar.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}