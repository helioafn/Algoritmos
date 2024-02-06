package capitulo6

/*
 Escrever um programa que leia três matrizes (a,b,c) de uma dimensão com cinco elementos cada,
que sejam do tipo real. Construir uma matriz D, sendo esta o resultado da junção das três matrizes.
Desta forma a matriz D, deve ter o triplo de elementos das matrizes a,b,c. Apresentar os elementos da
matriz D.
 */
fun main() {
    val a = MutableList<Double>(5) { 0.0 }
    val b = MutableList<Double>(5) { 0.0 }
    val c = MutableList<Double>(5) { 0.0 }
    val d = MutableList<Double>((a.size + b.size + c.size)) { 0.0 }
    var j = 0

    for (i in 0..<a.size) {
        print("Insira um número na matriz A: ")
        a[i] = readln().toDouble()
        d[j] = a[i]
        j += 1
    }
    for (i in 0..<b.size) {
        print("Insira um número na matriz B: ")
        b[i] = readln().toDouble()
        d[j] = b[i]
        j += 1
    }
    for (i in 0..<c.size) {
        print("Insira um número na matriz C: ")
        c[i] = readln().toDouble()
        d[j] = c[i]
        j += 1
    }

    println("Matriz D:")
    for (item in d) print("$item ")
}