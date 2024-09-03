package com.breezeshankar.features.dashboard.presentation.api.dayStartEnd

import com.breezeshankar.features.stockCompetetorStock.api.AddCompStockApi
import com.breezeshankar.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}