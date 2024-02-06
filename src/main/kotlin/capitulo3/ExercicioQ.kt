package capitulo3

import kotlin.math.PI
import kotlin.math.pow

/*
* Elaborar um programa que calcule e apresente o valor do resultado da área de uma
*  circunferência (variável A). O programa deve solicitar a entrada do valor do raio da circunferência
* (variável R). Para a execução deste problema utilize a fórmula A <- 3.14159265 * R^2.
* */
fun main() {
    print("Insira o raio da circunferência: ")
    val raio = readln().toDouble()
    val area = PI * raio.pow(2)
    println("A área da circunferência é $area")
}