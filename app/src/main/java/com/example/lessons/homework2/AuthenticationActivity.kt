package com.example.lessons.homework2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import com.example.lessons.databinding.ActivityAuthenticationBinding

class AuthenticationActivity : AppCompatActivity() {
    private var binding:ActivityAuthenticationBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityAuthenticationBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.buttonSignIn?.setOnClickListener{
            startActivity()
        }

        binding?.buttonSignUp?.setOnClickListener{
            startActivity(Intent(this,SignUpActivity::class.java))

        }
    }


    private fun startActivity() {
        val sharedPrefernce=getSharedPreferences("myPref", MODE_PRIVATE)
        val editor=sharedPrefernce.edit()
        var intent=Intent(this, MainActivity::class.java)
        val email = binding?.edittextEmail?.text?.toString()
        val password = binding?.edittextPassword?.text?.toString()
        val x=password?.length



        if (email!!.isNotEmpty() && password!!.isNotEmpty() && x!!>=8) {

//            editor.apply {
//                putString("email",email)
//                putString("password",password)
//                apply()
//            }


             intent.putExtra("email",email)
         startActivity(intent)
        }
        else Toast.makeText(this,
            "Enter email  or correct password",Toast.LENGTH_LONG).show()
}





}