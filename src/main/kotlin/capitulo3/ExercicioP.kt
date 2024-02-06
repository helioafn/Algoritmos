package capitulo3

/*
Elaborar um programa que leia o valor numérico correspondente ao salário mensal (variável SM)
de um trabalhador e também faça a leitura do valor do percentual de reajuste (variável PR) a ser
atribuído. Apresentar o valor do novo salário (variável NS).
* */
fun main() {
    print("Insira o salário atual: ")
    val salarioAtual = readln().toDouble()
    print("Insira o percentual de reajuste: ")
    var percentualReajuste = readln().toDouble()
    percentualReajuste /= 100.0

    val novoSalario = salarioAtual + (salarioAtual * percentualReajuste)
    println("Salario atual: R$$salarioAtual\nNovo salário: R$$novoSalario")
}