package capitulo3

/*
    Elaborar um programa que leia uma medida em pés
    e apresente o seu valor convertido em metros, lembrando
    que um pé mede 0,3048 metro, ou seja,
    um pé é igual a 30,48 centímetros.
*/
fun main() {
    print("Insira a medida em pés: ")
    val pes = readln().toDouble()
    val PE_EM_METRO = 0.3048
    val metro = pes * PE_EM_METRO
    println("$pes pés são $metro metros")
}