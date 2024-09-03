package com.breezeshankar.features.viewAllOrder.interf

import com.breezeshankar.app.domain.NewOrderGenderEntity
import com.breezeshankar.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}