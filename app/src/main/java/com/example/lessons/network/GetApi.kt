package com.example.lessons.network

import retrofit2.Call
import retrofit2.http.GET

interface GetApi {

    @GET("/posts/1")
    fun getPost(): Call<List<NetworkDataClass>>
}