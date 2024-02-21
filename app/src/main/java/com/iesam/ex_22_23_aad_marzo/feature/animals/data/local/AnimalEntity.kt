package com.iesam.ex_22_23_aad_marzo.feature.animals.data.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.iesam.ex_22_23_aad_marzo.feature.animals.domain.AnimalType

@Entity
data class AnimalEntity(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "animalType") val animalType: AnimalType
)