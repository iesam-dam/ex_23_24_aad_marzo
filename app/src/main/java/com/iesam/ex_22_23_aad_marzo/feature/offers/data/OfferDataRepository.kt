package com.iesam.ex_22_23_aad_marzo.feature.offers.data

import com.iesam.ex_22_23_aad_marzo.feature.offers.data.remote.db.OfferFirebaseRemoteDataSource

class OfferDataRepository(private val remoteDataSource: OfferFirebaseRemoteDataSource) {

    suspend fun getOffers(){
        remoteDataSource.getOffers()
    }
}