package com.nicomahnic.domain.usecase

import com.nicomahnic.domain.repository.UserRepository

class DeleteUsersUseCaseImpl(
    private val userRepository: UserRepository
) : DeleteUsersUseCase {

    override suspend fun invoke() {
        println("NM: DeleteUsersUseCaseImpl")
        userRepository.deleteUsers()
    }

}