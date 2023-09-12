package com.example.mislugares.casos_uso

import android.app.Activity
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.example.mislugares.R

class CasosUsoActividades (val actividad: Activity){

   fun lanzarAcerdaDe(view: View? = null){
           val builder = AlertDialog.Builder(actividad)
           builder
               .setTitle(R.string.accion_acerca_de)
               .setMessage(R.string.acerca_de_text)
               .setPositiveButton("Aceptar") { dialog, which ->
                   // Handle OK button click
                   // Perform actions with the inputText
                   dialog.dismiss()
               }

           // Create and show the AlertDialog
           val customAlertDialog = builder.create()
           customAlertDialog.show()
   }

    fun lanzarPreferencias(){}
    fun lanzarMapa(){}
}