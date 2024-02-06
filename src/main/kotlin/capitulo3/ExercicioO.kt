package capitulo3
/*
* Elaborar um programa que leia quatro valores numéricos inteiros (variáveis A, B, C e D).
* Ao final o programa deve apresentar o resultado do produto (variável P) do primeiro com o terceiro valor,
e o resultado da soma (variável S) do segundo com o quarto valor.
* */

fun main() {
    print("Insira um valor para A:")
    val a = readln().toInt()
    print("Insira um valor para B:")
    val b = readln().toInt()
    print("Insira um valor para C:")
    val c = readln().toInt()
    print("Insira um valor para D:")
    val d = readln().toInt()

    val produto = a * c
    val soma = b + d
    println("""
        $a x $c = $produto
        $b + $d = $soma
    """.trimIndent())
}
