package com.tools.simplejetpackdemo

import androidx.lifecycle.LiveData
import com.github.kittinunf.fuel.Fuel
import com.github.kittinunf.fuel.core.FuelError
import com.github.kittinunf.fuel.livedata.liveDataObject
import com.github.kittinunf.result.Result


object GankDataRepository {
    fun getLiveObservableData(size: String, index: String): LiveData<Result<GirlData, FuelError>> {
        val url = "https://gank.io/api/data/福利/$size/$index"
        return Fuel.get(url).liveDataObject(GirlData.Deserializer())
    }

}