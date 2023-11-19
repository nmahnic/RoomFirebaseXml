package com.nicomahnic.data.feature_users.di

import com.nicomahnic.data.feature_users.datasource.local.AppDatabase
import com.nicomahnic.data.feature_users.datasource.local.LocalUserDataSourceImpl
import com.nicomahnic.data.feature_users.repository.LocalUserDataSource
import org.koin.dsl.module

object UserRoomModule {

    val modules = module {
        single {
            get<AppDatabase>().userDao()
        }
        single<LocalUserDataSource> {
            LocalUserDataSourceImpl(userDao = get())
        }
//        singleOf(::LocalUserDataSourceImpl) { bind<LocalUserDataSource>()}
    }

}