package com.iesam.ex_22_23_aad_marzo.feature.animals.domain

class GetAnimalUseCase(private val animalRepository: AnimalRepository) {
    fun invoke(): List<Animal> {
        return animalRepository.getAnimals()
    }
}