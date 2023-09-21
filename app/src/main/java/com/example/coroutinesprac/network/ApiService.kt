package com.example.coroutinesprac.network

import com.example.coroutinesprac.models.UserModelItem
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("/users")
    suspend fun getUsers():ArrayList<UserModelItem?>
}