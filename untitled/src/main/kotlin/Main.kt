package com.tecsup

fun main() {

    val libro1 = Libro("001", "Harry potter")
    val libro2 = Libro("002", "Los juegos del hambre")
    val libro3 = Libro("003", "1984")
    val libro4 = Libro("004", "El señor de los anillos")

    val estudiante = Estudiante("E01", "Anderson", "Zapatero")
    val externo = UsuarioExterno("U01", "Carlos", "12345678")

    // Préstamos
    estudiante.solicitarPrestamo(libro1)
    estudiante.solicitarPrestamo(libro2)

    externo.solicitarPrestamo(libro3)
    externo.solicitarPrestamo(libro4)
    externo.solicitarPrestamo(libro1) // debería fallar

    println()

    // Mostrar préstamos
    estudiante.mostrarPrestamos()
    externo.mostrarPrestamos()

    println()

    // Devolución con retraso
    estudiante.devolverLibro(libro1)
    val multaEst = estudiante.calcularMulta(4)
    println("Multa estudiante: $multaEst")

    externo.devolverLibro(libro3)
    val multaExt = externo.calcularMulta(4)
    println("Multa externo: $multaExt")

    println()

    // Polimorfismo
    val usuarios: List<Usuario> = listOf(estudiante, externo)

    usuarios.forEach {
        it.mostrarPrestamos()
    }
}