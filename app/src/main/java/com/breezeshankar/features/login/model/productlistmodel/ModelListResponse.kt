package com.breezeshankar.features.login.model.productlistmodel

import com.breezeshankar.app.domain.ModelEntity
import com.breezeshankar.app.domain.ProductListEntity
import com.breezeshankar.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}