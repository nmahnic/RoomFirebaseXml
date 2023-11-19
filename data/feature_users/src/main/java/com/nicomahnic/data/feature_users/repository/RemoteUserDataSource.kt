package com.nicomahnic.data.feature_users.repository

import com.nicomahnic.domain.model.User

interface RemoteUserDataSource {
    suspend fun getUsers() : List<User>

    suspend fun insertUser(user: User)
}