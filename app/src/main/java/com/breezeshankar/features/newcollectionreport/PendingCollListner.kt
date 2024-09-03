package com.breezeshankar.features.newcollectionreport

import com.breezeshankar.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}