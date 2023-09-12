package com.example.mislugares.modelo;

data class Lugar(
    val nombre: String="",
    var direccion: String="",
    var posicion: GeoPunto = GeoPunto.SIN_POSICION,
    var tipoLugar: TipoLugar = TipoLugar.OTROS,
    var foto: String="",
    var telefono: String="",
    var url: String="",
    var comentarios: String="",
    var fecha: Long= System.currentTimeMillis(),
    var valoracion: Float=0f
){

    override fun toString(): String {
        return "Lugar(nombre='$nombre', " +
                "direccion='$direccion', " +
                "posicion=$posicion, " +
                "foto='$foto', " +
                "telefono='$telefono', " +
                "url='$url', " +
                "comentarios='$comentarios', " +
                "fecha=$fecha, " +
                "valoracion=$valoracion)"
    }
}
