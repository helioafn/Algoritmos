package capitulo5

/*
 * Elaborar um programa que leia quinze valores numéricos inteiros e no final apresente
 * o somatório da fatorial de cada valor lido.
 * */
fun main() {
    var somatorio = 0L
    for (i in 1..15) {
        print("Insira um número inteiro: ")
        val x = readln().toInt()
        var fatorial = 1L
        for (j in 1..x) fatorial *= j
        somatorio += fatorial
    }

    println("A soma dos fatoriais dos quinze números é: $somatorio")
}