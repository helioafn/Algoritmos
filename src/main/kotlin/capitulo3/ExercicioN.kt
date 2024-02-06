package capitulo3
/*
* Construir um programa que leia três valores numéricos inteiros (representados pelas variáveis A,
B e C) e apresente como resultado o valor do quadrado da soma dos três valores lidos.
* */

fun main() {
    print("Insira um número inteiro A: ")
    val a = readln().toInt()
    print("Insira um número inteiro B: ")
    val b = readln().toInt()
    print("Insira um número inteiro C: ")
    val c = readln().toInt()
    val resultado = (a + b + c) * (a + b + c)
    println("($a + $b + $c)² = $resultado")
}
