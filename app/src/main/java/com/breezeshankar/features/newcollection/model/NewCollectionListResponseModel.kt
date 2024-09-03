package com.breezeshankar.features.newcollection.model

import com.breezeshankar.app.domain.CollectionDetailsEntity
import com.breezeshankar.base.BaseResponse
import com.breezeshankar.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}