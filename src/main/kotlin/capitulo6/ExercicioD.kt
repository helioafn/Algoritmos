package capitulo6

/*
 Elaborar um programa que leia 15 elementos inteiros de uma matriz A do tipo vetor. Construir
uma matriz B de mesmo tipo, observando a  seguinte lei de formação: "Todo elemento da matriz B deve
ser o quadrado da matriz A correspondente". Apresentar os elementos das matrizes A e B.
*/
fun main() {
    val a = MutableList<Double>(15) { 0.0 }
    val b = MutableList<Double>(15) { 0.0 }

    for (i in 0..<a.size) {
        print("Insira um número: ")
        a[i] = readln().toDouble()
    }

    for (i in 0..<b.size) {
        b[i] = a[i] * a[i]
    }
    println("Matriz A:")
    for (item in a) print("$item ")
    println("\nMatriz B:")
    for (item in b) print("$item ")

}