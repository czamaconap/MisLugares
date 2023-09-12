package com.example.mislugares.modelo

import com.example.mislugares.R

sealed class TipoLugar(val texto: String, val recurso: Int) {
    object OTROS : TipoLugar("Otros", R.drawable.otros)
    object RESTAURANTE : TipoLugar("Restaurante", R.drawable.restaurante)
    object BAR : TipoLugar("Bar", R.drawable.bar)
    object HOTEL : TipoLugar("Hotel", R.drawable.hotel)
    object EDUCACION : TipoLugar("Educacion", R.drawable.educacion)
    object GASOLINERA : TipoLugar("Gasolinera", R.drawable.gasolinera)
    object ESPECTACULOS : TipoLugar("Espectaculo", R.drawable.espectaculos)
    object DEPORTE : TipoLugar("Deporte", R.drawable.deporte)
    object COMPRAS : TipoLugar("Compras", R.drawable.compras)
    object COPAS : TipoLugar("Copas", R.drawable.copas)
    object NATURALEZA : TipoLugar("Naturaleza", R.drawable.naturaleza)
}



