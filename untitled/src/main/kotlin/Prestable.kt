package com.tecsup

interface Prestable {
    fun solicitarPrestamo(lib: Libro): Boolean
    fun calcularMulta(dias: Int): Double
    fun maxLibrosPermitidos(): Int
}