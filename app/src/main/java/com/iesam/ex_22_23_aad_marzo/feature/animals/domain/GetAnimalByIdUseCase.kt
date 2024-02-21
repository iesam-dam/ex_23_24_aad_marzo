package com.iesam.ex_22_23_aad_marzo.feature.animals.domain

class GetAnimalByIdUseCase(private val animalRepository: AnimalRepository) {

    fun invoke(id: Int): Animal {
        return animalRepository.getAnimalById(id)
    }
}