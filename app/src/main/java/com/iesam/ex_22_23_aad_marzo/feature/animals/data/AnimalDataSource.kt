package com.iesam.ex_22_23_aad_marzo.feature.animals.data

import com.iesam.ex_22_23_aad_marzo.feature.animals.data.local.AnimalLocalDataSource
import com.iesam.ex_22_23_aad_marzo.feature.animals.data.remote.AnimalRemoteDataSource
import com.iesam.ex_22_23_aad_marzo.feature.animals.domain.Animal

class AnimalDataSource(
    private val animalLocalDataSource: AnimalLocalDataSource,
    private val animalRemoteDataSource: AnimalRemoteDataSource
){
    fun getAnimals(): List<Animal>{
            var animals = animalLocalDataSource.getAnimals()
        if (animals.isEmpty()){
            animals =animalRemoteDataSource.getAnimals()
            animalLocalDataSource.setAnimals(animals)
        }
        return animals
    }

}