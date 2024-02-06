package capitulo4

import kotlin.math.sqrt
import kotlin.system.exitProcess

/*
    Efetuar a leitura de três valores numéricos (a,b,c) e processar o
    cálculo da equação completa do segundo grau, utilizando a fórmula de Bhaskara
    (considerar para a solução do problema todas as possíveis condições para delta:
    delta < 0 - não há solução real, delta > 0 - há duas soluções reais e diferentes e
    delta == 0 - há apenas uma solução real). Lembre-se de que é completa a equação de
    segundo grau que possui todos os coeficientes a, b e c diferentes de zero.
    O programa deve apresentar respostas para todas as condições estabelecidas para delta.
*/
fun main() {
    print("Insira o valor do coeficiente A: ")
    val a = readln().toDouble()
    print("Insira o valor do coeficiente B: ")
    val b = readln().toDouble()
    print("Insira o valor do coeficiente C: ")
    val c = readln().toDouble()
    val delta = (b * b) - 4.0 * a * c

    if (a == 0.0 || b == 0.0 || c == 0.0) {
        println("Não é possível calcular as raízes, um dos coeficientes inseridos é zero.")
        exitProcess(0)
    }

    if (delta >= 0) {
        val x1 = (-b + sqrt(delta) / (2.0 * a))
        val x2 = (-b - sqrt(delta) / (2.0 * a))
        println("Os valores das raizes são: $x1, $x2")
    } else {
        println("Não há soluções nos números reais.")
        exitProcess(0)
    }
}
