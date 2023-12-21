package com.example.lessons.network

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NetworkViewModel:ViewModel() {

    val networkLivedata=MutableLiveData<NetworkDataClass>()
       val network:LiveData<NetworkDataClass>
       get() =networkLivedata



    init {
        postGet()
    }

    fun postGet(){

        val network=RetrofitInstance.retrofitApi.getPost()
    }
}