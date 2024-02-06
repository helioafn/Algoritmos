package capitulo3
/*
* Elaborar um programa que apresente o valor da conversão em real (R$) de um valor lido em dólar
(US$). O programa deve solicitar o valor da cotação do dólar e também a quantidade de dólares
disponível com o usuário.
* */
fun main() {
    print("Insira a sua quantidade de dólares: ")
    val qtDolares = readln().toDouble()
    print("Insira a cotação do dólar: ")
    val cotacaoDolar = readln().toDouble()
    val reais = qtDolares * cotacaoDolar
    println("""
        $$qtDolares convertido para reais na cotação de R$$cotacaoDolar:
        R$$reais
    """.trimIndent())
}
