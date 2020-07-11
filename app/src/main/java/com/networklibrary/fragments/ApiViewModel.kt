package com.networklibrary.fragments

import androidx.lifecycle.ViewModel
import com.google.gson.JsonObject
import com.networklibx.controller.SpeedXService
import io.reactivex.rxjava3.core.Observable

class ApiViewModel: ViewModel() {


    fun getListOfTrends(placeId: String): Observable<List<JsonObject>> {
        return  SpeedXService.speedXApi.getTrends(placeId)
    }
}