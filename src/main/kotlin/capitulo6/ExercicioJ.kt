package capitulo6

/*
 Elaborar um programa que leia uma matriz A do tipo vetor com 20 elementos inteiros.
Construir uma matriz B do mesmo tipo e dimensão da matriz A, sendo cada elemento da matriz B
o somatório de 1 até o valor do elemento correspondente armazenado na matriz A. Apresentar os elementos da matriz B.
 */
fun main() {
    val a = MutableList<Int>(5) { 0 }
    val b = MutableList<Int>(5) { 0 }
    for (i in 0..<a.size) {
        print("Insira um número na matriz A: ")
        a[i] = readln().toInt()
    }
    for (i in 0..<b.size) {
        var soma = 1
        for (j in 1..a[i]) {
            soma *= j
        }
        b[i] = soma
    }

    println("Matriz B:")
    for (item in b) print("$item ")
}