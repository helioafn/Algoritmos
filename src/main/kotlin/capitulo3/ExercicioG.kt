package capitulo3
/*
* Ler quatro valores numéricos inteiros e apresentar o resultado das adições e das multiplicações
utilizando o mesmo raciocínio aplicado quando do uso de propriedades distributivas para a
máxima combinação possível entre as quatro variáveis. Não é para calcular a propriedade distri-
butiva, apenas para usar a sua forma de combinação. Considerando a leitura de valores para as
variáveis A, B, C e D, devem ser feitas seis adições e seis multiplicações, ou seja, deve ser com-
binada a variável A com a variável B, a variável A com a variável C, a variável A com a variável D.
Depois é necessário combinar a variável B com a variável C e a variável B com a variável D e,
por fim, a variável C será combinada com a variável D.
* */

fun main() {
    print("Insira um valor inteiro para A: ")
    val a = readln().toInt()
    print("Insira um valor inteiro para B: ")
    val b = readln().toInt()
    print("Insira um valor inteiro para C: ")
    val c = readln().toInt()
    print("Insira um valor inteiro para D: ")
    val d = readln().toInt()

    println("A + B = ${a + b}")
    println("A + C = ${a + c}")
    println("A + D = ${a + d}")
    println("B + C = ${b + c}")
    println("B + D = ${b + d}")
    println("C + D = ${c + d}")
    println("----------------")
    println("A X B = ${a * b}")
    println("A X C = ${a * c}")
    println("A X D = ${a * d}")
    println("B X C = ${b * c}")
    println("B X D = ${b * d}")
    println("C X D = ${c * d}")
}
