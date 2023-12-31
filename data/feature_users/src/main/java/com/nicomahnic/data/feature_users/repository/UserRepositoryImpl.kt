package com.nicomahnic.data.feature_users.repository

import com.nicomahnic.domain.model.User
import com.nicomahnic.domain.repository.UserRepository

class UserRepositoryImpl(
    private val localUserDataSource: LocalUserDataSource
) : UserRepository {

    override suspend fun getUsers() : List<User> {
        println("NM: UserRepositoryImpl getUsers")
        return localUserDataSource.getUsers()
    }

    override suspend fun insertUser(user: User): Long {
        println("NM: UserRepositoryImpl insertUser")
        return localUserDataSource.insertUser(user)
    }

}