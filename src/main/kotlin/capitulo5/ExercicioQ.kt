package capitulo5

/*
 * Escrever um programa que possibilite calcular a área total em metros de uma residência com os
cômodos sala, cozinha, banheiro, dois quartos, área de serviço, quintal, garagem, entre outros,
que podem ser fornecidos ao programa. O programa deve solicitar a entrada do nome, da
largura e do comprimento de um determinado cômodo. Em seguida, deve apresentar a área do
cômodo lido e também uma mensagem solicitando ao usuário a confirmação de continuar
calculando novos cômodos. Caso o usuário responda "NÃO", o programa deve apresentar o
valor total acumulado da área residencial
 * */
fun main() {
    var areaTotal = 0.0
    while (true) {
        print("Qual cômodo deseja calcular a área? ")
        val comodo = readln()
        print("Insira a largura do cômodo: ")
        val larguraComodo = readln().toDouble()
        print("Insira o comprimento do cômodo: ")
        val comprimentoComodo = readln().toDouble()
        val areaComodo = larguraComodo * comprimentoComodo
        areaTotal += areaComodo
        println("A área do cômodo $comodo é $areaComodo m²")

        print("Deseja continuar calculando a área de cômodos? ")
        val escolha = readln().lowercase().trim()
        if (escolha != "sim") break
    }

    println("Area total da residência $areaTotal m²")
}