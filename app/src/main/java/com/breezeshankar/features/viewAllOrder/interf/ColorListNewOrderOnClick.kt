package com.breezeshankar.features.viewAllOrder.interf

import com.breezeshankar.app.domain.NewOrderColorEntity
import com.breezeshankar.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}