package com.iesam.ex_22_23_aad_marzo.feature.animals.data.local.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

const val TABLE_ANIMAL_NAME = "animal"
const val TABLE_ANIMAL_TYPE_NAME = "animal_type"

@Entity(tableName = TABLE_ANIMAL_NAME)
data class AnimalEntity(
    @PrimaryKey @ColumnInfo(name = "id") val id: Int,
    @ColumnInfo(name = "name")val name: String,
    @ColumnInfo(name = "type") val type: AnimalTypeEntity
)

@Entity(tableName = TABLE_ANIMAL_TYPE_NAME)
data class AnimalTypeEntity(
    @ColumnInfo(name = "type") val type: String
)
