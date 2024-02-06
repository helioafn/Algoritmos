package capitulo4

/*
    Efetuar a leitura de três valores inteiros representados pelas
    variáveis a, b, c. Somar os valores fornecidos e apresentar o
    resultado somente se for maior ou igual a 100.
*/
fun main() {
    print("Insira um número inteiro: ")
    val a = readln().toInt()
    print("Insira um número inteiro: ")
    val b = readln().toInt()
    print("Insira um número inteiro: ")
    val c = readln().toInt()
    val soma = a + b + c

    if (soma >= 100) println(soma)
}