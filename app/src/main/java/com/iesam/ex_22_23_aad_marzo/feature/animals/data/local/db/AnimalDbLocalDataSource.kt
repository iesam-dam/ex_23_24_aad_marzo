package com.iesam.ex_22_23_aad_marzo.feature.animals.data.local.db

import android.content.Context
import androidx.room.Room
import com.iesam.ex_22_23_aad_marzo.app.AppDatabase
import com.iesam.ex_22_23_aad_marzo.feature.animals.domain.Animal
import java.lang.Exception

class AnimalDbLocalDataSource(private val context: Context) {

    private val db = Room.databaseBuilder(
        context,
        AppDatabase::class.java, "animals"
    ).build()

    private val dao = db.animalDao()

    fun saveAnimals(list: List<Animal>) =
        dao.saveAnimal(list.map {
            it.toEntity()
        })


    fun getAnimals(): List<Animal> =
        dao.getAnimals().map {
            it.toDomain()
        }

    fun getAnimalById(animalId: Int): Animal =
        dao.getAnimalById(animalId)

    fun deleteAnimals() =
        dao.deleteAnimals()

}