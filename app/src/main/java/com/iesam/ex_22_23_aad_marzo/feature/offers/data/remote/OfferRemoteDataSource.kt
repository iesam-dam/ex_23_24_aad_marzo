package com.iesam.ex_22_23_aad_marzo.feature.offers.data.remote

import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.iesam.ex_22_23_aad_marzo.feature.offers.domain.Offer
import kotlinx.coroutines.tasks.await

class OfferRemoteDataSource(
    private val firebase: Firebase
) {
    suspend fun getOffers(): List<Offer> {
        return firebase.database.getReference("Offer")
            .get().await().children.map {
                it.getValue(OfferDbRemoteModel::class.java)!!.toOffer()
            }
    }
}