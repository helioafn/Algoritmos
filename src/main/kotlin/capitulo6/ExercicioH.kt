package capitulo6

/*
 Elaborar um programa que leia 20 elementos do tipo real em uma matriz A unidimensional e construir
uma matriz B de mesma dimensão com os mesmos elementos armazenados na matriz A, porém de forma invertida.
Ou seja, o primeiro elemento da matriz A passa a ser o último da matriz B, o segundo elemento da
matriz A passa a ser o penúltimo da matriz B e assim por diante. Apresentar os elementos das matrizes
A e B.
 */
fun main() {
    val a = MutableList<Double>(20) { 0.0}
    val b = MutableList<Double>(20) { 0.0}
    var j = a.size - 1

    for (i in 0..<a.size) {
        print("Insira um número na matriz A: ")
        a[i] = readln().toDouble()
    }
    for (i in 0..<b.size) {
        b[i] = a[j]
        j -= 1
    }

    println("Matriz A:")
    for (item in a) print("$item ")
    println("\nMatriz B:")
    for (item in b) print("$item ")
}