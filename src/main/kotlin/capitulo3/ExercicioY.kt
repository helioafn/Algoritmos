package capitulo3

/*
    Construir um programa que leia um valor numérico inteiro e
    apresente como resultado os seus valores sucessor e antecessor.
*/
fun main() {
    print("Insira um número inteiro: ")
    val valor = readln().toInt()
    println("""
        O número é $valor
        Seu antecessor é ${valor - 1}
        Seu sucessor é ${valor + 1}
    """.trimIndent())
}