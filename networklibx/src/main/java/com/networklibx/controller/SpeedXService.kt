package com.networklibx.controller

import android.util.Log
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory


object SpeedXService {
    val speedXApi: SpeedXApi by lazy {
        Log.d("WebAccess", "Creating retrofit client")
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()

        // Create Retrofit client
        return@lazy retrofit.create<SpeedXApi>(SpeedXApi::class.java)
    }

    fun getClientByOwn(client: SpeedXApi){

    }
}