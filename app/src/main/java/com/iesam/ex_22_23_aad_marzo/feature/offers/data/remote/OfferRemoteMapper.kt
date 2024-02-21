package com.iesam.ex_22_23_aad_marzo.feature.offers.data.remote

import com.iesam.ex_22_23_aad_marzo.feature.offers.domain.Offer

fun OfferDbRemoteModel.toOffer(): Offer {
    return Offer(
        this.id,
        this.title,
        this.description
    )
}