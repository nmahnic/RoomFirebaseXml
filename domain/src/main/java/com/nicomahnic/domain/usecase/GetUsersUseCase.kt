package com.nicomahnic.domain.usecase

import com.nicomahnic.domain.model.User

interface GetUsersUseCase {

    suspend operator fun invoke() : List<User>

}