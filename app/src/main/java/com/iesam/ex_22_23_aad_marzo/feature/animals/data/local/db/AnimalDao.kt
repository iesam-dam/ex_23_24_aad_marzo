package com.iesam.ex_22_23_aad_marzo.feature.animals.data.local.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import com.iesam.ex_22_23_aad_marzo.feature.animals.domain.Animal

@Dao
interface AnimalDao {

    @Transaction
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveAnimal(animalList: List<AnimalEntity>)

    @Query("SELECT * FROM $TABLE_ANIMAL_NAME")
    fun getAnimals(): List<AnimalEntity>

    @Query("SELECT * FROM $TABLE_ANIMAL_NAME WHERE id == :animalId")
    fun getAnimalById(animalId: Int): Animal

    @Query("DELETE FROM $TABLE_ANIMAL_NAME")
    fun deleteAnimals()
}