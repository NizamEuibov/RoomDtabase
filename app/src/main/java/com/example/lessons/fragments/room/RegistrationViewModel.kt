package com.example.lessons.fragments.room

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class RegistrationViewModel : ViewModel() {
    private val dAO = MYDB.appDatabase?.getRegistrationDAO()
    val allUsers: LiveData<List<RegistrationEntity>>? = dAO?.getInformation()

    fun setInformation(email: String, password: String) {
        dAO!!.addPerson(RegistrationEntity(email = email, password = password))
    }

    fun getInformation() {
        dAO!!.getInformation()
    }
}