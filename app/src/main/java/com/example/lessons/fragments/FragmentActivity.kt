package com.example.lessons.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lessons.R
import com.example.lessons.databinding.ActivityFragmentBinding

class FragmentActivity : AppCompatActivity() {
    private var binding:ActivityFragmentBinding?=null
    private val adapter=FragmentsStateAdapter(supportFragmentManager,lifecycle)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityFragmentBinding.inflate(layoutInflater)
        setContentView(binding?.root)



        binding?.viewPager?.adapter=adapter


        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentConteiner,AuthenticationFragment())
            .commit()
    }
}