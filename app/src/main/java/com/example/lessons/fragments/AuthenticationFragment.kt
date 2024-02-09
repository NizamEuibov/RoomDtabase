package com.example.lessons.fragments

import  android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResultListener
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.lessons.R
import com.example.lessons.databinding.FragmentAuthenticationBinding

class AuthenticationFragment : Fragment() {

    private var binding: FragmentAuthenticationBinding? = null




//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        email = arguments?.getString("email")
//        password = arguments?.getString("password")
//    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAuthenticationBinding.inflate(layoutInflater, container, false)
        return binding?.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.buttonSignIn?.setOnClickListener {
            findNavController().navigate(R.id.authenticationAction)
//            signIn()
//
//            parentFragmentManager.beginTransaction()
//                .replace(R.id.fragmentConteiner,MainFragment())
//                .add(R.id.fragmentConteiner,MainFragment())
//                .commit()
//
//            Log.d("GFIYFGOVLIUJ","work")
        }
        binding?.buttonSignUp?.setOnClickListener {
           openSignUp()
        }


    }

    private fun signIn() {




                parentFragmentManager.beginTransaction()
                    .replace(R.id.fragmentConteiner, MainFragment())
                    .addToBackStack(AuthenticationFragment::class.java.canonicalName)
                    .commit()

    }

    fun openSignUp() {
        parentFragmentManager.beginTransaction()
            .replace(R.id.fragmentConteiner, SignUpFragment())
            .addToBackStack(AuthenticationFragment::class.java.canonicalName)
            .commit()
    }

}

