package com.example.mislugares.datos

import com.example.mislugares.modelo.Lugar
import com.example.mislugares.modelo.TipoLugar

class LugaresLista : RepositorioLugares {

val listaLugares = mutableListOf<Lugar>()

    override fun elemento(pos: Int): Lugar {
        return listaLugares[pos]
    }

    override fun borrar(id: Int) {
        listaLugares.removeAt(id)
    }

    override fun agrega(lugar: Lugar) {
        listaLugares.add(lugar)
    }

    override fun nuevo(): Int {
        val lugar = Lugar("Nuevo Lugar")
        listaLugares.add(lugar)
        return listaLugares.size - 1
    }

    override fun dimensión(): Int {
        return listaLugares.size
    }

    override fun actualiza(id: Int, lugar: Lugar) {
        listaLugares[id]= lugar
    }


}