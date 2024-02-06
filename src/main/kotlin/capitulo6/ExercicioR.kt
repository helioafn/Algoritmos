package capitulo6

/*
 Elaborar um programa que leia seis elementos (valores inteiros) para as matrizes A e B de uma dimensão
do tipo vetor. Construir as matrizes C e D de mesmo tipo e dimensão. A matriz C deve ser formada pelos
elementos de índice ímpar das matrizes A e B e a matriz D deve ser formada pelos elementos de índice
par das matrizes A e B. Apresentar os elementos das matrizes C e D.
 */
fun main() {
    val a = MutableList<Int>(6) { 0 }
    val b = MutableList<Int>(6) { 0 }
    val c = MutableList<Int>(6) { 0 }
    val d = MutableList<Int>(6) { 0 }

    for (i in 0..<a.size) {
        print("Insira um número inteiro na matriz A: ")
        a[i] = readln().toInt()
    }
    for (i in 0..<b.size) {
        print("Insira um número inteiro na matriz B: ")
        b[i] = readln().toInt()
    }
    for (i in 0..<c.size) {
        val par = i % 2 == 0
        if (par) {
            d[i] = a[i]
            d[i+1] = b[i]
        } else {
            c[i - 1] = a[i]
            c[i] = b[i]
        }
    }

    println("Matriz C:")
    for (item in c) print("$item ")
    println()
    println("Matriz D:")
    for (item in d) print("$item ")
}