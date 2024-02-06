package capitulo3

import kotlin.math.pow

/*
    Elaborar um programa que leia dois valores numéricos inteiros,
    os quais devem representar a base e o expoente de uma potência,
    calcule a potência e apresente o resultado obtido.
*/
fun main() {
    print("Insira a base da exponenciação: ")
    val basePotencia = readln().toInt()
    print("Insira o expoente da base: ")
    val expoente = readln().toInt()
    val potencia = basePotencia.toDouble().pow(expoente).toInt()
    println("$basePotencia^$expoente = $potencia")
}