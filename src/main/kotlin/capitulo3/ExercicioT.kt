package capitulo3

/*
* Construir um programa que calcule e apresente em metros por segundo o valor da velocidade de
um projétil que percorre uma distância em quilômetros a um espaço de tempo em minutos. Utilize
a fórmula VELOCIDADE <- (DISTÂNCIA* 1000) /(TEMPO* 60).
* */
fun main() {
    print("Insira a distância percorrida pelo projétil [em quilômetros]: ")
    val distancia = readln().toDouble()
    print("Insira o tempo gasto no trajeto [em minutos]: ")
    val tempo = readln().toDouble()
    val velocidade = (distancia / 1000.0) / (tempo * 60.0)
    print("Velocidade do projétil $velocidade")
}