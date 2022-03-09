using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algoritmos.Matrizes
{
    // Criar uma matriz A de 10 elementos, ler 10 numeros, armazenar em A.
    // Criar uma matriz B de mesma dimensão da matriz A, armazenar em B, cada elemento de A multiplicado por 3.
    internal class ExercicioB
    {
        static void Main(string[] args)
        {
            int[] a = new int[8];
            int[] b = new int[8];
            for (int i = 0; i < a.Length; i++)
            {
                Console.WriteLine("Insira um numero: ");
                a[i] = int.Parse(Console.ReadLine());
            }

            for (int i = 0; i < b.Length; i++)
            {
                b[i] = a[i] * 3;
                Console.WriteLine(b[i]);
            }
        }
    }
}
