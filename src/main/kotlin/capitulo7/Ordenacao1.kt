package capitulo7

// Ler 20 nomes e armazenar em uma matriz de uma dimensão, ordenar os nomes inseridos e ao final apresentar os elementos
// da matriz.
fun main() {
    val nomes = MutableList(20) { "" }
    // Entrada dos nomes
    for (i in 0..<nomes.size) {
        print("Insira um nome [${i + 1} de ${nomes.size}]: ")
        nomes[i] = readln()
    }
    // Ordenando os nomes
    for (i in 0..<nomes.size) {
        for (j in i + 1..<nomes.size) {
            if (nomes[i].lowercase() > nomes[j].lowercase()) {
                val aux = nomes[i]
                nomes[i] = nomes[j]
                nomes[j] = aux
            }
        }
    }
    // Apresentando os nomes
    for (nome in nomes) print("$nome ")
}