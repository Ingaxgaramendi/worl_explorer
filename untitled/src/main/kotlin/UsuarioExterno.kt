package com.tecsup

class UsuarioExterno(
    id: String,
    nombre: String,
    val dni: String
) : Usuario(id, nombre) {

    override fun calcularMulta(dias: Int): Double {
        return dias * 1.50
    }

    override fun maxLibrosPermitidos(): Int {
        return 2
    }
}