package com.networklibx.controller

import android.util.Base64
import android.util.Log
import okhttp3.*
import org.json.JSONException
import org.json.JSONObject
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.io.IOException


/*
class RetrofitInterceptor : Interceptor {
    private var token: String? = null

    @Throws(IOException::class)
    fun intercept(chain: Interceptor.Chain): Response {
        var request: Request = chain.request()
        if (token == null) {
            val body: ResponseBody = chain.proceed(getToken()).body()
            try {
                val jsonObject = JSONObject(body.string())
                token = "Bearer " + jsonObject.optString("access_token")
            } catch (e: JSONException) {
                e.printStackTrace()
                Log.d(RetrofitInterceptor::class.java.name, "Error fetching token")
            }
        }
        request = request.newBuilder()
            .addHeader("Authorization", token)
            .build()
        return chain.proceed(request)
    }

    private fun getToken(): Request {
        */
/*val bearerToken: String = BuildConfig.CONSUMER_KEY.toString() +
                ":" + BuildConfig.CONSUMER_SECRET
        val base64BearerToken =
            "Basic " + Base64.encodeToString(bearerToken.toByteArray(), Base64.NO_WRAP)*//*

        val requestBody = RequestBody.create(
            MediaType.parse("application/x-www-form-urlencoded; charset=UTF-8"),
            "grant_type=client_credentials"
        )
        return Retrofit.Builder()
            .baseUrl("")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            //.header("Authorization", base64BearerToken)
            .build()
    }
}*/
