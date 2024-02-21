package com.iesam.ex_22_23_aad_marzo.feature.offers.data.remote

import com.google.firebase.database.PropertyName


data class OfferDbRemoteModel(
    @GET: PropertyName("id") @SET:PropertyName("id") val id: Int,
    @GET: PropertyName("title") @SET:PropertyName("title") val title: String,
    @GET:PropertyName("description") @SET:PropertyName("description") val description: String,


    )