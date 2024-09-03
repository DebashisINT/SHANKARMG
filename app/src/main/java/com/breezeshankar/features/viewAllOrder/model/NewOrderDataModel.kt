package com.breezeshankar.features.viewAllOrder.model

import com.breezeshankar.app.domain.NewOrderColorEntity
import com.breezeshankar.app.domain.NewOrderGenderEntity
import com.breezeshankar.app.domain.NewOrderProductEntity
import com.breezeshankar.app.domain.NewOrderSizeEntity
import com.breezeshankar.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

