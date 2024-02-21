package com.iesam.ex_22_23_aad_marzo.feature.animals.data.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.iesam.ex_22_23_aad_marzo.feature.animals.domain.AnimalType

const val ANIMAL_TABLE = "animals"

@Entity(tableName = ANIMAL_TABLE)
class AnimalEntity(
    @PrimaryKey @ColumnInfo(name = "id") val id: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "type") val type: AnimalType,

    )