package com.nicomahnic.presentation.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nicomahnic.domain.model.User
import com.nicomahnic.domain.usecase.DeleteUsersUseCase
import com.nicomahnic.domain.usecase.GetUsersUseCase
import com.nicomahnic.domain.usecase.InsertUsersUseCase
import com.nicomahnic.presentation.home.model.HomeUi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class HomeViewModel(
    private val getUsersUseCase: GetUsersUseCase,
    private val insertUsersUseCase: InsertUsersUseCase,
    private val deleteUsersUseCase: DeleteUsersUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow(HomeUi())
    val uiState: StateFlow<HomeUi> = _uiState.asStateFlow()

    init {
        println("NM: HomeViewModel")
    }

    fun deleteUsers() {
        viewModelScope.launch(Dispatchers.IO){
            deleteUsersUseCase().also {
                _uiState.value = _uiState.value.copy(users = listOf())
            }
        }
    }

    fun getUsers() {
        viewModelScope.launch(Dispatchers.IO) {
            val users = getUsersUseCase()
            println("NM: users qty ${users.size}")
            users.forEach {
                println("NM: user $it")
            }
            _uiState.value = _uiState.value.copy(users = users)
        }
    }

    fun insertUsers(users: List<User>){
        viewModelScope.launch(Dispatchers.IO) {
            insertUsersUseCase(users)
        }
    }

}