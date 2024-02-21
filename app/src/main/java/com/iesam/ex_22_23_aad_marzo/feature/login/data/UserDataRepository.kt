package com.iesam.ex_22_23_aad_marzo.feature.login.data

import android.util.Log
import com.iesam.ex_22_23_aad_marzo.feature.login.data.local.xml.UserXmlLocalDataSource
import com.iesam.ex_22_23_aad_marzo.feature.login.domain.User

class UserDataRepository(private val localDataSource: UserXmlLocalDataSource) {

    fun checkUserLogin(user: User){
        val localUser = localDataSource.getUser()

        if (localUser.isEmpty()){
            localDataSource.saveUser(user)

        } else {
            Log.d("dev", "$localUser")
        }
    }
}