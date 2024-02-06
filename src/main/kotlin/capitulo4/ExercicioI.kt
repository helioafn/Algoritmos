package capitulo4

/*
    Ler cinco valores numéricos inteiros (a,b,c,d,e), identificar e
    apresentar o maior e o menor valores informados. Não execute a
    ordenação dos valores como no exercício "f".
*/
fun main() {
    print("Insira um número inteiro: ")
    val a = readln().toInt()
    print("Insira um número inteiro: ")
    val b = readln().toInt()
    print("Insira um número inteiro: ")
    val c = readln().toInt()
    print("Insira um número inteiro: ")
    val d = readln().toInt()
    print("Insira um número inteiro: ")
    val e = readln().toInt()

    var menor = a
    var maior = a

    if (b < menor) {
        menor = b
    }
    if (c < menor) {
        menor = c
    }
    if (d < menor) {
        menor = d
    }
    if (e < menor) {
        menor = e
    }

    if (b > maior) {
        maior = b
    }
    if (c > maior) {
        maior = c
    }
    if (d > maior) {
        maior = d
    }
    if (e > maior) {
        maior = e
    }

    println("O menor valor é $menor.\nO maior valor é $maior")
}