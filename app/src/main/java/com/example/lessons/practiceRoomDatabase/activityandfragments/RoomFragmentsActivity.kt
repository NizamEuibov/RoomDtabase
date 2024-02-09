package com.example.lessons.practiceRoomDatabase.activityandfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import com.example.lessons.R
import com.example.lessons.databinding.ActivityRoomFragmentsBinding

class RoomFragmentsActivity : AppCompatActivity() {
    private var binding:ActivityRoomFragmentsBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityRoomFragmentsBinding.inflate(layoutInflater)
        setContentView(binding?.root)


    }
}