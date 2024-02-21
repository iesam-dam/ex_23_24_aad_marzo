package com.iesam.ex_22_23_aad_marzo.feature.login.domain

interface UserRepository {

    fun getUser(): User

    fun deleteUser()

    fun saveUser(user: User)
}