package com.iesam.ex_22_23_aad_marzo.feature.offers.data.remote

import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class FirebaseDataSource {
    val database = Firebase.database
    val ref = database.getReference("ofertas")

    fun get(){
        ref.child("ofertas").get()
    }
}