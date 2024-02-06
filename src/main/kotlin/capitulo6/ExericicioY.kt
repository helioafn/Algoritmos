package capitulo6

/*
 Escrever um programa que leia uma matriz A de uma dimensão com 15 elementos numéricos
inteiros. Apresentar o total de elementos pares existentes na matriz.
 */
fun main() {
    val a = MutableList(15) { 0 }
    var numerosPares = 0
    for (i in 0..<a.size) {
        print("Insira um número [${i + 1} de ${a.size}]: ")
        a[i] = readln().toInt()

        val testePar = a[i] % 2 == 0
        if (testePar)
            numerosPares += 1
    }
    println("O número de números pares na matriz é: $numerosPares")

}