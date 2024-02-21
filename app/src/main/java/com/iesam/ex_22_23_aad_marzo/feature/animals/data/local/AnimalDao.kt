package com.iesam.ex_22_23_aad_marzo.feature.animals.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface AnimalDao {

    @Query("SELECT * FROM $ANIMAL_TABLE")
    fun getAllAnimals(): List<AnimalEntity>

    @Query("SELECT * FROM $ANIMAL_TABLE WHERE id IN (:animalId)")
    fun loadById(animalId: Int): AnimalEntity

    @Insert
    fun insertAll(vararg animals: AnimalEntity)

}