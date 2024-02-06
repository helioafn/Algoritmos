package capitulo6

/*
 Elaborar um programa que leia 15 elementos reais para uma matriz A de uma dimensão do tipo vetor.
Construir uma matriz B de mesmo tipo e dimensão, observando a seguinte lei de formação: "Todo elemento da
matriz A que possuir índice par deve ter seu elemento dividido por 2; caso contrário, o elemento da
matriz A deve ser multiplicado por 1.5". Apresentar os elementos da matriz B.
 */
fun main() {
    val a = MutableList<Double>(15) { 0.0 }
    val b = MutableList<Double>(15) { 0.0 }
    for (i in 0..<a.size) {
        print("Insira um número na matriz A: ")
        a[i] = readln().toDouble()
    }
    for (i in 0..<b.size) {
        val isEven = i % 2 == 0
        if (isEven) b[i] = a[i] / 2
        else b[i] = a[i] * 1.5
    }

    println("Matriz B: ")
    for (item in b) print("$item ")
}