package capitulo4

/*
    Ler um número inteiro qualquer e multiplicá-lo por dois.
    Apresentar o resultado da multiplicação somente se o resultado
    for maior que 30.
*/
fun main() {
    print("Insira um número inteiro: ")
    val n = readln().toInt()
    val produto = n * 2
    if (produto > 30) println(produto)
}