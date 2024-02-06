package capitulo6

/*
 Escrever um programa que leia 25 elementos (valores reais) para temperaturas em graus Celsius
e armazene esses valores em uma matriz A de uma dimensão do tipo vetor.
Construir uma matriz B de mesmo tipo e dimensão, em que cada elemento da matriz B deve ser a conversão
da temperatura em graus Fahrenheit do elemento correspondente da matriz A. Apresentar os elementos das
matrizes A e B.
 */
fun main() {
    val celsiusArray = MutableList<Double>(5) { 0.0 }
    val fahrenheitArray = MutableList<Double>(5) { 0.0 }
    for (i in 0..<celsiusArray.size) {
        print("Insira a temperatura Celsius Nº${i + 1}: ")
        celsiusArray[i] = readln().toDouble()
    }
    for (i in 0..<fahrenheitArray.size) {
        fahrenheitArray[i] = ((celsiusArray[i] * 9) / 5.0) + 32
    }

    println("Matriz de temperaturas Celsius:")
    for (item in celsiusArray) print("$item ")
    println()
    println("Matriz de temperaturas convertidas para Fahrenheit:")
    for (item in fahrenheitArray) print("$item ")

}