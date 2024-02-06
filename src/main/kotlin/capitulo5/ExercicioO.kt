package capitulo5

/*
 * Construir um programa que apresente como resultado a fatorial dos valores ímpares situados na
 * faixa numérica de 1 até 10.
 * */
fun main() {
    for (i in 1..10 step 2) {
        var fatorial = 1L
        for (j in 1..i) {
            fatorial *= j
        }
        println("$i! = $fatorial")
    }
}