package com.tecsup

class Estudiante(
    id: String,
    nombre: String,
    val carrera: String
) : Usuario(id, nombre) {

    override fun calcularMulta(dias: Int): Double {
        return dias * 0.50
    }

    override fun maxLibrosPermitidos(): Int {
        return 5
    }
}