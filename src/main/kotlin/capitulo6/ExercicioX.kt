package capitulo6

/*
 Elaborar um programa que leia uma matriz A de uma dimensão com seis elementos do tipo real.
Construir uma matriz B, em que cada posição de índice ímpar da matriz B deve ser atribuída
com um elemento de índice par existente na matriz A e cada posição de índice par da matriz B
deve ser atribuída com um elemento de índice ímpar existente na matriz A. Apresentar os
elementos das duas matrizes.
 */
fun main() {
    val a = MutableList(6) { 0.0 }
    val b = MutableList(6) { 0.0 }

    for (i in 0..<a.size) {
        print("Insira um número na matriz A [${i + 1} de ${a.size}]: ")
        a[i] = readln().toDouble()
    }
    for (i in 0..<b.size) {
        val testePar = i % 2 == 0
        if (testePar)
            b[i] = a[i + 1]
        else
            b[i] = a[i - 1]
    }
    println("Matriz B:")
    for (item in b) print("$item ")
}