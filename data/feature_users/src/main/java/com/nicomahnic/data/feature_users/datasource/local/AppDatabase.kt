package com.nicomahnic.data.feature_users.datasource.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.nicomahnic.data.feature_users.datasource.local.dao.UserDao
import com.nicomahnic.data.feature_users.datasource.local.entity.UserEntity

@Database(entities = [UserEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao

}