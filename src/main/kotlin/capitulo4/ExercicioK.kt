package capitulo4

/*
    Efetuar a leitura de um valor numérico inteiro que esteja na
    faixa de valores de 1 até 9.
    O programa deve apresentar a mensagem "O valor está na faixa permitida",
    caso o valor esteja entre 1 e 9. Se o valor estiver na fora da faixa,
    o programa deve apresentar a mensagem "O valor está fora da faixa permitida".
*/
fun main() {
    print("Insira um número inteiro: ")
    val n = readln().toInt()

    if (n in 1..9) println("$n está na faixa permitida.")
    else println("$n não está na faixa permitida.")
}