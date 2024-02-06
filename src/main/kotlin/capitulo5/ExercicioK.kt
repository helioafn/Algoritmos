package capitulo5

/*
 * Escrever um programa que calcule e apresente o somatório do número de grãos de trigo que se
 * pode obter num tabuleiro de xadrez, obedecendo a seguinte regra: colocar um grão de trigo no
 * primeiro quadro e nos quadros seguintes o dobro do quadro anterior.
 * Ou seja, no primeiro quadro coloca-se um grão, no segundo dois grãos, no terceiro quatro grãos
 * e assim até o sexagésimo quarto quadro.
 * */
fun main() {
    var soma: Long = 0
    var graos: Long = 1
    for (i in 0..<64-1) {
        soma += graos
        graos *= 2
    }
    println("O somatório do número de grãos de trigo é $soma.")
}