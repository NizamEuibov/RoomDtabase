package com.example.lessons.practiceRoomDatabase

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "user_data")

data class User(
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val name:String,
    val surname:String
)
