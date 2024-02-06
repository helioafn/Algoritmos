package capitulo3
/*
* Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit.
*  A fórmula de conversão é F <- (9 * C + 160) / 5, sendo F a temperatura em Fahrenheit
*  e C a temperatura em Celsius.
* */
fun main() {
    println("Insira a temperatura em Celsius:")
    val celsius = readln().toDouble()
    val fahrenheit = (9 * celsius + 160) / 5.0
    println("${celsius}ºC são ${fahrenheit}ºF")
}