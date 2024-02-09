package com.example.lessons.animation.motionLayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lessons.R
import com.example.lessons.databinding.FragmentPlayerBinding


class PlayerFragment : Fragment() {
    private var binding:FragmentPlayerBinding?=null
    private val motionLayout=binding?.audioMotionLayout


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentPlayerBinding.inflate(layoutInflater,container,false)
        // Inflate the layout for this fragment
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        motionLayout?.transitionToStart()
    }


}