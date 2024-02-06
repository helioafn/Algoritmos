package capitulo7

// Exemplo de algoritmo de pesquisa binária
fun main() {
    val nomes = MutableList(10) { "" }
    var continuar = "sim"

    // Lendo os elementos
    for (i in 0..<nomes.size) {
        print("Insira um nome [${i + 1} de ${nomes.size}]: ")
        nomes[i] = readln().trim()
    }

    // Ordenando os elementos
    for (i in 0..<nomes.size) {
        for (j in i + 1..<nomes.size) {
            if (nomes[i].lowercase() > nomes[j].lowercase()) {
                val aux = nomes[i]
                nomes[i] = nomes[j]
                nomes[j] = aux
            }
        }
    }

    // Pesquisando
    while (continuar == "sim") {
        print("Insira o nome a ser pesquisado: ")
        val nomePesquisa = readln().trim()
        var estaNaLista = false
        var inicio = 0
        var fim = nomes.size
        var indice = 0
        while ((inicio < fim) && !estaNaLista) {
            val meio = (inicio + fim) / 2
            if (nomePesquisa.lowercase() == nomes[meio].lowercase()) {
                estaNaLista = true
                indice = meio
            } else if (nomePesquisa.lowercase() < nomes[meio].lowercase())
                fim = meio - 1
            else
                inicio = meio + 1

        }

        if (estaNaLista) println("$nomePesquisa foi localizado na posição $indice.")
        else println("$nomePesquisa não foi localizado.")

        print("Deseja continuar pesquisando? ")
        continuar = readln().trim()
        if (continuar in listOf("Sim", "sim", "s", "S"))
            continue
        else break

    }

}