package com.nicomahnic.data.feature_users.di

import com.google.gson.Gson
import com.nicomahnic.data.feature_users.datasource.remote.RemoteUserDataSourceImpl
import com.nicomahnic.data.feature_users.repository.RemoteUserDataSource
import org.koin.dsl.module

object UserFirebaseModule {

    val modules = module {
        single {
            Gson()
        }
        single<RemoteUserDataSource> {
            RemoteUserDataSourceImpl(
                gson = get()
            )
        }
//        singleOf(::RemoteUserDataSourceImpl) { bind<RemoteUserDataSource>()}
    }

}