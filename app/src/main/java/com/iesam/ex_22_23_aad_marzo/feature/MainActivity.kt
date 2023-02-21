package com.iesam.ex_22_23_aad_marzo.feature

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.iesam.ex_22_23_aad_marzo.R
import com.iesam.ex_22_23_aad_marzo.feature.establishments.domain.Establishment
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

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
        findViewById<Button?>(R.id.action_read_establishment).setOnClickListener {
            readEstablishment()
        }
        initLogin()
        initAnimals()
        initAnimalDetail(1)
        initOffers()
        initEstablishment()
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
        //Ejecutar código para obtener animales
    }

    private fun initAnimalDetail(animalId: Int) {
        //Ejecutar código para obtener un animal en concreto
    }

    private fun deleteAnimals() {
        //Elimino los animales de local..
    }

    private fun initOffers() {
        GlobalScope.launch {
            //Hacer la llamada al repositorio desde aquí.
        }
    }

    private fun initEstablishment() {
        val establishment = Establishment(1, "Establecimiento 1")
        //guardar establecimiento
    }

    private fun readEstablishment() {
        //Obtener establecimiento

    }
}