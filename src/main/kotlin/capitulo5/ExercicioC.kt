package capitulo5

/*
 * Construir um programa que apresente a soma dos cem primeiros números naturais.
 * */
fun main() {
    var soma = 0
    for (i in 1..100) soma += i
    println(soma)
}