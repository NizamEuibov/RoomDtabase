package com.example.lessons.fragments.room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query


@Dao

interface RegistrationDAO {
    @Insert
     fun addPerson(person:RegistrationEntity)

    @Query("SELECT * FROM registration_table")
    fun getInformation():LiveData<List<RegistrationEntity>>
}