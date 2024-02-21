package com.iesam.ex_22_23_aad_marzo.feature.animals.data.local

import com.iesam.ex_22_23_aad_marzo.feature.animals.domain.Animal

fun AnimalEntity.toModel(): Animal {
    return Animal(
        this.id,
        this.name,
        this.type
    )
}

fun Animal.toEntity(): AnimalEntity {
    return AnimalEntity(
        this.id,
        this.name,
        this.type
    )
}