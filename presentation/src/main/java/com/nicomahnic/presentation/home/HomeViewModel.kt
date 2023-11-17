package com.nicomahnic.presentation.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nicomahnic.domain.model.User
import com.nicomahnic.domain.usecase.GetUsersUseCase
import com.nicomahnic.domain.usecase.InsertUsersUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeViewModel(
    private val getUsersUseCase: GetUsersUseCase,
    private val insertUsersUseCase: InsertUsersUseCase
) : ViewModel() {

    init {
        println("NM: HomeViewModel")
    }

    fun getUsers() {
        viewModelScope.launch(Dispatchers.IO) {
            val users = getUsersUseCase()
            println("NM: users qty ${users.size}")
            users.forEach {
                println("NM: user $it")
            }
        }
    }

    fun insertUsers(users: List<User>){
        viewModelScope.launch(Dispatchers.IO) {
            insertUsersUseCase(users)
        }
    }

}