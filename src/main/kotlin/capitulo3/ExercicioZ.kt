package capitulo3

import kotlin.math.pow

/*
    Ler dois valores numéricos inteiros (variaveis A,B) e
    apresentar o resultado do quadrado da divisão de a por b.
*/

fun main() {
    print("Insira um valor inteiro para A: ")
    val a = readln().toInt()
    print("Insira um valor inteiro para B: ")
    val b = readln().toInt()
    val resultado = (a / b).toDouble().pow(2)
    println("($a / $b)² = $resultado")
}