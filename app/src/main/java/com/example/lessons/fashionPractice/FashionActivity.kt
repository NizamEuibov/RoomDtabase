package com.example.lessons.fashionPractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lessons.R
import com.example.lessons.databinding.ActivityFashionBinding
import com.google.android.material.tabs.TabLayoutMediator

class FashionActivity : AppCompatActivity() {
    private lateinit var binding:ActivityFashionBinding
    val pagerAdapter=FashionAdapter(dataList())
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityFashionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fashionViewPager.adapter=pagerAdapter

        val mediator=TabLayoutMediator(binding.tabLayout,binding.fashionViewPager){
            tab,position->
                tab.text=dataList()[position].name
        }
        mediator.attach()
    }


    private fun dataList()= listOf(
        FashionDataClass("Nizam","Eiubov"),
        FashionDataClass("Elxan","Ekberov"),
        FashionDataClass("Elvin","Abbasov")
    )
}