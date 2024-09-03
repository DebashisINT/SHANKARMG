package com.breezeshankar.features.photoReg.present

import com.breezeshankar.app.domain.ProspectEntity
import com.breezeshankar.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}