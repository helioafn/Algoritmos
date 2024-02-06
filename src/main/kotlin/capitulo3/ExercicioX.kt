package capitulo3

import kotlin.math.pow

// Elaborar um programa que calcule uma raiz de base qualquer com um índice qualquer.
fun main() {
    print("Insira o índice da radiciação: ")
    val indice = readln().toInt()
    print("Insira a base: ")
    val baseRaiz = readln().toInt()
    val raizEnesima = baseRaiz.toDouble().pow(1.0/indice)
    print("A raiz de índice $indice de $baseRaiz é $raizEnesima")
}