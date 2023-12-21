package com.example.lessons.network

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.lessons.R
import com.example.lessons.databinding.ActivityNetworkBinding

class NetworkActivity : AppCompatActivity() {
    private var binding:ActivityNetworkBinding?=null

    val viewModel:NetworkViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityNetworkBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        viewModel.network.observe(this){network->
            binding?.networktext?.text= network.id.toString()
        }
    }
}