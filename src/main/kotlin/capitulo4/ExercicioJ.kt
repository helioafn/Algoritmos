package capitulo4

/*
    Ler um valor numérico inteiro e apresentar uma mensagem
    informando se o valor fornecido é par ou ímpar
*/
fun main() {
    print("Insira um número inteiro: ")
    val n = readln().toInt()

    if (n % 2 == 0) println("$n é par")
    else println("$n é ímpar")
}