package com.iesam.ex_22_23_aad_marzo.feature.login.data

import com.iesam.ex_22_23_aad_marzo.feature.login.data.local.LoginXmlLocalDataSource
import com.iesam.ex_22_23_aad_marzo.feature.login.domain.User
import com.iesam.ex_22_23_aad_marzo.feature.login.domain.UserRepository

class UserDataRepository(
    private val local: LoginXmlLocalDataSource
) : UserRepository {

    override fun checkLogged(user: User) {
        val userLog = local
        if (userLog == null) {
            local.saveUser(user)
        } else {
            println(user.toString())
        }
    }

    override fun saveUser(user: User) {
        local.saveUser(user)
    }

    override fun getUser(): User {
        return local.getUser()
    }

    override fun deleteUser() {
        return local.deleteUser()
    }
}