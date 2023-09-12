package com.example.mislugares.casos_uso

import android.app.Activity
import android.content.Intent
import android.net.Uri
import com.example.mislugares.datos.RepositorioLugares
import com.example.mislugares.modelo.GeoPunto
import com.example.mislugares.modelo.Lugar
import com.example.mislugares.presentacion.VistaLugarActivity

class CasosUsoLugar(val actividad: Activity, val lugares: RepositorioLugares) {

    fun mostrar(pos: Int) {
        val i = Intent(actividad, VistaLugarActivity::class.java)
        i.putExtra("pos", pos)
        actividad.startActivity(i)
    }

    fun borrar(id: Int): Boolean {
        lugares.borrar(id)
        actividad.finish()
        return true
    }

    fun verMapa(lugar: Lugar) {
        val latitud = lugar.posicion.latitud
        val longitud = lugar.posicion.longitud
        val uri = if (lugar.posicion != GeoPunto.SIN_POSICION)
            Uri.parse("geo:$latitud,$longitud")
        else Uri.parse("geo:0.0?q="+lugar.direccion)
        actividad.startActivity(Intent(Intent.ACTION_VIEW,uri))
    }

    fun llamarTelefono(lugar: Lugar) =
        actividad.startActivity(Intent(Intent.ACTION_DIAL, Uri.parse("tel: " + lugar.telefono)))

    fun verPgWeb(lugar: Lugar) =
        actividad.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(lugar.url)))

    fun compartir(lugar: Lugar) = actividad.startActivity(Intent(Intent.ACTION_SEND).apply {
        type = "text/plain"
        putExtra(Intent.EXTRA_TEXT, "${lugar.nombre} - ${lugar.url}")
    })

    fun editar(lugar: Lugar) {

    }

}