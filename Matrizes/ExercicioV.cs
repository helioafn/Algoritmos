using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algoritmos.Matrizes
{
    internal class ExercicioV
    {
        // Ler uma matriz A de 30 valores inteiros, contar e exibir o número de elementos pares e ímpares.
        static void Main(string[] args)
        {
            int par = 0;
            int impar = 0;
            int[] a = new int[30];
            
            for (int i = 0; i < a.Length; i++)
            {
                Console.WriteLine($"Insira um número inteiro na matriz A [{i + 1} de {a.Length}]: ");
                a[i] = int.Parse(Console.ReadLine());
                bool teste = a[i] % 2 == 0;
                
                if (teste) par++;
                else impar++;
            }

            Console.WriteLine($"Número de elementos pares: {par}");
            Console.WriteLine($"Número de elementos ímpares: {impar}");
        }
    }
}
