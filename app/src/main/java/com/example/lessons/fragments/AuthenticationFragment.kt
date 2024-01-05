package com.example.lessons.fragments

import  android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.viewModels
import com.example.lessons.R
import com.example.lessons.databinding.FragmentAuthenticationBinding

class AuthenticationFragment : Fragment() {
    private var binding:FragmentAuthenticationBinding?=null

    private var email:String?=null
    private var password:String?=null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        email=arguments?.getString("email")
        password=arguments?.getString("password")
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentAuthenticationBinding.inflate(layoutInflater,container,false)
        return binding?.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.buttonSignIn?.setOnClickListener {
        nextFragment()
        }
    }

    private fun nextFragment(){

        val string=binding?.edittextEmail?.text
        if (binding?.edittextEmail?.text!!.isNotEmpty()  && binding?.edittextPassword?.text!!.isNotEmpty()
            && binding?.edittextPassword!!.length()>=8 ) {

            val bundle = bundleOf(
                "email" to string
            )


            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentConteiner, MainFragment::class.java,bundle)
//                .addToBackStack(AuthenticationFragment::class.java.canonicalName)
                .commit()
        }
        else
            Toast.makeText(context,
            "Enter correct information", Toast.LENGTH_LONG).show()
    }
}

