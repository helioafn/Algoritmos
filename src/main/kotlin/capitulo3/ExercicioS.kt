package capitulo3

/*
* Elaborar um programa que leia dois valores numéricos reais desconhecidos representados pelas
 variáveis A e B. Calcular e apresentar os resultados das quatro operações aritméticas básicas.
* */
fun main() {
    print("Insira um valor numérico para A: ")
    val a = readln().toDouble()
    print("Insira um valor numérico para B: ")
    val b = readln().toDouble()

    println("""
        $a + $b = ${a + b}
        $a - $b = ${a - b}
        $a x $b = ${a * b}
        $a / $b = ${a / b}
    """.trimIndent())

}