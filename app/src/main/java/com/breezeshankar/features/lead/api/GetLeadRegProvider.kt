package com.breezeshankar.features.lead.api

import com.breezeshankar.features.NewQuotation.api.GetQuotListRegRepository
import com.breezeshankar.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}