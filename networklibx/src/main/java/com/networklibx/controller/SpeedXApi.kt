package com.networklibx.controller

import com.google.gson.JsonObject
import io.reactivex.rxjava3.core.Flowable
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET
import retrofit2.http.Query


interface SpeedXApi {

    @GET("search/tweets.json")
    fun searchTweets(@Query("q") query: String?): Flowable<JsonObject?>?

    @GET("trends/place.json")
    fun getTrends(@Query("id") placeId: String): Observable<List<JsonObject>>
}