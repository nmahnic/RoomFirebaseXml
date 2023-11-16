package com.nicomahnic.domain.repository

import com.nicomahnic.domain.model.User

interface UserRepository {

    suspend fun getUsers() : List<User>

}