package com.example.coroutinesprac.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object ApiClient {
    private val BASE_URL = "https://jsonplaceholder.typicode.com"
    fun getRetrofitInstance(): ApiService {
        val retrofit =
            Retrofit.Builder().
                 baseUrl(BASE_URL).
                 addConverterFactory(GsonConverterFactory.create())
                .build().create(ApiService::class.java)
        return retrofit
    }

}