package capitulo6

/*
Elaborar um programa que leia duas matrizes do tipo vetor para o armazenamento de nomes de pessoas,
sendo a matriz A com 20 elementos e a matriz B com 30 elementos. Construir uma matriz C, sendo esta
a junção das matrizes A e B. desta forma, a matriz C deve ter a capacidade de armazenar 50 elementos.
Apresentar os elementos da matriz C.
*/
fun main() {
    val a = MutableList<String>(20) { "" }
    val b = MutableList<String>(30) { "" }
    val c = MutableList<String>(50) { "" }

    for (i in 0..<a.size) {
        print("Insira o nome: ")
        a[i] = readln()
    }
    for (i in 0..<a.size) {
        print("Insira o nome: ")
        b[i] = readln()
    }
    for (i in 0..<a.size) {
        c[i] = a[i]
    }
    for (i in 0..<b.size) {
        c[(a.size - 1) + (i + 1)] = b[i]
    }

    println("Matriz C:")
    for (item in c) print("$item ")
}