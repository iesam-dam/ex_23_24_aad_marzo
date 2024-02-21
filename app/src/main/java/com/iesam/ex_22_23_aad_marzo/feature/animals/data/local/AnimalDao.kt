package com.iesam.ex_22_23_aad_marzo.feature.animals.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query

@Dao
interface AnimalDao {
    @Query("SELECT * FROM AnimalEntity")
    fun getAll(): List<AnimalEntity>

    @Query("SELECT * FROM AnimalEntity WHERE id == id")
    fun getById(id: Int): AnimalEntity

    @Delete
    fun deleteAll()
}