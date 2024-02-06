package capitulo4

/*
    Efetuar a leitura de dois valores numéricos inteiros representados
    pelas variáveis A e B e apresentar o resultado da diferença do maior valor
    pelo menor valor.
*/
fun main() {
    print("Insira um valor inteiro para A: ")
    val a = readln().toInt()
    print("Insira um valor inteiro para B: ")
    val b = readln().toInt()

    if (a > b) println("$a - $b = ${a - b}")
    else println("$b - $a = ${b - a}")
}