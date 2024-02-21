package com.iesam.ex_22_23_aad_marzo.feature.offers.data

import com.iesam.ex_22_23_aad_marzo.feature.offers.data.remote.OfferRemoteDataSource
import com.iesam.ex_22_23_aad_marzo.feature.offers.domain.Offer
import com.iesam.ex_22_23_aad_marzo.feature.offers.domain.OfferRepository

class OfferDataRepository(
    private val offerRemoteDataSource: OfferRemoteDataSource
) : OfferRepository {
    override suspend fun getOffers(): List<Offer> {
        return offerRemoteDataSource.getOffers()
    }
}