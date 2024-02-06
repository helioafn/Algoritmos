package capitulo4

/*
    Ler três valores inteiros representados pelas variáveis a, b e c
    e apresentar os valores lidos dispostos em ordem crescente. Dica:
    utilizar tomada de decisão sequencial e as ideias trabalhadas nos
    exercícios "g" (propriedade distributiva) e "f" (troca de valores)
    do capítulo 3.
*/

fun main() {
    print("Insira um valor inteiro para A: ")
    var a = readln().toInt()
    print("Insira um valor inteiro para B: ")
    var b = readln().toInt()
    print("Insira um valor inteiro para C: ")
    var c = readln().toInt()
    var troca: Int

    if (a > b) {
        troca = a
        a = b
        b = troca
    }

    if (b > c) {
        troca = b
        b = c
        c = troca
    }

    if (a > b) {
        troca = a
        a = b
        b = troca
    }

    println("Os valores em ordem crescente: $a, $b, $c")
}
