package com.nicomahnic.presentation.home.model

import com.nicomahnic.domain.model.User

data class HomeUi (
    val users: List<User> = listOf()
)