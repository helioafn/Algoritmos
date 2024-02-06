package capitulo6

/*
    Elaborar um programa que leia duas matrizes A e B de uma dimensão do tipo vetor com dez
elementos inteiros cada. Construir uma matriz C de mesmo tipo e dimensão que seja formada
pelo quadrado da soma dos elementos correspondentes nas matrizes A e B. Apresentar os
elementos da matriz C.
 */
fun main() {
    val a = MutableList<Int>(10) { 0 }
    val b = MutableList<Int>(10) { 0 }
    val c = MutableList<Int>(10) { 0 }

    for (i in 0..<a.size) {
        print("Insira um número inteiro na matriz A [${i + 1} de ${a.size}]: ")
        a[i] = readln().toInt()
    }
    for (i in 0..<b.size) {
        print("Insira um número inteiro na matriz A [${i + 1} de ${a.size}]: ")
        b[i] = readln().toInt()
    }

    for (i in 0..<c.size) {
        c[i] = (a[i] + b[i]) * (a[i] + b[i])
    }

    println("Matriz C:")
    for (item in c) print("$item ")

}