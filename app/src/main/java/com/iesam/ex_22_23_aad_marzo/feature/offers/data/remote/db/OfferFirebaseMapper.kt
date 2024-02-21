package com.iesam.ex_22_23_aad_marzo.feature.offers.data.remote.db

import com.iesam.ex_22_23_aad_marzo.feature.offers.domain.Offer

fun OfferFirebaseModel.toDomain(): Offer =
    Offer(
        this.id.toInt(),
        this.title,
        this.description
    )