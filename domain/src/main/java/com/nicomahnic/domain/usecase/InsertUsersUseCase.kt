package com.nicomahnic.domain.usecase

import com.nicomahnic.domain.model.User

interface InsertUsersUseCase {

    suspend operator fun invoke(users: List<User>)

}