package com.example.mislugares

import android.app.Application
import com.example.mislugares.datos.LugaresLista
import com.example.mislugares.datos.RepositorioLugares

class Aplicacion : Application() {

    val lugares: RepositorioLugares = LugaresLista()

}