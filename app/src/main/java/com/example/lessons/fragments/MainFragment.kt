package com.example.lessons.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lessons.R
import com.example.lessons.databinding.FragmentMainBinding
import com.example.lessons.fragments.room.RecyclerDataClass
import com.example.lessons.fragments.room.RegistrationEntity
import com.example.lessons.fragments.room.RegistrationViewModel
import com.example.lessons.fragments.room.SimpleRecycleView


class MainFragment : Fragment() {
    private var binding: FragmentMainBinding? = null
    private val adapter = SimpleRecycleView()
    private val viewModel: RegistrationViewModel by viewModels<RegistrationViewModel>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(layoutInflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        binding?.maintext?.text = viewModel.getInformation().toString()


    }
}

//    private fun init() {
//        binding?.recyclerView?.adapter = adapter
//        binding?.recyclerView?.layoutManager = LinearLayoutManager(context)
//        viewModel.getInformation()
//
//        parentFragmentManager.popBackStack()
//    }
//}






