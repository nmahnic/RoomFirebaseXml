package com.nicomahnic.data.feature_users.di

import androidx.room.Room
import com.nicomahnic.data.feature_users.datasource.local.AppDatabase
import org.koin.dsl.module

object RoomModule {

    val modules = module {
        single {
            Room.databaseBuilder(
                context = get(),
                AppDatabase::class.java, "users-database"
            ).build()
        }
    }
}