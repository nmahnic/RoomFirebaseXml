package com.nicomahnic.data.feature_users.datasource.remote

import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore
import com.google.gson.Gson
import com.nicomahnic.data.feature_users.repository.RemoteUserDataSource
import com.nicomahnic.domain.model.User

import kotlinx.coroutines.tasks.await

class RemoteUserDataSourceImpl(
    private val gson: Gson,
) : RemoteUserDataSource {

    private var firestore = Firebase.firestore

    override suspend fun getUsers(): List<User> {
        val usersSnapShot = firestore.collection(USERS).get().await()
        return usersSnapShot.documents.map {
            val json = it.data.toString()
            val user = gson.fromJson(json, User::class.java)
            println("NM: userFB $user")
            user
        }
    }

    override suspend fun insertUser(user: User) {
        val userJson = hashMapOf(NAME to user.name, ID to user.id)
        firestore.collection(USERS).add(userJson)
            .addOnSuccessListener { println("NM: success") }
            .addOnFailureListener { println("NM: failure ${it.message}") }
    }

    companion object {
        private const val NAME = "name"
        private const val ID = "id"
        private const val USERS = "users"
    }

}