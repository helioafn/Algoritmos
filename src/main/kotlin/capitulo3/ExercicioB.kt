package capitulo3
/*
* Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius.
*  A fórmula de conversão é C <- ((F - 32) * 5) / 9, sendo F a temperatura em Fahrenheit
*  e C a temperatura em Celsius.
* */

fun main() {
    println("Insira a temperatura em Fahrenheit:")
    val fahrenheit = readln().toDouble()
    val celsius = ((fahrenheit - 32) * 5) / 9.0
    println("${fahrenheit}ºF são ${celsius}ºC")
}
