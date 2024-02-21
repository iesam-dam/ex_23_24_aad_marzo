package com.iesam.ex_22_23_aad_marzo.feature.offers.data.remote.db

import com.google.firebase.Firebase
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.database
import com.iesam.ex_22_23_aad_marzo.feature.offers.domain.Offer
import kotlinx.coroutines.tasks.await

class OfferFirebaseRemoteDataSource {

    private lateinit var database: DatabaseReference

    suspend fun getOffers(): List<Offer>{
        database = Firebase.database.reference

    }

}