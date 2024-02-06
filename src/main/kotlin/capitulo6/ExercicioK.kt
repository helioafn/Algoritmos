package capitulo6

/*
 Elaborar um programa que leia uma matriz A do tipo vetor com dez elementos inteiros positivos.
Construir uma matriz B de mesmo tipo e dimensão, em que cada elemento da matriz B deve ser o valor
negativo do elemento correspondente da matriz A. Apresentar os valores da matriz B.
 */
fun main() {
    val a = MutableList<Int>(10) { 0}
    val b = MutableList<Int>(10) { 0}

    for (i in 0..<a.size) {
        print("Insira um número inteiro na matriz A: ")
        a[i] = readln().toInt()
    }
    for (i in 0..<b.size) {
        if (a[i] > 0) {
            b[i] = a[i] * -1
        } else b[i] = a[i]
    }

    println("Matriz B:")
    for (item in b) print("$item ")
}