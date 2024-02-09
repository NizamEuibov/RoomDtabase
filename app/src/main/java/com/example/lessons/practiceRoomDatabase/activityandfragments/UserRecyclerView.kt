package com.example.lessons.practiceRoomDatabase.activityandfragments

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.lessons.databinding.UserListBinding
import com.example.lessons.fragments.room.RegistrationEntity
import com.example.lessons.practiceRoomDatabase.User

class UserRecyclerView : RecyclerView.Adapter<UserRecyclerView.UserViewHolder>() {
    private val dataList = mutableListOf<User>()
    private lateinit var binding: UserListBinding

    fun updateData(newList: List<User>) {
        dataList.clear()
        dataList.addAll(newList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        if (!::binding.isInitialized) {
            binding = UserListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        }
        return UserViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(dataList[position])
    }

    class UserViewHolder(private val binding: UserListBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: User) {
            binding.idTxt.text = data.id.toString()
            binding.firstNameTxt.text = data.name
            binding.lastNameTxt.text = data.surname
        }
    }
}


