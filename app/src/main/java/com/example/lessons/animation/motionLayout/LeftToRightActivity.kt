package com.example.lessons.animation.motionLayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lessons.R
import com.example.lessons.databinding.ActivityLeftToRightBinding

class LeftToRightActivity : AppCompatActivity() {
    private var binding: ActivityLeftToRightBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLeftToRightBinding.inflate(layoutInflater)
        setContentView(binding?.root)

//        var isTransitionToEnd = false
//
//        binding?.btnAnimate?.setOnClickListener {
//            if (!isTransitionToEnd) {
//                isTransitionToEnd = true
//                binding?.motionLayout?.transitionToEnd()
//            } else {
//                isTransitionToEnd = false
//                binding?.motionLayout?.transitionToStart()
//            }
//        }
//    }
}}

