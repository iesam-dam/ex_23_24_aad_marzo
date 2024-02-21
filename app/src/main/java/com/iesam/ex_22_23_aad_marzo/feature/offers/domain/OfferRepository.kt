package com.iesam.ex_22_23_aad_marzo.feature.offers.domain

interface OfferRepository {
    suspend fun getOffers(): List<Offer>
}