package capitulo6

/*
Elaborar um programa que leia duas matrizes A e B de uma dimensão com seis elementos. A
matriz A deve aceitar apenas a entrada de valores pares, enquanto a matriz B deve aceitar
apenas a entrada de valores ímpares. A entrada das matrizes deve ser validada pelo programa
e não pelo usuário. Construir uma matriz C que seja o resultado da junção das matrizes A e B,
de modo que a matriz C contenha 12 elementos. Apresentar os elementos da matriz C.
 */
fun main() {
    val a = MutableList<Double>(6) { 0.0 }
    val b = MutableList<Double>(6) { 0.0 }
    val c = MutableList<Double>(a.size + b.size) { 0.0 }
    var i = 0
    while (i < a.size) {
        print("Insira um número par na matriz A [${i + 1} de ${a.size}]: ")
        val userEntry = readln().toDouble()
        val isEven = userEntry % 2 == 0.0
        if (isEven) {
            a[i] = userEntry
        } else continue
        i++
    }
    i = 0
    while (i < b.size) {
        print("Insira um número ímpar na matriz B [${i + 1} de ${b.size}]: ")
        val userEntry = readln().toDouble()
        val isOdd = userEntry % 2 != 0.0
        if (isOdd) {
            b[i] = userEntry
        } else continue
        i++
    }
    i = 0
    for (item in a) {
        c[i] = item
        i += 1
    }
    println(i) // FIX HERE
    for (item in b) {
        c[i] = item
        i += 1
    }

    println("Matriz C:")
    for (item in c) print("$item ")

}