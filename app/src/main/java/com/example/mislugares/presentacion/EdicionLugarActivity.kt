package com.example.mislugares.presentacion

import android.os.Bundle
import android.os.PersistableBundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mislugares.Aplicacion
import com.example.mislugares.R
import com.example.mislugares.casos_uso.CasosUsoLugar
import com.example.mislugares.databinding.ActivityMainBinding
import com.example.mislugares.modelo.Lugar
import java.text.DateFormat
import java.util.Date

class EdicionLugarActivity: AppCompatActivity() {

    val lugares by lazy { (application as Aplicacion).lugares }
    val usoLugar by lazy { CasosUsoLugar(this, lugares) }
    var pos = 0
    lateinit var lugar: Lugar

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.vista_lugar)
    }

    private fun actualizarVistas() {
        val nombre = findViewById<TextView>(R.id.nombre)
        val logo_tipo = findViewById<ImageView>(R.id.logo_tipo)
        val tipo = findViewById<TextView>(R.id.tipo)
        //val direccion = findViewById<TextView>(R.id.direccion)
        //val telefono = findViewById<TextView>(R.id.telefono)
        //val url = findViewById<TextView>(R.id.url)
        //val hora = findViewById<TextView>(R.id.telefono)
        //val fecha = findViewById<TextView>(R.id.url)
        val valoracion = findViewById<RatingBar>(R.id.valoracion)

        nombre.text = lugar.nombre
        //logo_tipo.setImageResource(lugar.tipoLugar.recurso)
        //tipo.text = lugar.tipoLugar.texto
        //fecha.text = DateFormat.getDateInstance().format(Date(lugar.fecha))
        //hora.text = DateFormat.getDateInstance().format(Date(lugar.hora))
        //comentario.text = lugar.comentarios
        //url.text = lugar.url
        //telefono.text = lugar.telefono
        //direccion.text = lugar.direccion

        //valoracion.rating = lugar.valoracion
        //valoracion.setOnRatingBarChangeListener { ratingBar, rating, fromUser -> lugar.valoracion = rating }
    }

}
