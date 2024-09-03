package com.breezeshankar.features.login.model.opportunitymodel

import com.breezeshankar.app.domain.OpportunityStatusEntity
import com.breezeshankar.app.domain.ProductListEntity
import com.breezeshankar.base.BaseResponse

/**
 * Created by Puja on 30.05.2024
 */
class OpportunityStatusListResponseModel : BaseResponse() {
    var status_list: ArrayList<OpportunityStatusEntity>? = null
}