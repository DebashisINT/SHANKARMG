package com.breezeshankar.features.mylearning.apiCall

import com.breezeshankar.features.login.api.opportunity.OpportunityListApi
import com.breezeshankar.features.login.api.opportunity.OpportunityListRepo

object LMSRepoProvider {
    fun getTopicList(): LMSRepo {
        return LMSRepo(LMSApi.create())
    }
}