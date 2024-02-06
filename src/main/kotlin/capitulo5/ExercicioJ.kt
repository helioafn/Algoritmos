package capitulo5

/*
 * Elaborar um programa que apresente os valores de conversão de graus Celsius em graus
 * Fahrenheit, a cada dez graus, iniciando a contagem em dez graus Celsius e finalizando em
 * cem graus Celsius. O programa deve apresentar os valores das duas temperaturas.
 * */
fun main() {
    var fahrenheit: Double
    for (celsius in 10..100 step 10) {
        fahrenheit = (9 * celsius + 160) / 5.0
        println("${celsius}ºC | ${fahrenheit}ºF")
    }
}
