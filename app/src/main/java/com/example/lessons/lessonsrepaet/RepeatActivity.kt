package com.example.lessons.lessonsrepaet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.lessons.R
import com.example.lessons.databinding.ActivityRepeatBinding

class RepeatActivity : AppCompatActivity() {
    private var binding:ActivityRepeatBinding?=null
    private val viewModel by viewModels<MyViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityRepeatBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        binding?.textName?.text=viewModel.name

    }
}