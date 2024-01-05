package com.example.lessons.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import com.example.lessons.R
import com.example.lessons.databinding.FragmentSignUpBinding

class SignUpFragment : Fragment() {
    private var binding:FragmentSignUpBinding?=null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentSignUpBinding.inflate(layoutInflater,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.buttonsignup?.setOnClickListener {
            signUp()
        }

    }



    private fun signUp(){
        if(binding?.edittext1?.text!!.isNotEmpty()&& binding?.edittext2?.text!!.isNotEmpty()
            &&binding?.edittext3?.text!!.isNotEmpty()&& binding?.edittext4?.text!!.isNotEmpty()
            && binding?.edittext3==binding?.edittext4&& binding?.edittext3?.length()!!>=8) {


            val bundle = bundleOf(
                "email" to binding?.edittext1?.text,
                "password" to binding?.edittext3?.text
            )






            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentConteiner, AuthenticationFragment::class.java, bundle)
                .commit()

        }

        else Toast.makeText(
            context,
            "Enter correct information", Toast.LENGTH_LONG).show()


    }


}