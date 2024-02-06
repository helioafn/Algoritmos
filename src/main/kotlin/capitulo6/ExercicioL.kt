package capitulo6

/*
 Elaborar um programa que leia uma matriz A do tipo vetor com dez elementos inteiros.
Construir uma matriz B de mesmo tipo, em que cada elemento deve ser a metade exata de cada um
dos elementos existentes da matriz A. Apresentar os elementos das matrizes A e B.
 */
fun main() {
    val a = MutableList<Int>(10) {0}
    val b = MutableList<Int>(10) {0}

    for (i in 0..<a.size) {
        print("Insira um número na matriz A: ")
        a[i] = readln().toInt()
    }
    for (i in 0..<b.size) {
        b[i] = a[i] / 2
    }

    println("Matriz A:")
    for (item in a) print("$item ")
    println()
    println("Matriz B:")
    for (item in b) print("$item ")
}