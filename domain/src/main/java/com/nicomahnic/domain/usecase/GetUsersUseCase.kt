package com.nicomahnic.domain.usecase

import com.nicomahnic.domain.model.User

interface GetUsersUseCase {

    suspend fun getUsers() : List<User>

}