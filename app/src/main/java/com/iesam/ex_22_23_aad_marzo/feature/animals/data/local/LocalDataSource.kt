package com.iesam.ex_22_23_aad_marzo.feature.animals.data.local

import android.content.Context
import androidx.room.Room

class LocalDataSource {
    private val context = Context.MODE_PRIVATE
    val database = Room.databaseBuilder(
        context,
        Database::class.java, "animales"
    ).build()

    fun get(){
        database.animalDao().getAll()
    }

    fun getById(id: Int){
        database.animalDao().getById(id)
    }

    fun delete(){
        database.animalDao().deleteAll()
    }
}