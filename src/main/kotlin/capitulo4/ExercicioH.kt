package capitulo4

/*
    Efetuar a leitura de quatro valores numéricos inteiros
    representados pelas variáveis a,b,c e d. Apresentar apenas
    os valores que sejam divisíveis por 2 ou 3.
*/
fun main() {
    print("Insira um valor inteiro para A: ")
    val a = readln().toInt()
    print("Insira um valor inteiro para B: ")
    val b = readln().toInt()
    print("Insira um valor inteiro para C: ")
    val c = readln().toInt()
    print("Insira um valor inteiro para D: ")
    val d = readln().toInt()

    if (a % 2 == 0 && a % 3 == 0) println(a)
    if (b % 2 == 0 && b % 3 == 0) println(b)
    if (c % 2 == 0 && c % 3 == 0) println(c)
    if (d % 2 == 0 && d % 3 == 0) println(d)
}