package com.example.coroutinesprac.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.coroutinesprac.R
import com.example.coroutinesprac.models.UserModelItem

class UserAdapter(private val userList: ArrayList<UserModelItem?>?) :
    RecyclerView.Adapter<UserAdapter.UserViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.users_rv_layout, parent, false)
        return UserViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.userId.text = userList[position].id.toString()
        holder.userName.text = userList[position].name
    }

    class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val userId = itemView.findViewById<TextView>(R.id.tvUserId)
        val userName = itemView.findViewById<TextView>(R.id.tvUserName)
    }
}