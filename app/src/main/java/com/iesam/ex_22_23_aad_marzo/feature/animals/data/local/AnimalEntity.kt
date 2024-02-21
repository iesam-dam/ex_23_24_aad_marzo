package com.iesam.ex_22_23_aad_marzo.feature.animals.data.local

import androidx.resourceinspection.annotation.Attribute.IntMap
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class AnimalEntity(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "animal_type") val animalType: String,
)