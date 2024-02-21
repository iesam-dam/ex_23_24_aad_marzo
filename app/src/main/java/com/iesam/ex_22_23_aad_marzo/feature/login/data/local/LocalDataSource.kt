package com.iesam.ex_22_23_aad_marzo.feature.login.data.local

import android.content.SharedPreferences
import com.iesam.ex_22_23_aad_marzo.feature.login.domain.User

abstract class LocalDataSource(private val user: User) {
    abstract val sharedPref: SharedPreferences

    fun get(){
        sharedPref.all
    }

    fun save(){
        with (sharedPref.edit()){
            putString("1", user.email)
            putString("2", user.password)
        }
    }

    fun delete(){
        with(sharedPref.edit()){
            clear()
        }
    }
}