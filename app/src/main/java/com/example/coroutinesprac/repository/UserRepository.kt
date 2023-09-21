package com.example.coroutinesprac.repository

import com.example.coroutinesprac.models.UserModelItem
import com.example.coroutinesprac.network.ApiService

class UserRepository(private val apiService: ApiService) {

    suspend fun getUsers():ArrayList<UserModelItem?>{
          try {
              return apiService.getUsers()
          }   catch (e:Exception){
              throw e
          }
    }

}