package capitulo3

/*
* Em uma eleição sindical concorreram ao cargo de presidente três candidatos (representados
pelas variáveis A, B e C). Durante a apuração dos votos foram computados votos nulos e em
branco, além dos votos válidos para cada candidato. Deve ser criado um programa de computador
que faça a leitura da quantidade de votos válidos para cada candidato, além de também ler
a quantidade de votos nulos e em branco. Ao final o programa deve apresentar o número total
de eleitores considerando os votos válidos, nulos e em branco; o percentual correspondente de
votos válidos em relação à quantidade de eleitores; o percentual correspondente de votos válidos
do candidato A em relação à quantidade de eleitores; o percentual correspondente de
votos válidos do candidato B em relação à quantidade de eleitores; o percentual correspondente
de votos válidos do candidato C em relação à quantidade de eleitores; o percentual
correspondente de votos nulos em relação à quantidade de eleitores; e por último o
percentual correspondente de votos em branco em relação à quantidade de eleitores.
* */

fun main() {
    print("Votos do candidato A: ")
    val votosCandidatoA = readln().toInt()
    print("Votos do candidato B: ")
    val votosCandidatoB = readln().toInt()
    print("Votos do candidato C: ")
    val votosCandidatoC = readln().toInt()
    print("Insira a quantidade de votos brancos: ")
    val votosBrancos = readln().toInt()
    print("Insira a quantidade de votos nulos: ")
    val votosNulos = readln().toInt()

    val totalEleitores = votosCandidatoA + votosCandidatoB + votosCandidatoC + votosBrancos +
    votosNulos
    val votosValidos = totalEleitores - (votosBrancos + votosNulos)

    val percentualCandidatoA = ((votosCandidatoA.toDouble()) / totalEleitores) * 100.0
    val percentualCandidatoB = ((votosCandidatoB.toDouble()) / totalEleitores) * 100.0
    val percentualCandidatoC = ((votosCandidatoC.toDouble()) / totalEleitores) * 100.0
    val percentualVotosBrancos = ((votosBrancos.toDouble()) / totalEleitores) * 100.0
    val percentualVotosNulos = ((votosNulos.toDouble()) / totalEleitores) * 100.0

    println("""
        Total de eleitores: $totalEleitores
        Percentual de votos do candidato A: $percentualCandidatoA%
        Percentual de votos do candidato B: $percentualCandidatoB%
        Percentual de votos do candidato C: $percentualCandidatoC%
        Percentual de votos brancos: $percentualVotosBrancos%
        Percentual de votos nulos: $percentualVotosNulos%
    """.trimIndent())

}