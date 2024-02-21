package com.iesam.ex_22_23_aad_marzo.feature.offers.data.remote

import com.iesam.ex_22_23_aad_marzo.feature.offers.domain.Offer

fun OffersApiModel.toDomain() =Offer(
    id = id,
    title = title,
    description = description
)


