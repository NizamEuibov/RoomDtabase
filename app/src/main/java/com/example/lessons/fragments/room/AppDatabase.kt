package com.example.lessons.fragments.room

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(
    entities =[RegistrationEntity::class],
    version = 1
)
abstract class AppDatabase:RoomDatabase() {
    abstract fun getRegistrationDAO():RegistrationDAO

}