package capitulo5

/*
    Elaborar um programa que apresente os resultados das potências do valor de base 3, elevado
    a um expoente que varie do valor 0 até o valor 15. O programa deve apresentar os valores 1,3,9,27,...,
    14.348.907. Sugestão: leve em consideração as definições matemáticas do cálculo de potência, em que
    qualquer valor numérico diferente de zero elevado a zero é 1, e todo valor numérico elevado a 1 é ele
    próprio. Não use o operador aritmético de exponenciação, resolva usando a técnica de laço.
*/
fun main() {
    var baseExpoente: Int
    for (i in 0..15) {
        baseExpoente = 3
        if (i == 0) {
            println("1")
            continue
        }
        if (i == 1) {
            println("3")
            continue
        }
        for (j in 0..<i-1) baseExpoente *= 3
        println(baseExpoente)
    }

}
