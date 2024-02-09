package com.example.lessons.practiceRoomDatabase

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@Dao


interface UserDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
     fun addUser(user: User)


    @Query("SELECT * FROM user_data")
     fun readAllData():LiveData<List<User>>

}