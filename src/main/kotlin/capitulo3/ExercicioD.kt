package capitulo3
/*
* Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um
automóvel que faz 12 quilômetros por litro. Para obter o cálculo, o usuário deve fornecer o tempo
gasto (variável TEMPO) e a velocidade média (variável VELOCIDADE) durante a viagem. Desta
forma, será possível obter a distância percorrida com a fórmula DISTÂNCIA <- TEMPO *
VELOCIDADE. A partir do valor da distância, basta calcular a quantidade de litros de combustível
utilizada na viagem com a fórmula LITROS_USADOS <- DISTÂNCIA/ 12. O programa deve
apresentar os valores da velocidade média, tempo gasto na viagem, a distância percorrida e a
quantidade de litros utilizada na viagem.
* */

fun main() {
    val KM_LITRO = 12.0 // fornecido pelo problema
    println("Insira o tempo gasto na viagem (horas):")
    val tempo = readln().toDouble()
    println("Insira a velocidade média da viagem:")
    val velocidadeMedia = readln().toDouble()
    val distancia = tempo * velocidadeMedia
    val litros = distancia / KM_LITRO
    println("""
        A velocidade média da viagem foi: $velocidadeMedia km/h
        O tempo gasto na viagem foi: $tempo horas
        Foram gastos $litros litros de combustível nessa viagem
    """.trimIndent())
}