package capitulo5

/*
 * Elaborar um programa que mostre os resultados da tabuada de um número qualquer, a qual deve
 * ser apresentada de acordo com sua forma tradicional.
 * */
fun main() {
    print("Insira um número inteiro: ")
    val n = readln().toInt()
    for (x in 1..10) println("$n x $x = ${n * x}")
}