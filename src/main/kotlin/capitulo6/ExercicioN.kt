package capitulo6

/*
 Elaborar um programa que leia 20 elementos (numeros reais) para temperaturas em graus Celsius
e armazene esses valores em uma matriz A de uma dimensão. O programa ao final deve apresentar a menor,
maior e a média das temperaturas lidas.
 */
fun main() {
    val a = MutableList<Double>(20) { 0.0 }
    var soma = 0.0
    for (i in 0..<a.size) {
        print("Insira a temperatura (ºC) ${i+1}: ")
        a[i] = readln().toDouble()
        soma += a[i]
    }

    var menor = a[0]
    var maior = a[0]

    for (i in 0..<a.size) if (a[i] < menor) menor = a[i]
    for (i in 0..<a.size) if (a[i] > maior) maior = a[i]

    val media = soma / a.size
    println("""
        Menor temperatura em A: ${menor}ºC
        Maior temperatura em A: ${maior}ºC
        Media das temperaturas de A: ${media}ºC
    """.trimIndent())
}