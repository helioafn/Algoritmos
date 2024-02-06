package capitulo6

/*
 Elaborar um programa que leia 12 elementos inteiros para uma matriz A de uma dimensão do tipo vetor.
Construir uma matriz B de mesmo tipo e dimensão, observando a seguinte lei de formação: "Todo elemento
da matriz A que for ímpar deve ser multiplicado por 2; caso contrário, o elemento da matriz A deve
permanecer constante." Apresentar os elementos da matriz B.
 */
fun main() {
    val a = MutableList<Int>(12) { 0 }
    val b = MutableList<Int>(12) { 0 }

    for (i in 0..<a.size) {
        print("Insira um número na matriz A: ")
        a[i] = readln().toInt()
    }

    for (i in 0..<b.size) {
        val isOdd = a[i] % 2 != 0
        if (isOdd) b[i] = a[i] * 2
        else b[i] = a[i]
    }

    println("Matriz B:")
    for (item in b) print("$item ")
}