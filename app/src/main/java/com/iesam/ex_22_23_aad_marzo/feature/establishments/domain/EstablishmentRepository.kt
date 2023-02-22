package com.iesam.ex_22_23_aad_marzo.feature.establishments.domain

import kotlinx.coroutines.flow.Flow


interface EstablishmentRepository {

    fun getEstablishment(): Flow<Establishment>
    suspend fun saveEstablishment(establishment: Establishment)

}