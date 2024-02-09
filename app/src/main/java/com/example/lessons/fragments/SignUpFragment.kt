package com.example.lessons.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.lessons.R
import com.example.lessons.databinding.FragmentSignUpBinding
import com.example.lessons.fragments.room.RegistrationViewModel
import com.example.lessons.fragments.room.SimpleRecycleView

class SignUpFragment : Fragment() {
    private val adapter = SimpleRecycleView()
    private var binding: FragmentSignUpBinding? = null
    private val viewModel: RegistrationViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSignUpBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.recyclerView?.adapter = adapter

        viewModel.allUsers?.observe(viewLifecycleOwner) {
            adapter.updateData(it)
        }


        binding?.buttonsignup?.setOnClickListener {
            viewModel.setInformation("nizam", "eiubov")
        }
    }




    private fun signUp() {
        val edit1 = binding?.edittext1?.text.toString()
        val edit2 = binding?.edittext2?.text.toString()
        val edit3 = binding?.edittext3?.text.toString()
        val edit4 = binding?.edittext4?.text.toString()



        if (edit1.isNotEmpty() && edit2.isNotEmpty()
            && edit3.isNotEmpty() && edit4.isNotEmpty()
            && edit3 == edit4 && edit3.length >= 8
        ) {


            //            val bundle = bundleOf(
            //                "email" to binding?.edittext1?.text,
            //                "password" to binding?.edittext3?.text
            //            )
//                setFragmentResult(
//                    "result", bundleOf(
//                        "email" to edit1,
//                        "password" to edit3
//                    )
//                )








            parentFragmentManager.popBackStack()

        }

//            Toast.makeText(
//                context,
//                "Enter correct information", Toast.LENGTH_LONG).show()
//        }


    }
}