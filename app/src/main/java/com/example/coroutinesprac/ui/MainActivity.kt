package com.example.coroutinesprac.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.coroutinesprac.R
import com.example.coroutinesprac.repository.UserRepository
import com.example.coroutinesprac.ui.adapters.UserAdapter
import com.example.coroutinesprac.viewmodels.UserViewModel
import com.example.coroutinesprac.viewmodels.UserViewModelFactory
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

//import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {
    private lateinit var userRecyclerView: RecyclerView
//    private lateinit var userView: UserViewModel
    private val userViewModel: UserViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        userRecyclerView = findViewById(R.id.userRv)
        userRecyclerView.layoutManager = LinearLayoutManager(this)
//        val userRepository = UserRepository(ApiClient().getRetrofitInstance())
//        val userViewModelFactory = UserViewModelFactory(userRepository)
//        userView = ViewModelProvider(this, userViewModelFactory)[UserViewModel::class.java]
        observeUsers()
    }

    fun observeUsers() {
               userViewModel.getUsers()

        userViewModel.data.observe(this, Observer {
            userRecyclerView.adapter=UserAdapter(it)
        })
////        userView.getUsers()
////        userView.data.observe(this, Observer {
////            userRecyclerView.adapter = UserAdapter(it)
////        })
    }
}