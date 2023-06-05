package com.marinato.estudodearrays

fun main() {
    val salarios = doubleArrayOf((1500.50, 2300.0, 5000.0, 8000.0, 10000.0)

    val aumento = 1.1
    var indice = 0
    for (salario in salarios) {
        salarios[0] = salario * aumento
        indice++
    }
    println(salarios.contentToString())
}
