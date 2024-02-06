package capitulo5

/*
 * Escrever um programa que apresente os valores da sequência numérica de Fibonacci até o décimo
 * quinto termo. A sequeência é formada por 0,1,2,3,5,... etc. Obtendo-se o próximo termo a partir
 * da soma do termo atual com o anterior. Utilize para esse exercício as variáveis atual, anterior e
 * proximo.
 * */
fun main() {
    val n = 15 // tamanho da sequência
    var anterior = 0
    var atual = 1
    var proximo: Int
    print("$anterior $atual ")
    for (i in 0..<n) {
        proximo = anterior + atual
        anterior = atual
        atual = proximo
        print("$proximo ")
    }
}