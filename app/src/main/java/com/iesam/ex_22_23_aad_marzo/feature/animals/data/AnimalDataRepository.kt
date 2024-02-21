package com.iesam.ex_22_23_aad_marzo.feature.animals.data

import com.iesam.ex_22_23_aad_marzo.feature.animals.data.local.AnimalLocalDataSource
import com.iesam.ex_22_23_aad_marzo.feature.animals.data.remote.AnimalRemoteDataSource
import com.iesam.ex_22_23_aad_marzo.feature.animals.domain.Animal
import com.iesam.ex_22_23_aad_marzo.feature.animals.domain.AnimalRepository

class AnimalDataRepository(
    private val animalLocalDataSource: AnimalLocalDataSource,
    private val animalRemoteDataSource: AnimalRemoteDataSource
) : AnimalRepository {
    override fun getAnimals(): List<Animal> {
        val local = animalLocalDataSource.getAnimals()
        if (local.isNotEmpty()) {
            return local
        } else {
            val remote = animalRemoteDataSource.getAnimals()
            animalLocalDataSource.saveAnimals(remote)
            return remote
        }
    }

    override fun getAnimalById(id: Int): Animal {
        val local = animalLocalDataSource.getAnimalById(id)
        if (local != null) {
            return local
        } else {
            val remote = animalRemoteDataSource.getAnimals()
            animalLocalDataSource.saveAnimals(remote)
            return animalLocalDataSource.getAnimalById(id)
        }
    }
}