package com.example.lessons.homework2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import com.example.lessons.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    private var binding:ActivitySignUpBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.buttonsignup?.setOnClickListener{
            startActivity1()

        }
    }


    private fun startActivity1() {
        val email = binding?.edittext1?.text?.toString()
        val birthday = binding?.edittext2?.text?.toString()
        val password=binding?.edittext3?.text?.toString()
        val password2=binding?.edittext4?.text?.toString()
        val passowrdLength=password?.length


        if ( email!!.isNotEmpty() && birthday!!.isNotEmpty() && password!!.isNotEmpty()
            && password2!!.isNotEmpty() && password==password2 && passowrdLength!!>=8)
        {
            startActivity(Intent(this, AuthenticationActivity::class.java).apply {
                intent.putExtra("Email",email)
                intent.putExtra("Password",password)
                flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK

            })

        }

        else Toast.makeText(this,
            "Enter correct information", Toast.LENGTH_LONG).show()
    }

}