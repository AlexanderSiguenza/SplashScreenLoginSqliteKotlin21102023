package edu.udb.pacientesqlite

// Paciente.kt
import java.io.Serializable

data class Paciente(
    var id: Long = -1,
    var nombre: String,
    var direccion: String,
    var dui: String,
    var mascota: String
) : Serializable
