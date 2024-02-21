package com.iesam.ex_22_23_aad_marzo.feature.login.data.local

import android.content.Context
import android.content.Context.MODE_PRIVATE
import androidx.core.content.edit
import com.google.gson.Gson
import com.iesam.ex_22_23_aad_marzo.feature.login.domain.User

class LoginXmlLocalDataSource(
    private val context: Context
) {
    private val gson: Gson = Gson()
    private val sharedPref = context.getSharedPreferences("login", MODE_PRIVATE)

    fun getUser(): User {
        return gson.fromJson(sharedPref.toString(), User::class.java)
    }

    fun saveUser(user: User) {
        sharedPref.edit() {
            gson.toJson(user)
        }
    }

    fun deleteUser() {
        sharedPref.edit {
            this.clear()
        }
    }
}