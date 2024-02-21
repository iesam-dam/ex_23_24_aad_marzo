package com.iesam.ex_22_23_aad_marzo.feature.animals.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.iesam.ex_22_23_aad_marzo.feature.animals.domain.Animal

@Dao
interface AnimalDao {
    @Query("SELECT * FROM AnimalEntity")
    fun getAnimals(): List<Animal>

    @Query("SELECT * FROM AnimalEntity WHERE id in (id)")
    fun getAnimal(id: Int): Animal

    @Query("DELETE FROM AnimalEntity")
    fun deleteAnimals()

    @Insert
    fun setAnimals(animals: List<Animal>)
}