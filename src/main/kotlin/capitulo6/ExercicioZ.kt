package capitulo6

/*
 Elaborar um programa que leia uma matriz A de uma dimensão com dez elementos numéricos inteiros.
Apresentar o total de elementos ímpares existentes na matriz e também o percentual do
valor total de números ímpares em relação à quantidade de elementos armazenados na matriz.
 */
fun main() {
    val a = MutableList(10) { 0 }
    var numerosImpares = 0

    for (i in 0..<a.size) {
        print("Insira um número inteiro [${i + 1} de ${a.size}]: ")
        a[i] = readln().toInt()

        val testeImpar = a[i] % 2 != 0
        if (testeImpar)
            numerosImpares += 1
    }

    val percentualImpares = (1.0 * numerosImpares / a.size) * 100.0
    println(
        """
        Quantidade de elementos ímpares: $numerosImpares.
        Percentual de números ímpares: $percentualImpares%
        """.trimIndent()
    )
}