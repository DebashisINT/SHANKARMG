package com.breezeshankar.features.viewAllOrder.interf

import com.breezeshankar.app.domain.NewOrderProductEntity
import com.breezeshankar.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}