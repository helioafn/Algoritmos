using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algoritmos.Matrizes
{
    // Criar uma matriz A de 10 elementos, ler 10 elementos e armazenar na matriz A.
    internal class ExercicioA
    {
        static void Main(string[] args)
        {
            int[] n = new int[10];

            for (int i = 0; i < n.Length; i++)
            {
                Console.WriteLine("Insira um numero: ");
                n[i] = int.Parse(Console.ReadLine());
            }

            for (int i = 0; i < n.Length; i++)
            {
                Console.WriteLine(n[i]);
            }
        }
    }
}
