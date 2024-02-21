package com.iesam.ex_22_23_aad_marzo.feature.animals.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.iesam.ex_22_23_aad_marzo.feature.animals.domain.Animal

@Database(entities = [Animal::class], version = 1, exportSchema = false)

@TypeConverters(Converters::class)
abstract class AnimalDataBase : RoomDatabase() {
    abstract fun animalDao(): AnimalDao
}