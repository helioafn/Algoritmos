package capitulo4

import kotlin.system.exitProcess

/*
    Efetuar a leitura de um nome e o sexo de uma pessoa e apresentar
    como saída uma das seguintes mensagens: "Ilmo. Sr.", caso seja
    informado o sexo masculino (utilizar como valor o caractere "M"),
    ou "Ilma. Sra.", caso seja informado o sexo feminino
    (utilizar como valor o caractere "F"). Após a mensagem de saudação,
    apresentar o nome informado. O programa deve, após a entrada do sexo,
    verificar primeiramente se o sexo fornecido é realmente válido, ou seja,
    se é igual a 'M' ou a 'F'. Não sendo essa condição verdadeiera, o programa
    deve apresentar a mensagem "Sexo informado inválido".
*/
fun main() {
    print("Insira o seu nome: ")
    val nome = readln().trim()
    print("Insira o seu sexo [M ou F]: ")
    val sexo = readln().uppercase().trim()

    if (!(sexo == "M" || sexo == "F")) {
        println("Sexo informado inválido")
        exitProcess(0)
    }

    if (sexo == "M") println("Ilmo. Sr. $nome.")
    else println("Ilma. Sra. $nome.")


}