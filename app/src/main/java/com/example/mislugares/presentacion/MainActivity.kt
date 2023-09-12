package com.example.mislugares.presentacion

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.mislugares.Aplicacion
import com.example.mislugares.R
import com.example.mislugares.casos_uso.CasosUsoActividades
import com.example.mislugares.casos_uso.CasosUsoLugar
import com.example.mislugares.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import java.lang.Integer.parseInt

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    val lugares by lazy { ((application) as Aplicacion ).lugares}
    val usoLugar by lazy {CasosUsoLugar(this, lugares)}
    val usoActividades by lazy {CasosUsoActividades(this)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val buttonAction1 = findViewById<Button>(R.id.button01)
        val buttonAction2 = findViewById<Button>(R.id.button02)
        val buttonAction3 = findViewById<Button>(R.id.button03)
        val buttonAction4 = findViewById<Button>(R.id.button04)

        setSupportActionBar(findViewById(R.id.toolbar))
        binding.toolbarLayout.title = title

        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        buttonAction1.setOnClickListener { view ->
            Snackbar.make(view, "Implementar accion para \"Mostrar Lugares\"", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        buttonAction2.setOnClickListener { view ->
            Snackbar.make(view, "Implementar accion para \"Preferencias\"", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        buttonAction3.setOnClickListener { view ->
            usoActividades.lanzarAcerdaDe(view)
        }

        buttonAction4.setOnClickListener { view ->
                finish()
            }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.action_settings-> true
            R.id.acercaDe-> {
                usoActividades.lanzarAcerdaDe()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    fun lanzarVistaLugar(view: View?= null){
        val entrada = EditText(this)
        entrada.setText("0")
        AlertDialog.Builder(this)
            .setTitle(R.string.accion_acerca_de)
            .setMessage(R.string.acerca_de_text)
            .setPositiveButton("Aceptar") { dialog, which ->
                val id = parseInt(entrada.text.toString())
                usoLugar.mostrar(id)
            }
            .setNegativeButton("cancelar", null)
            .show()
    }
}