using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algoritmos.Matrizes
{
    // Ler uma matriz A de 20 temperaturas em Celsius (reais), e exibir a menor, a maior e a média
    // das temperaturas.
    internal class ExercicioN
    {
        static void Main(string[] args)
        {
            double[] a = new double[20];
            double menor, maior, media;
            double soma = 0;

            for (int i = 0; i < a.Length; i++)
            {
                Console.WriteLine($"Insira a temperatura (ºC) {i+1}: ");
                a[i] = double.Parse(Console.ReadLine());
                soma += a[i];
            }

            menor = a[0];
            maior = a[0];

            for (int i = 0; i < a.Length; i++)
            {
                if (a[i] < menor) menor = a[i];
            }

            for (int i = 0; i < a.Length; i++)
            {
                if (a[i] > maior) maior = a[i];
            }

            media = soma / a.Length;
            Console.WriteLine($"Menor temperatura em A: {menor}. " +
                $"Maior temperatura em A: {maior}. " +
                $"Media das temperaturas de A: {media}.");
        }
    }
}
