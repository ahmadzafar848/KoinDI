package com.example.coroutinesprac.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.coroutinesprac.models.UserModelItem
import com.example.coroutinesprac.repository.UserRepository
import kotlinx.coroutines.launch

class UserViewModel(private val userRepository: UserRepository):ViewModel() {
    var data=MutableLiveData<ArrayList<UserModelItem?>?>()

    fun getUsers(){
        viewModelScope.launch {
            try {
                val users=userRepository.getUsers()
                data.postValue(users)
            }catch (e:Exception){
                throw e
            }
        }
    }

}