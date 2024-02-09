package com.example.lessons.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lessons.R
import com.example.lessons.databinding.ActivityFragmentBinding
import com.google.android.material.tabs.TabLayoutMediator

class FragmentActivity : AppCompatActivity() {
    private lateinit var binding:ActivityFragmentBinding
    private val adapter=FragmentsStateAdapter(supportFragmentManager,lifecycle)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)



//        binding.viewPager.adapter=adapter

//        val mediator=TabLayoutMediator(binding.tablayout,binding.viewPager){
//            tab, position->
//            when(position){
//                0->tab.text="Sign Up"
//                1->tab.text="Log In"
//            }
//        }
//        mediator.attach()


        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentConteiner,SignUpFragment())
            .commit()
    }

}