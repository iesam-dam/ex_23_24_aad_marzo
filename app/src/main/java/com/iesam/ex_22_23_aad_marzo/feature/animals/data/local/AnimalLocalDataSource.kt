package com.iesam.ex_22_23_aad_marzo.feature.animals.data.local


import android.content.Context
import androidx.room.Room
import com.iesam.ex_22_23_aad_marzo.feature.animals.domain.Animal

class AnimalLocalDataSource(
    applicationContext: Context
) {

    private val converter: Converters = Converters()
    private val animalDao = Room.databaseBuilder(
        applicationContext,
        AnimalDataBase::class.java, "AnimalDataBase"
    ).addTypeConverter(converter).build().animalDao()

    fun getAnimals(): List<Animal> {
        return animalDao.getAllAnimals().map {
            it.toModel()
        }
    }


    fun getAnimalById(id: Int): Animal {
        return animalDao.loadById(id).toModel()
    }

    fun saveAnimals(animals: List<Animal>) {
        val animalsVarargs: Array<AnimalEntity> = animals.map { it.toEntity() }.toTypedArray()
        animalDao.insertAll(*animalsVarargs)
    }
}