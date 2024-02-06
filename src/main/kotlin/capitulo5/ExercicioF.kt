package capitulo5

/*
 * Construir um programa que apresente todos os valores numéricos divisíveis por 4 e menores que 200.
 * */
fun main() {
    for (x in 1..< 200) {
        if (x % 4 == 0) println(x)
    }
}