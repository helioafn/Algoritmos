package capitulo6

/*
    Elaborar um programa que efetue a leitrua de dez nomes de pessoas em uma matriz A do tipo vetor
    e apresente-os em seguida.
*/
fun main() {
    val arr = MutableList<String>(10) { "" }
    for (i in 0..<arr.size) {
        print("Insira seu nome: ")
        arr[i] = readln()
    }
    for (i in arr) println(i)
}