package com.nicomahnic.presentation.di

import com.nicomahnic.presentation.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

object ViewModelModule {

    val modules = module {
        viewModel {
            HomeViewModel(
                getUsersUseCase = get(),
                insertUsersUseCase = get(),
                deleteUsersUseCase = get()
            )
        }
//        viewModelOf(::HomeViewModel)
    }
}