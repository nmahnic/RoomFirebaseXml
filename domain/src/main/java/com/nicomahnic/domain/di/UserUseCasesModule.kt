package com.nicomahnic.domain.di

import com.nicomahnic.domain.usecase.DeleteUsersUseCase
import com.nicomahnic.domain.usecase.DeleteUsersUseCaseImpl
import com.nicomahnic.domain.usecase.GetUsersUseCase
import com.nicomahnic.domain.usecase.GetUsersUseCaseImpl
import com.nicomahnic.domain.usecase.InsertUsersUseCase
import com.nicomahnic.domain.usecase.InsertUsersUseCaseImpl
import org.koin.dsl.module

object UserUseCasesModule {

    val modules = module {
        single<GetUsersUseCase> {
            GetUsersUseCaseImpl(userRepository = get())
        }
        single<InsertUsersUseCase> {
            InsertUsersUseCaseImpl(userRepository = get())
        }
        single<DeleteUsersUseCase> {
            DeleteUsersUseCaseImpl(userRepository = get())
        }
//        singleOf(::GetUsersUseCaseImpl) { bind<GetUsersUseCase>()}
//        singleOf(::InsertUsersUseCaseImpl) { bind<InsertUsersUseCase>()}
//        singleOf(::DeleteUsersUseCaseImpl) { bind<DeleteUsersUseCase>()}
    }

}