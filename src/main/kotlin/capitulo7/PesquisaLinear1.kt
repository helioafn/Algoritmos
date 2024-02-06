package capitulo7

/*
* Elaborar um programa que leia dez nomes e apresente pelo método de pesquisa
* sequencial os nomes que porventura estejam armazenados na matriz e que coincidam
* com o nome de entrada de pesquisa. Além de apresentar o nome, o programa deve
* indicar em que posição da matriz ele está armazenado. Caso o nome pesquisado
* não seja encontrado, deve informar que o nome pesquisado não foi localizado.
* */
fun main() {
    val nomes = MutableList(10) { "" }
    val sim = listOf("Sim", "sim", "s", "S")
    val nao = listOf("Não", "não", "n", "nao", "N", "Nao")
    var continuar = "sim"

    for (i in 0..<nomes.size) {
        print("Insira um nome [${i + 1} de ${nomes.size}]: ")
        nomes[i] = readln()
    }

    while (continuar in sim) {
        print("Insira o nome que deseja pesquisar: ")
        val nomePesquisa = readln()
        var estaNaLista = false
        for ((indice, nome) in nomes.withIndex()) {
            if (nome.lowercase() == nomePesquisa.lowercase()) {
                println("$nome encontrado na posição $indice")
                estaNaLista = true
            }
        }
        if (!estaNaLista) {
            println("Nome não encontrado!")
        }

        print("Deseja continuar pesquisando? ")
        continuar = readln().trim()
        if (continuar in sim)
            continue
        else if (continuar in nao)
            break

    }
}