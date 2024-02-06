package capitulo5

/*
 * Elaborar um programa que leia valores positivos inteiros até que um valor negativo
 * seja informado. Ao final devem ser apresentados o maior e o menor valores informados pelo
 * usuário.
 * */
fun main() {
    var maior = 0
    var menor = Int.MAX_VALUE
    while (true) {
        print("Insira um número: ")
        val inputUsuario = readln().toInt()

        if (inputUsuario < 0) break
        if (inputUsuario > maior) maior = inputUsuario
        if (inputUsuario < menor) menor = inputUsuario
    }
    println("O maior valor inserido foi: $maior\nO menor valor inserido foi $menor")
}