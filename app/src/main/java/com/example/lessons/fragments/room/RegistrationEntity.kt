package com.example.lessons.fragments.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey


@Entity(tableName = "registration_table")
data class RegistrationEntity (
    @PrimaryKey(autoGenerate = true)

//    @ColumnInfo("email")
    val email: String?,

//    @ColumnInfo("password")
    val password: String?

)
