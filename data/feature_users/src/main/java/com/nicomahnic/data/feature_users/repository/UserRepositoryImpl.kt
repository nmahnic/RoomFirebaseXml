package com.nicomahnic.data.feature_users.repository

import com.nicomahnic.domain.model.User
import com.nicomahnic.domain.repository.UserRepository

class UserRepositoryImpl(
    private val localUserDataSource: LocalUserDataSource,
    private val remoteUserDataSource: RemoteUserDataSource
) : UserRepository {

    override suspend fun getUsers() : List<User> {
        println("NM: UserRepositoryImpl getUsers")
        remoteUserDataSource.getUsers()
        return localUserDataSource.getUsers()
    }

    override suspend fun insertUser(user: User): Long {
        println("NM: UserRepositoryImpl insertUser")
        remoteUserDataSource.insertUser(user)
        return localUserDataSource.insertUser(user)
    }

    override suspend fun deleteUsers() {
        println("NM: UserRepositoryImpl deleteUsers")
        remoteUserDataSource.deleteUsers()
        localUserDataSource.deleteUsers()
    }

}