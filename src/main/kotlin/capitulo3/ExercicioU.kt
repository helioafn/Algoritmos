package capitulo3

import kotlin.math.PI
import kotlin.math.pow

/*
Elaborar um programa de computador que calcule e apresente o valor do volume de uma esfera.
Utilize a fórmula VOLUME ← (4 / 3) * 3,14159 * (RAIO ^ 3).
* */
fun main() {
    print("Insira o raio da esfera: ")
    val raioEsfera = readln().toDouble()
    val volumeEsfera = (4/3) * PI * raioEsfera.pow(3)
    println("O volume da esfera é $volumeEsfera")
}