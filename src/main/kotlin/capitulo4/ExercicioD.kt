package capitulo4

/*
    Ler os valores de quatro notas escolares bimestrais de um aluno
    (n1,n2,n3,n4). Calcular a média aritmética (md1) desse aluno e
    apresentar a mensagem "Aprovado" se a média obtida for maior que 7;
    caso contrário, o programa deve solicitar a quinta nota (nota de exame, NE)
    do aluno e calcular uma nova média aritmética (md2) entre a nota de exame e
    a primeira média aritmética. Se o valor da nova média for maior ou
    igual a cinco, apresentar a mensagem "Aprovado em exame"; caso contrário,
    apresentar a mensagem "Reprovado". Informar também, após a apresentação das
    mensagens, o valor da média obtida pelo aluno.
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
    val md1 = (n1 + n2 + n3 + n4) / 4.0

    if (md1 >= 7) println("Aprovado! Sua média final foi: $md1")
    else {
        print("Insira a nota do exame final: ")
        val exameFinal = readln().toDouble()
        val md2 = (md1 + exameFinal) / 2.0
        if (md2 >= 5) println("Aprovado em exame! Sua média final foi: $md2")
        else println("Reprovado. Sua média final foi: $md2")
    }
}