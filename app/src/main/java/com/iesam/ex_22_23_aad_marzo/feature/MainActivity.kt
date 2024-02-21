package com.iesam.ex_22_23_aad_marzo.feature

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.iesam.ex_22_23_aad_marzo.R
import com.iesam.ex_22_23_aad_marzo.feature.animals.data.local.LocalDataSource
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    private lateinit var localDataSource: LocalDataSource

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
            localDataSource.get()
        }
    }

    private fun initAnimalDetail(animalId: Int) {
        thread {
            //Ejecutar código para obtener un animal en concreto
            localDataSource.getById(animalId)
        }
    }

    private fun deleteAnimals() {
        thread {
            //Elimino los animales de local..
            localDataSource.delete()
        }
    }

    private fun initOffers() {
        thread {
            //Hacer la llamada al repositorio desde aquí.
        }
    }
}