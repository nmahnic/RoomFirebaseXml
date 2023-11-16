package com.nicomahnic.domain.usecase

import com.nicomahnic.domain.model.User
import com.nicomahnic.domain.repository.UserRepository

class GetUsersUseCaseImpl(
    private val userRepository: UserRepository
) : GetUsersUseCase {

    override suspend fun getUsers() : List<User> = userRepository.getUsers()

}