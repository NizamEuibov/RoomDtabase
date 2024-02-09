package com.example.lessons.fragments.room

import android.app.Application
import androidx.room.Room

class App:Application() {
    override fun onCreate() {
        super.onCreate()
        val appDatabase= Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "app_database"
        ).allowMainThreadQueries().build()

        MYDB.appDatabase=appDatabase
    }
}