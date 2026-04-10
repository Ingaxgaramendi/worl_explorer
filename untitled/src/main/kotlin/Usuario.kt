package com.tecsup

abstract class Usuario(
    val id: String,
    val nombre: String
) : Prestable {

    val prestamos = mutableListOf<Libro>()

    abstract override fun calcularMulta(dias: Int): Double

    fun mostrarPrestamos() {
        println("Préstamos de $nombre:")
        if (prestamos.isEmpty()) {
            println("No tiene libros")
        } else {
            prestamos.forEach { println("- ${it.titulo}") }
        }
    }

    fun devolverLibro(lib: Libro) {
        if (prestamos.contains(lib)) {
            prestamos.remove(lib)
            lib.devolver()
            println("✅ Libro devuelto: ${lib.titulo}")
        }
    }

    override fun solicitarPrestamo(lib: Libro): Boolean {
        if (!lib.estaDisponible()) {
            println("❌ Libro no disponible")
            return false
        }

        if (prestamos.size >= maxLibrosPermitidos()) {
            println("❌ Límite de libros alcanzado")
            return false
        }

        prestamos.add(lib)
        lib.prestar()
        println("✅ Préstamo exitoso: ${lib.titulo}")
        return true
    }
}