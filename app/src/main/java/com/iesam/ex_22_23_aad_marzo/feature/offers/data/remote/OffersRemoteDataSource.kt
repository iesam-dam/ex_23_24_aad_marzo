package com.iesam.ex_22_23_aad_marzo.feature.offers.data.remote

import com.iesam.ex_22_23_aad_marzo.feature.animals.domain.Animal

class OffersRemoteDataSource {

    suspend fun getOffers(): List<Animal> {
        return emptyList()
    }
}