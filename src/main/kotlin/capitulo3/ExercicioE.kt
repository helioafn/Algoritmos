package capitulo3
/*
    Efetuar o cálculo e apresentar o valor de uma prestação de um bem em atraso,
    utilizando a fórmula PRESTAÇÃO <- VALOR + (VALOR * (TAXA / 100) * TEMPO)
*/

fun main() {
    print("Insira o valor da prestação: ")
    val valorPrestacao = readln().toDouble()
    print("Insira a taxa de juros: ")
    val taxaJuros = readln().toDouble()
    print("Insira o tempo de atraso: ")
    val tempoAtraso = readln().toInt() // Em meses

    val prestacaoAjustada = valorPrestacao + (valorPrestacao * (taxaJuros / 100) * tempoAtraso)

    println("""
        Prestação inicial: R$$valorPrestacao
        Prestação ajustada: R$$prestacaoAjustada
    """.trimIndent())
}