package capitulo3

/*
* Ler dois valores numéricos inteiros (representados pelas variáveis A e B)
* e apresentar o resultado do quadrado da diferença do primeiro valor
* (variável A) em relação ao segundo valor (variável B).
* */

fun main() {
    print("Insira um inteiro A: ")
    val a = readln().toInt()
    print("Insira um inteiro B: ")
    val b = readln().toInt()
    val resultado = (a - b) * (a - b)
    println("($a - $b)² = $resultado")
}