package capitulo3

import kotlin.math.PI
import kotlin.math.pow

/*
* Calcular e apresentar o valor do volume de uma lata de óleo,
*  utilizando a fórmula: VOLUME <- 3.14159 * R^2 * ALTURA.
* */

fun main() {
    println("Insira a altura da lata de óleo:");
    val altura = readln().toDouble()
    println("Insira o raio da lata de óleo:")
    val raio = readln().toDouble()
    val volume = PI * raio.pow(2) * altura
    println("O volume da lata de óleo é $volume")
}