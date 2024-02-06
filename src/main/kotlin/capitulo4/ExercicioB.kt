package capitulo4

/*
    Efetuar a leitura de um valor numérico inteiro
    positivo ou negativo representado pela variável N
    e apresentar o valor lido como sendo positivo.
    Dica: se o valor lido for menor que zero, ele deve
    ser multiplicado por -1.
*/

fun main() {
    print("Insira um número inteiro: ")
    var x = readln().toInt()

    if (x < 0) {
        x *= -1
        println(x)
    } else println(x)

}