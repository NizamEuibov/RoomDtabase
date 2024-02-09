package com.example.lessons.practiceRoomDatabase

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class UserViewModel1 : ViewModel() {
    private val userdao = MyData.appDatabase?.userDao()
    val data: LiveData<List<User>>?=userdao?.readAllData()


    fun adduser(user: User) {
        Log.d("UserViewModel1", "Adding user: $user")
        userdao?.addUser(user)
        Log.d("UserViewModel1", "User added successfully")
    }

    fun getUser(){
        userdao?.readAllData()
    }
    }

