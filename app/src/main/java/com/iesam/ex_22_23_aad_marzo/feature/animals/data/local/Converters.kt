package com.iesam.ex_22_23_aad_marzo.feature.animals.data.local

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import com.google.gson.annotations.SerializedName
import com.iesam.ex_22_23_aad_marzo.feature.animals.domain.AnimalType

@ProvidedTypeConverter
class Converters {
    @TypeConverter
    fun fromAnimalType(animalType: AnimalType): String {
        return animalType.toString()
    }

    @TypeConverter
    fun toAnymalType(animal: String): AnimalType {
        SerializedName(animal) to AnimalType()
    }
}