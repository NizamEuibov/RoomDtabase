package com.example.lessons.practiceRoomDatabase.activityandfragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.lessons.R
import com.example.lessons.databinding.FragmentUserAddBinding
import com.example.lessons.practiceRoomDatabase.User
import com.example.lessons.practiceRoomDatabase.UserViewModel1

class UserAddFragment : Fragment() {
    private var binding: FragmentUserAddBinding? = null
    private val viewModel: UserViewModel1 by viewModels<UserViewModel1>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUserAddBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return (binding?.root)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.addBtn?.setOnClickListener {
            insertDataToDatabase()

        }
    }


    private fun insertDataToDatabase() {

        val firstName = binding?.addFirstNameEt?.text.toString()
        val lastName = binding?.addLastNameEt?.text.toString()



        if ((firstName.isNotEmpty() && lastName.isNotEmpty())) {

            val user = User(1,firstName, lastName)


            viewModel.adduser(user)
            Toast.makeText(requireContext(), "Successfully added!", Toast.LENGTH_LONG).show()

            findNavController().navigate(R.id.action_addFragment_to_listFragment)
        } else {
            Toast.makeText(requireContext(), "Please fill out all fields!", Toast.LENGTH_LONG)
                .show()
        }
    }
}