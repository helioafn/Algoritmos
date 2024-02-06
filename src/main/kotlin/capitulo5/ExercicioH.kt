package capitulo5

/*
 * Escrever um programa que apresente como resultado a potência da base qualquer elevada
 * a um expoente qualquer, ou seja, de B^E, onde B = base e E = expoente. Considere apenas a entrada
 * de valores naturais. Use a técnica do laço (valor da base deve ser multiplicado o número de vezes
 * determinado no expoente).
 * */
fun main() {
    print("Insira a base da potência: ")
    val base = readln().toInt()
    print("Insira o expoente da potência: ")
    val expoente = readln().toInt()
    var potencia: Int

    for (x in 0..expoente) {
        potencia = base
        if (x == 0) {
            println("1")
            continue
        }
        if (x == 1) {
            println("$base")
            continue
        }
        for (i in 0..<x - 1) potencia *= base
        println(potencia)
    }
}