package capitulo5

/*
 * Elaborar um programa que leia sucessivamente valores numéricos e apresente no final o somatório,
 * a média e o total de valores lidos. O programa deve ler os valores enquanto o usuário estiver
 * fornecendo valores positivos.
 * */
fun main() {
    var contagemNumeros = 0
    var soma = 0.0
    while (true) {
        print("Insira um número: ")
        val inputUsuário = readln().toDouble()
        if (inputUsuário < 0) break
        soma += inputUsuário
        contagemNumeros += 1
    }

    val media = soma / contagemNumeros
    println("Soma dos números: $soma\nMédia dos valores: $media\nQuantidade de valores lidos: $contagemNumeros")
}