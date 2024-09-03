package com.breezeshankar.features.viewAllOrder.orderOptimized

import com.breezeshankar.app.domain.ProductOnlineRateTempEntity
import com.breezeshankar.base.BaseResponse
import com.breezeshankar.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}