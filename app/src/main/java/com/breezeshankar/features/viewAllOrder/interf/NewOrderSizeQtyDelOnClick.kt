package com.breezeshankar.features.viewAllOrder.interf

import com.breezeshankar.app.domain.NewOrderGenderEntity
import com.breezeshankar.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}