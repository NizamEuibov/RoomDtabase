package com.example.lessons.practiceRoomDatabase

import android.app.Application
import android.content.Context
import android.util.Log
import androidx.room.Room

class App : Application() {
    private var appDatabase: UserDatabase? = null
    override fun onCreate() {
        super.onCreate()
        Log.d("App", "App onCreate called")
        appDatabase = Room.databaseBuilder(
            applicationContext, UserDatabase::class.java,
            "user_database"
        ).allowMainThreadQueries().build()
        MyData.appDatabase = appDatabase
    }
}


object MyData {
        var appDatabase: UserDatabase? = null

        fun setDataBase(appDatabase: UserDatabase){
      MyData.appDatabase = appDatabase
        }

    }

