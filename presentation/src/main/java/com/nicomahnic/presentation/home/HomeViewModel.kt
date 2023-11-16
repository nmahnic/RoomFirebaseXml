package com.nicomahnic.presentation.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nicomahnic.domain.usecase.GetUsersUseCase
import kotlinx.coroutines.launch

class HomeViewModel(
    private val getUsersUseCase: GetUsersUseCase
) : ViewModel() {

    fun getUsers() {
        viewModelScope.launch {
            val users = getUsersUseCase.getUsers()
        }
    }

}