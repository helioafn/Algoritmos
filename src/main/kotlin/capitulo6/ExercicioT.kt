package capitulo6

/*
 Escrever um programa que leia duas matrizes A e B de uma dimensão com dez elementos. A
matriz A deve aceitar apenas a entrada de valores divisíveis por 2 e 3, enquanto a matriz B deve
aceitar apenas a entrada de valores múltiplos de 5. A entrada das matrizes deve ser validada
pelo programa e não pelo usuário. Construir uma matriz C que seja o resultado da junção das
matrizes A e B, de modo que contenha 20 elementos. Apresentar os elementos da matriz C.
 */
fun main() {
    val a = MutableList<Double>(10) { 0.0 }
    val b = MutableList<Double>(10) { 0.0 }
    val c = MutableList<Double>(a.size + b.size) { 0.0 }
    var i = 0
    while (i < a.size) {
        print("Insira um valor divisível por 2 e 3 [${i + 1} de ${a.size}]: ")
        val userEntry = readln().toDouble()
        val entryMeetConditions = ((userEntry % 2) == 0.0) && ((userEntry % 3) == 0.0)
        if (entryMeetConditions) {
            a[i] = userEntry
        } else continue
        i += 1
    }
    i = 0
    while (i < b.size) {
        print("Insira um valor divisível por 5 [${i+1} de ${b.size}]: ")
        val userEntry = readln().toDouble()
        val entryMeetCondition = userEntry % 5 == 0.0
        if (entryMeetCondition) {
            b[i] = userEntry
        } else continue
        i += 1
    }
    i = 0
    for (item in a) {
        c[i] = item
        i += 1
    }
    for (item in b) {
        c[i] = item
        i += 1
    }
    println("Matriz C:")
    for (item in c) print("$item ")

}