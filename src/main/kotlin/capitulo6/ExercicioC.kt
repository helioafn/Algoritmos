package capitulo6

/*
 Escrever um programa que leia duas matrizes (A e B) do tipo vetor com 20 elementos reais.
Construir uma matriz C, sendo cada elemento da matriz C a subtração de um elemento correspondente
da matriz A com um elemento correspondente da matriz B, ou seja, a operação de processamento deve
estar baseada na operação c[i] ← a[i] - b[i]. Ao final, apresentar os elementos da matriz C.
 */
fun main() {
    val a = MutableList<Double>(20) { 0.0 }
    val b = MutableList<Double>(20) { 0.0 }
    val c = MutableList<Double>(20) { 0.0 }

    for (i in 0..<a.size) {
        print("Insira um número: ")
        a[i] = readln().toDouble()
    }
    for (i in 0..<b.size) {
        print("Insira um número: ")
        b[i] = readln().toDouble()
    }
    for (i in 0..<c.size) {
        c[i] = a[i] - b[i]
        println(c[i])
    }
}