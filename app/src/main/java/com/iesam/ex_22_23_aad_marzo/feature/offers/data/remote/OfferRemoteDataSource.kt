package com.iesam.ex_22_23_aad_marzo.feature.offers.data.remote

import com.google.firebase.Firebase
import com.google.firebase.database.database
import com.iesam.ex_22_23_aad_marzo.feature.offers.domain.Offer

class OfferRemoteDataSource(
    private val firebase: Firebase
) {
    private
    fun getOffers(): List<Offer> {
        firebase.database("").getReference()
    }
}