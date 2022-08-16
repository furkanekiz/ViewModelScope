package com.furkanekiz.viewmodelscope.model

import kotlinx.coroutines.delay

class UserRepository {

    suspend fun getUsers(): List<User> {
        delay(8000)
        return listOf(
            User(1, "Sam"),
            User(2, "Taro"),
            User(3, "Jane"),
            User(4, "Amy")
        )
    }
}