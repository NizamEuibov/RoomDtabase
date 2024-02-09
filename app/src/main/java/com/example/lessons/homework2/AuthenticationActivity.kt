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
private fun acceptIntent(){

}

    private fun startActivity() {

        var intent=Intent(this, MainActivity::class.java)
        val email = binding?.edittextEmail?.text?.toString()
        val password = binding?.edittextPassword?.text?.toString()
        val passwordLength=password?.length
        val receiver=intent.getStringExtra("Email")
        val receiver2=intent.getStringExtra("Password")



        if (email!!.isNotEmpty() && password!!.isNotEmpty() && passwordLength!!>=8)
        if (email==receiver&& password==receiver2)
        {

//            editor.apply {
//                putString("email",email)
//                putString("password",password)
//                apply()
//            }
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK


             intent.putExtra("email",email)
         startActivity(intent)
        }
        else Toast.makeText(this,
            "Enter email  or correct password",Toast.LENGTH_LONG).show()
}





}