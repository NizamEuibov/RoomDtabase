package com.example.lessons.homework2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lessons.R
import com.example.lessons.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding:ActivityMainBinding?=null
    val authenticationAdapter=AuthenticationAdapter(emailList())
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
             init()

        val receiver=intent.getStringExtra("email")

            if (receiver!!.isNotEmpty()) {
                emailList().add(DataClass(receiver))
                authenticationAdapter.addNotes(emailList())
            }



    }


    private fun emailList()= mutableListOf(
                DataClass("jhvljhv;kv;ilj"),
                DataClass("jhvljhv;kv;ilj"),
                DataClass("jhvljhv;kv;ilj")
    )


    private fun init(){
        binding?.recyclerView?.layoutManager=LinearLayoutManager(this)
        binding?.recyclerView?.adapter=authenticationAdapter
        authenticationAdapter.addNotes(emailList())
    }
}