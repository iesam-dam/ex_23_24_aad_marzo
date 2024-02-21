package com.iesam.ex_22_23_aad_marzo.feature.animals.data

import com.iesam.ex_22_23_aad_marzo.feature.animals.data.local.db.AnimalDbLocalDataSource
import com.iesam.ex_22_23_aad_marzo.feature.animals.data.remote.AnimalRemoteDataSource
import com.iesam.ex_22_23_aad_marzo.feature.animals.domain.Animal

class AnimalDataRepository(
    private val localDataSource: AnimalDbLocalDataSource,
    private val remoteDataSource: AnimalRemoteDataSource
) {

    fun getAnimals(): List<Animal>{
        val localAnimals = localDataSource.getAnimals()

         return if (localAnimals.isEmpty()){
            val remoteAnimals = remoteDataSource.getAnimals()

             localDataSource.saveAnimals(remoteAnimals)

             remoteAnimals

        } else {
            localAnimals
         }
    }

    fun getAnimalById(animalId: Int): Animal =
        localDataSource.getAnimalById(animalId)

}