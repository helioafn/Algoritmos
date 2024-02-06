package capitulo3

/*
* Efetuar a leitura de um valor numérico inteiro e apresentar
* o resultado do valor lido elevado ao quadrado.
* */

fun main() {
    print("Insira um número inteiro: ")
    val n = readln().toInt()
    println("$n² = ${n * n}")
}