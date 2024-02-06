package capitulo4

/*
    Fazer a leitura de um valor numérico inteiro qualquer e apresentá-lo
    caso não seja menor que 3. Dica: para a solução deste problema utilize apenas o operador lógico de negação.
*/
fun main() {
    print("Insira um número inteiro: ")
    val n = readln().toInt()
    if (!(n < 3)) println(n)
}