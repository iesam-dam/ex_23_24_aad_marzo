package com.iesam.ex_22_23_aad_marzo.feature

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.iesam.ex_22_23_aad_marzo.R
import com.iesam.ex_22_23_aad_marzo.feature.animals.data.AnimalDataRepository
import com.iesam.ex_22_23_aad_marzo.feature.animals.data.local.db.AnimalDbLocalDataSource
import com.iesam.ex_22_23_aad_marzo.feature.animals.data.remote.AnimalRemoteDataSource
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button?>(R.id.action_delete_user).setOnClickListener {
            deleteLogin()
        }
        findViewById<Button?>(R.id.action_delete_animals).setOnClickListener {
            deleteAnimals()
        }
        initLogin()
        initAnimals()
        initAnimalDetail(1)
        initOffers()
    }

    private fun initLogin() {
        val email = "example@email.es"
        val password = "example_password"

        //Llamar al repositorio
        //LoginRepository loginRepository = ...
    }

    private fun deleteLogin() {
        //Eliminar datos del login.
    }

    private fun initAnimals() {
        thread {
            //Ejecutar código para obtener animales
        }
    }

    private fun initAnimalDetail(animalId: Int) {
        thread {
            val dataRepository = AnimalDataRepository(AnimalDbLocalDataSource(applicationContext),
                AnimalRemoteDataSource()
            )

            val animalById = dataRepository.getAnimalById(animalId)
            Log.d("dev", "animal: $animalById")
        }
    }

    private fun deleteAnimals() {
        thread {
            //Elimino los animales de local..
        }
    }

    private fun initOffers() {
        thread {
            //Hacer la llamada al repositorio desde aquí.
        }
    }
}