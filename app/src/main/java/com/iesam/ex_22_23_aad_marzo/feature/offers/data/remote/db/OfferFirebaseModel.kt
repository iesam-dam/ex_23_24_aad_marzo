package com.iesam.ex_22_23_aad_marzo.feature.offers.data.remote.db

import com.google.firebase.database.PropertyName

data class OfferFirebaseModel(
    @set:PropertyName("id") @get:PropertyName("id") var id: String = "",
    @set:PropertyName("title") @get:PropertyName("title")var title: String = "",
    @set:PropertyName("description") @get:PropertyName("description")var description: String = ""

)