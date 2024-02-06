package capitulo6

/*
 Construir um programa que calcule a tabuada de um valor qualquer de 1 até 10 e armazene
os resultados em uma matriz A de uma dimensão. Apresentar os elementos da matriz A.
 */
fun main() {
    val a = MutableList<Int>(10) {0}
    var j = 1

    print("Insira um número: ")
    val tabuadaDe = readln().toInt()
    for (i in 0..<a.size) {
        a[i] = tabuadaDe * j
        j += 1
    }

    println("Matriz A:")
    for (item in a) print("$item ")

}