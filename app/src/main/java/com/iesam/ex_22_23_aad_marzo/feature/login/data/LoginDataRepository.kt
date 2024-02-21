package com.iesam.ex_22_23_aad_marzo.feature.login.data

import com.iesam.ex_22_23_aad_marzo.feature.login.domain.User

interface LoginDataRepository {
    fun get()
    fun save()
    fun delete()
}