package com.nicomahnic.domain.usecase

import com.nicomahnic.domain.model.User
import com.nicomahnic.domain.repository.UserRepository

class InsertUsersUseCaseImpl(
    private val userRepository: UserRepository
) : InsertUsersUseCase {

    override suspend fun invoke(users: List<User>) {
        println("NM: InsertUsersUseCaseImpl")
        users.forEach {
            val id = userRepository.insertUser(it)
            println("NM: id inserted: $id")
        }
    }

}