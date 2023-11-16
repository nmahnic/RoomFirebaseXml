package com.nicomahnic.data.feature_users.datasource.local.dao

import androidx.room.Dao
import androidx.room.Query
import com.nicomahnic.data.feature_users.datasource.local.entity.UserEntity

@Dao
interface UserDao {
    @Query("SELECT * FROM users ORDER BY id DESC")
    suspend fun getUsers(): List<UserEntity>
}