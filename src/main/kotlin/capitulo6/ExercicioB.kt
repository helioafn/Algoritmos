package capitulo6

/*
 Elaborar um programa que leia oito elementos inteiros em uma matriz A do tipo vetor.
Construir uma matriz B da mesma dimensão com os elementos da matriz A multiplicados por 3.
Apresentar a matriz B
*/
fun main() {
    val arrayA = MutableList<Int>(8) { 0 }
    val arrayB = MutableList<Int>(8) { 0 }
    for (i in 0..<arrayA.size) {
        print("Insira um número inteiro: ")
        arrayA[i] = readln().toInt()
    }
    for (i in 0..<arrayB.size) {
        arrayB[i] = arrayA[i] * 3
        println("${arrayB[i]}")
    }
}
