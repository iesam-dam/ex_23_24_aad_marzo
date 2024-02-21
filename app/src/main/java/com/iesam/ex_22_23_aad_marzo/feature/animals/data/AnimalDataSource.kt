package com.iesam.ex_22_23_aad_marzo.feature.animals.data

import com.iesam.ex_22_23_aad_marzo.feature.animals.data.local.AnimalLocalDataSource
import com.iesam.ex_22_23_aad_marzo.feature.animals.data.remote.AnimalRemoteDataSource

class AnimalDataSource(
    private val animalLocalDataSource: AnimalLocalDataSource,
    private val animalRemoteDataSource: AnimalRemoteDataSource
){

}