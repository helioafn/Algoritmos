package capitulo4

/*
    Realizar a leitura dos valores de quatro notas escolares
    bimestrais de um aluno representadas pelas variáveis
    N1,N2,N3,N4. Calcular a média aritmética (MD) desse aluno
    e apresentar a mensagem "Aprovado" se a media obtida for maior
    ou igual a 5; caso contrário, apresentar a mensagem "Reprovado".
    Informar também, após a apresentação das mensagens,
    o valor da média obtida pelo aluno.
*/
fun main() {
    print("Insira a nota 1: ")
    val n1 = readln().toDouble()
    print("Insira a nota 2: ")
    val n2 = readln().toDouble()
    print("Insira a nota 3: ")
    val n3 = readln().toDouble()
    print("Insira a nota 4: ")
    val n4 = readln().toDouble()
    val media = (n1 + n2 + n3 + n4) / 4.0

    if (media >= 5) println("Aprovado! Sua média final foi: $media")
    else println("Reprovado! Sua média final foi: $media")
}