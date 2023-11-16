package com.nicomahnic.domain.di

import com.nicomahnic.domain.usecase.GetUsersUseCase
import com.nicomahnic.domain.usecase.GetUsersUseCaseImpl
import org.koin.dsl.module

object UserUseCasesModule {

    val modules = module {
        single<GetUsersUseCase> {
            GetUsersUseCaseImpl(userRepository = get())
        }
//        singleOf(::GetUsersUseCaseImpl) { bind<GetUsersUseCase>()}
    }

}