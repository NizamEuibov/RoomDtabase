package com.example.lessons.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import java.lang.IllegalArgumentException

class FragmentsStateAdapter(fragmentManager: FragmentManager, lifecycle:Lifecycle)
     : FragmentStateAdapter(fragmentManager,lifecycle) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0-> SignUpFragment()
            1->AuthenticationFragment()
            else->throw IllegalArgumentException("invalid-argument:$position")
        }
    }

}