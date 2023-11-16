package com.nicomahnic.data.feature_users.repository

import com.nicomahnic.domain.model.User

interface LocalUserDataSource {
    suspend fun getUsers() : List<User>
}