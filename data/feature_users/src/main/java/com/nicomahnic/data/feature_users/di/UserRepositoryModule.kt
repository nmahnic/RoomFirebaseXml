package com.nicomahnic.data.feature_users.di

import com.nicomahnic.data.feature_users.repository.UserRepositoryImpl
import com.nicomahnic.domain.repository.UserRepository
import org.koin.dsl.module

object UserRepositoryModule {

    val modules = module {
        single<UserRepository> {
            UserRepositoryImpl(
                localUserDataSource = get(),
                remoteUserDataSource = get()
            )
        }
//        singleOf(::UserRepositoryImpl) { bind<UserRepository>()}
    }

}