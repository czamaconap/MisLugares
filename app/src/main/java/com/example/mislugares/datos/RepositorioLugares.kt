package com.example.mislugares.datos

import com.example.mislugares.modelo.GeoPunto
import com.example.mislugares.modelo.Lugar
import com.example.mislugares.modelo.TipoLugar

interface RepositorioLugares {
    fun elemento(pos: Int): Lugar
    fun borrar(id: Int)
    fun agrega(lugar: Lugar)
    fun nuevo():Int
    fun dimensión():Int
    fun actualiza(id:Int, lugar: Lugar)

    fun agregaEjemplos(){
        agrega(Lugar("Escuela Politecnica", "", GeoPunto(0.0,0.0), TipoLugar.EDUCACION, "", "", "", "", valoracion = 3f))
        agrega(Lugar("Al de siempre", "", GeoPunto(0.0,0.0), TipoLugar.BAR, "", "", "", "", valoracion = 3f))
        agrega(Lugar("androidcurso.com", "", GeoPunto(0.0,0.0), TipoLugar.EDUCACION, "", "", "", "", valoracion = 3f))
        agrega(Lugar("Barranco del Infierno", "", GeoPunto(0.0,0.0), TipoLugar.NATURALEZA, "", "", "", "", valoracion = 3f))
        agrega(Lugar("La Vital", "", GeoPunto(0.0,0.0), TipoLugar.COMPRAS, "", "", "", "", valoracion = 3f))
    }
}