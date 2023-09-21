package com.example.coroutinesprac.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.coroutinesprac.repository.UserRepository

class UserViewModelFactory(private val userRepository: UserRepository):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(UserViewModel::class.java)){
            return UserViewModel(userRepository) as T
        }
        throw IllegalAccessException("Unknown Model Class")
    }
}