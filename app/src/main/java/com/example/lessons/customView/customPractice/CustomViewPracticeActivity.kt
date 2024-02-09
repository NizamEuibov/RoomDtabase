package com.example.lessons.customView.customPractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lessons.R
import com.example.lessons.databinding.ActivityCustomViewPracticeBinding

class CustomViewPracticeActivity : AppCompatActivity() {
    private var binding:ActivityCustomViewPracticeBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCustomViewPracticeBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
}