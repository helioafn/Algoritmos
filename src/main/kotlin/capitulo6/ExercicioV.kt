package capitulo6

/*
 Construir um programa que leia uma matriz A de uma dimensão do tipo vetor com 30 elementos
do tipo inteiro. Ao final do programa, apresentar a quantidade de valores pares e ímpares
existentes na referida matriz
*/
fun main() {
    val a = MutableList<Int>(30) { 0 }
    var impares = 0
    var pares = 0
    for (i in 0..<a.size) {
        print("Insira um número inteiro: ")
        a[i] = readln().toInt()

        val testePar = (a[i] % 2) == 0
        if (testePar) pares += 1
        else impares += 1
    }
    println("Número de elementos pares: $pares")
    println("Número de elementos ímpares: $impares")
}