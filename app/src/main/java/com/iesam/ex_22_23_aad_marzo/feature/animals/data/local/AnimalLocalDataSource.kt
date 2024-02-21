package com.iesam.ex_22_23_aad_marzo.feature.animals.data.local

import com.iesam.ex_22_23_aad_marzo.feature.animals.domain.Animal

class AnimalLocalDataSource(): AnimalDao {
    override fun getAnimals(): List<Animal> {
        return getAnimals()
    }

    override fun getAnimal(id: Int): Animal {
        return getAnimals().get(id)
    }

    override fun deleteAnimals() {
        deleteAnimals()
    }

    override fun setAnimals(animals: List<Animal>) {
        setAnimals(animals)
    }
}