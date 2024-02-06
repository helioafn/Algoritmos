package capitulo3

/*
   Ler dois valores para as variáveis A e B e efetuar a troca dos valores de forma que a
   variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da variável A.
   Apresentar os valores após a efetivação do processamento da troca.
*/

fun main() {
    print("Insira o valor de A: ")
    var a = readln()
    print("Insira o valor de B: ")
    var b = readln()

    println("Valor inicial de A: $a.\nValor Inicial de B: $b.")
    val c = a
    a = b
    b = c
    println("Valor final de A: $a\nValor final de B: $b.")


}