package com.iesam.ex_22_23_aad_marzo.feature.login.data.local.xml

import android.content.Context
import com.google.gson.Gson
import com.iesam.ex_22_23_aad_marzo.feature.login.domain.User

class UserXmlLocalDataSource(private val context: Context) {

    private val sharedPref = context.getSharedPreferences("User", Context.MODE_PRIVATE)
    private val gson = Gson()

    fun saveUser(user: User) {
        with(sharedPref.edit()) {
            putString(user.email, gson.toJson(user, user::class.java))
            apply()
        }
    }

    fun getUser(): List<User> {
        return sharedPref.all.map {
            gson.fromJson(it as String, User::class.java)
        }
    }

    fun deleteUser() {
        with(sharedPref.edit()) {
            clear()
            apply()
        }

    }
}