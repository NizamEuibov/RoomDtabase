package com.example.lessons.practiceRoomDatabase.activityandfragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lessons.R
import com.example.lessons.databinding.FragmentUserListBinding
import com.example.lessons.practiceRoomDatabase.User
import com.example.lessons.practiceRoomDatabase.UserViewModel1


class UserListFragment : Fragment() {
    private var binding: FragmentUserListBinding? = null
    private val adapter = UserRecyclerView()
    private val viewModel: UserViewModel1 by viewModels<UserViewModel1>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUserListBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.recyclerview?.adapter = adapter
        binding?.recyclerview?.layoutManager = LinearLayoutManager(requireContext())



        viewModel.data?.observe(viewLifecycleOwner) { userList ->
            userList?.let {
                adapter.updateData(it)
                Log.d("IT","$it")
            }
        }
        binding?.floatingActionButton?.setOnClickListener {
            findNavController().navigate(R.id.fragment_action)
        }
    }


}