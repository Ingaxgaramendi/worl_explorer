package com.tecsup

class Libro(
    val isbn: String,
    val titulo: String,
    var disponible: Boolean = true
) {
    fun estaDisponible(): Boolean = disponible

    fun prestar() {
        disponible = false
    }

    fun devolver() {
        disponible = true
    }

    override fun toString(): String {
        return "$titulo (ISBN: $isbn)"
    }
}