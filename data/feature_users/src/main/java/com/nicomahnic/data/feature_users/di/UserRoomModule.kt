package com.nicomahnic.data.feature_users.di

import com.nicomahnic.data.feature_users.datasource.local.AppDatabase
import com.nicomahnic.data.feature_users.datasource.local.LocalUserDataSourceImpl
import com.nicomahnic.data.feature_users.repository.LocalUserDataSource
import com.nicomahnic.data.feature_users.repository.UserRepositoryImpl
import com.nicomahnic.domain.repository.UserRepository
import org.koin.dsl.module

object UserRoomModule {

    val modules = module {
        single {
            get<AppDatabase>().userDao()
        }
        single<LocalUserDataSource> {
            LocalUserDataSourceImpl(userDao = get())
        }
        single<UserRepository> {
            UserRepositoryImpl(localUserDataSource = get())
        }
//        singleOf(::UserRepositoryImpl) { bind<UserRepository>()}
//        singleOf(::LocalUserDataSourceImpl) { bind<LocalUserDataSource>()}
    }

}