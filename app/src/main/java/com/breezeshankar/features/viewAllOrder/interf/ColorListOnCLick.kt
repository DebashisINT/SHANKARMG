package com.breezeshankar.features.viewAllOrder.interf

import com.breezeshankar.app.domain.NewOrderGenderEntity
import com.breezeshankar.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}