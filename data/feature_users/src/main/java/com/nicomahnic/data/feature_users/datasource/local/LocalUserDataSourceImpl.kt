package com.nicomahnic.data.feature_users.datasource.local

import com.nicomahnic.data.feature_users.datasource.local.dao.UserDao
import com.nicomahnic.data.feature_users.repository.LocalUserDataSource
import com.nicomahnic.domain.model.User

class LocalUserDataSourceImpl(
    private val userDao: UserDao
) : LocalUserDataSource {
    override suspend fun getUsers(): List<User> =
        userDao.getUsers().map {
            User(
                id = it.id,
                name = it.name
            )
        }

}