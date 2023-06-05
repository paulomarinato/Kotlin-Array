package com.marinato.estudodearrays

fun main() {

    val idades = intArrayOf(25, 19, 33, 20, 55)

    var maiorIdade = 0
    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }

    println(maiorIdade)
}
