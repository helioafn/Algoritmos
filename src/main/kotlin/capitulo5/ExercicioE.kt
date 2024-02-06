package capitulo5

/*
 * Elaborar um programa que apresente todos os valores numéricos inteiros ímpares situados
 * na faixa de 0 a 20.
 * */
fun main() {
    for (x in 0..20) {
        if (x % 2 != 0) println(x)
    }
}