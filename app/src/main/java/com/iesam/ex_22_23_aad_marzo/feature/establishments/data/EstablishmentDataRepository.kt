package com.iesam.ex_22_23_aad_marzo.feature.establishments.data

import com.iesam.ex_22_23_aad_marzo.feature.establishments.domain.Establishment
import com.iesam.ex_22_23_aad_marzo.feature.establishments.domain.EstablishmentRepository
import kotlinx.coroutines.flow.Flow

class EstablishmentDataRepository() : EstablishmentRepository {

    override fun getEstablishment(): Flow<Establishment> {
        TODO("Not yet implemented")
    }

    override suspend fun saveEstablishment(establishment: Establishment) {
        TODO("Not yet implemented")
    }


}