package capitulo5

/*
 * Elaborar um programa que apresenta os resultados da soma e da média aritmética dos valores
 * pares situados na faixa numérica de 50 até 70.
 * */
fun main() {
    var soma = 0
    var contagem = 0
    for (i in 50..70) {
        if (i % 2 == 0) {
            soma += i
            contagem += 1
        }
    }
    val media = 1.0 * soma / contagem
    println("Soma dos valores na faixa numérica: $soma\nMedia dos valores: $media")
}