using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algoritmos.Matrizes
{
    // Ler quinze numeros inteiros positivos, armazenar em uma matriz A, criar uma Matriz B de mesma dimensão
    // da matriz A e calcular o fatorial de cada um dos elementos da matriz A e armazenar na matriz B.
    internal class ExercicioE
    {
        static void Main(string[] args)
        {
            ulong[] a = new ulong[15];
            ulong[] b = new ulong[15];

            for (int i = 0; i < a.Length; i++)
            {
                Console.WriteLine("Insira um número inteiro positivo: ");
                a[i] = ulong.Parse(Console.ReadLine());
            }

            for (int i = 0; i < b.Length; i++)
            {
                b[i] = 1;
                for (ulong j = 1; j <= a[i]; j++)
                {
                    b[i] *= j;
                }
            }
            Console.Write("Matriz A: ");
            foreach (var item in a) Console.Write(item + ",");
            Console.Write("Matriz B: ");
            foreach (var item in b) Console.Write(item + ",");
        }
    }
}
