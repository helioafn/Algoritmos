package capitulo6

/*
 Construir um programa que leia duas matrizes A e B do tipo vetor com 15 elementos quaisquer inteiros.
Construir uma matriz C, sendo está o resultado da junção das matrizes A e B. Desta forma, a matriz C
deve ter o dobro de elementos em relação às matrizes A e B, ou seja, a matriz C deve possuir 30 elementos.
Apresentar a matriz C.
 */
fun main() {
    val a = MutableList<Int>(15) { 0 }
    val b = MutableList<Int>(15) { 0 }
    val c = MutableList<Int>(30) { 0 }

    for (i in 0..<a.size) {
        print("Insira um número na matriz A: ")
        a[i] = readln().toInt()
    }
    for (i in 0..<b.size) {
        print("Insira um número na matriz B: ")
        b[i] = readln().toInt()
    }
    for (i in 0..<a.size) {
        c[i] = a[i]
    }
    for (i in 0..<b.size) {
        c[(a.size - 1) + (i + 1)] = b[i]
    }

    println("Matriz C: ")
    for (item in c) print("$item ")
}