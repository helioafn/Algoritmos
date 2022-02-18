using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algoritmos
{
    internal class Eleicoes
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Votos do candidato A: ");
            int candidatoA = int.Parse(Console.ReadLine());
            Console.WriteLine("Votos do candidato B: ");
            int candidatoB = int.Parse(Console.ReadLine());
            Console.WriteLine("Votos do candidato C: ");
            int candidatoC = int.Parse(Console.ReadLine());
            Console.WriteLine("Insira a quantidade de votos brancos");
            int votosBrancos = int.Parse(Console.ReadLine());
            Console.WriteLine("Insira a quantidade de votos nulos: ");
            int votosNulos = int.Parse(Console.ReadLine());

            int totalEleitores = candidatoA + candidatoB + candidatoC + votosBrancos + votosNulos;
            int votosValidos = totalEleitores - (votosBrancos + votosNulos);

            float percentualA = ((float)candidatoA / totalEleitores) * 100;
            float percentualB = ((float)candidatoB / totalEleitores) * 100;
            float percentualC = ((float)candidatoC / totalEleitores) * 100;
            float percentualVotosBrancos = ((float)votosBrancos / totalEleitores) * 100;
            float percentualVotosNulos = ((float)votosNulos / totalEleitores) * 100;

            Console.WriteLine($"Total de eleitores: {totalEleitores}.");
            Console.WriteLine($"Percentual de votos do candidato A: {percentualA}%");
            Console.WriteLine($"Percentual de votos do candidato B: {percentualB}%");
            Console.WriteLine($"Percentual de votos do candidato C: {percentualC}%");
            Console.WriteLine($"Percentual de votos brancos: {percentualVotosBrancos}%");
            Console.WriteLine($"Percentual de votos nulos: {percentualVotosNulos}%");
        }
    }
}
