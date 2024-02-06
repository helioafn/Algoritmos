package capitulo5

/*
 * Elaborar um programa que apresente o somatório dos valores pares existentes na faixa de
 * 1 até 500
 * */
fun main() {
    var soma = 0
    for (x in 1..500) {
        if (x % 2 == 0) soma += x
    }
}