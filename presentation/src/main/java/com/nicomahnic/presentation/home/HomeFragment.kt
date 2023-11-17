package com.nicomahnic.presentation.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.nicomahnic.domain.model.User
import com.nicomahnic.presentation.R
import com.nicomahnic.presentation.databinding.FragmentHomeBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var binding: FragmentHomeBinding
    private val viewModel by viewModel<HomeViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)

        println("NM: HomeFragment")

        binding.insertBtn.setOnClickListener {
            viewModel.insertUsers(generateUserList())
        }

        binding.getBtn.setOnClickListener {
            viewModel.getUsers()
        }
    }

    companion object {

        private fun generateUserList() : List<User> {
            val users = mutableListOf<User>()
            repeat(getRandomInt()) {
                users.add(User(getRandomString()))
            }
            return users.toList()
        }

        private fun getRandomInt() : Int = (0..5).random()
        private fun getRandomString() : String {
            val allowedChars = ('A'..'Z') + ('a'..'z') + ('0'..'9')
            return (1..8)
                .map { allowedChars.random() }
                .joinToString("")
        }
    }
}