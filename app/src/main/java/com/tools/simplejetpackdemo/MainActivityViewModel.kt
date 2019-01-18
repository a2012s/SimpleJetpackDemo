package com.tools.simplejetpackdemo

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.github.kittinunf.fuel.Fuel
import com.github.kittinunf.fuel.core.FuelError
import com.github.kittinunf.fuel.livedata.liveDataObject
import com.github.kittinunf.result.Result

class MainActivityViewModel : ViewModel() {
    val user = User("Jack", 12)
    fun getLiveObservableData(): LiveData<Result<GirlData, FuelError>> {
        return GankDataRepository.getLiveObservableData("20","1")
    }

}