package com.example.lessons.fragments.room

object MYDB {
    var appDatabase:AppDatabase?=null

    fun setDatabase(myApp:AppDatabase){
        this.appDatabase= myApp
    }
}