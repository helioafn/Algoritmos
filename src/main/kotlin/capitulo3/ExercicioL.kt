package capitulo3

/*
Elaborar um programa que apresente o valor da conversão em dólar (U$$) de um valor lido em real (R$).
O programa deve solicitar o valor da cotação do dólar e também a quantidade de reais disponível com o
usuário.
*/
fun main() {
    print("Insira a quantidade de reais: ")
    val qtReais = readln().toDouble()
    print("Insira a cotação do dólar: ")
    val cotacao = readln().toDouble()
    val dolares = qtReais / cotacao
    println("""
        R$$qtReais convertido para dólares são na cotação de R$$cotacao:
        US$$dolares
    """.trimIndent())
}