package capitulo5

/*
 * Elaborar um programa que leia dez valores numéricos reais e apresente no final o somatório
 * e a média dos valores lidos.
 * */
fun main() {
    var soma = 0.0
    for (i in 1..10) {
        print("Insira um número: ")
        val x = readln().toDouble()
        soma += x
    }
    val media = soma / 10.0
    println("Soma dos números: $soma\nMédia dos números: $media")
}