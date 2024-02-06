package capitulo3
/*
* Elaborar um programa que calcule e apresente o valor do volume de uma caixa retangular,
* utilizando a fórmula VOLUME <- COMPRIMENTO* LARGURA* ALTURA.
* */

fun main() {
    print("Insira o comprimento da caixa: ")
    val comprimento = readln().toDouble()
    print("Insira a largura da caixa: ")
    val largura = readln().toDouble()
    print("Insira a altura da caixa: ")
    val altura = readln().toDouble()

    val volume = comprimento * largura * altura

    println("O volume da caixa é $volume")
}