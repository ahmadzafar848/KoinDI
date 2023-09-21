package com.example.coroutinesprac.di

import com.example.coroutinesprac.network.ApiClient
import com.example.coroutinesprac.repository.UserRepository
import com.example.coroutinesprac.viewmodels.UserViewModel
import com.example.coroutinesprac.viewmodels.UserViewModelFactory
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule=module {
    single { ApiClient.getRetrofitInstance() }
    single { UserRepository(get()) }
    viewModel { UserViewModel(get()) }
}