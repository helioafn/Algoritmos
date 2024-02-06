package capitulo6

/*
 Elaborar um programa que leia uma matriz A do tipo vetor com 15 elementos inteiros. Construir
uma matriz B do mesmo tipo, e cada elemento da matriz B deve ser o resulado da fatorial correspondente
de cada elemento da matriz A. Apresentar as matrizes A e B.
*/
fun main() {
    val a = MutableList<ULong>(15) { 0U }
    val b = MutableList<ULong>(15) { 0U }

    for (i in 0..<a.size) {
        print("Insira um número inteiro positivo: ")
        a[i] = readln().toULong()
    }
    for (i in 0..<b.size) {
        b[i] = 1U
        for (j in 0..<a[i].toInt()) {
            b[i] *= j.toULong()
        }
    }

    println("Matriz A: ")
    for (item in a) print("$item ")
    println("\nMatriz B: ")
    for (item in b) print("$item ")
}