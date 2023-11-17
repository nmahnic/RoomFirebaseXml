package com.nicomahnic.data.feature_users.datasource.local

import com.nicomahnic.data.feature_users.datasource.local.dao.UserDao
import com.nicomahnic.data.feature_users.datasource.local.entity.UserEntity
import com.nicomahnic.data.feature_users.repository.LocalUserDataSource
import com.nicomahnic.domain.model.User

class LocalUserDataSourceImpl(
    private val userDao: UserDao
) : LocalUserDataSource {
    override suspend fun getUsers(): List<User> {
        println("NM: LocalUserDataSource getUsers")
        return userDao.getUsers().map {
            User(
                id = it.id,
                name = it.name
            )
        }
    }

    override suspend fun insertUser(user: User): Long {
        println("NM: LocalUserDataSource insertUser")
        return userDao.insertUser(
            UserEntity(
                name = user.name,
                id = user.id
            )
        )
    }

}