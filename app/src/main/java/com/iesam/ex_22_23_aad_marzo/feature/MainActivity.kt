package com.iesam.ex_22_23_aad_marzo.feature

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.iesam.ex_22_23_aad_marzo.R
import com.iesam.ex_22_23_aad_marzo.feature.establishments.data.EstablishmentDataRepository
import com.iesam.ex_22_23_aad_marzo.feature.establishments.domain.Establishment
import com.iesam.ex_22_23_aad_marzo.feature.establishments.domain.EstablishmentRepository
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.concurrent.thread
import kotlin.random.Random

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
        findViewById<Button?>(R.id.action_save_establishment).setOnClickListener {
            saveEstablishment()
        }
        initLogin()
        initAnimals()
        initAnimalDetail(1)
        initOffers()
        readEstablishment()
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
            //Ejecutar código para obtener un animal en concreto
        }
    }

    private fun deleteAnimals() {
        thread {
            //Elimino los animales de local..
        }
    }

    private fun initOffers() {
        GlobalScope.launch {
            //Hacer la llamada al repositorio desde aquí.
        }
    }

    private fun saveEstablishment() {
        val establishment = Establishment(Random.nextInt(0, 100), "Establecimiento")

        val repository: EstablishmentRepository = EstablishmentDataRepository( )

        //guardar establecimiento
        GlobalScope.launch {
            repository.saveEstablishment(establishment)
        }
    }

    private fun readEstablishment() {
        //Obtener establecimiento
        val repository: EstablishmentRepository = EstablishmentDataRepository( )

        GlobalScope.launch {
            repository.getEstablishment().collect { establishment ->
                if (establishment != null)
                    Log.d("@dev", establishment.toString())
            }
        }
    }
}