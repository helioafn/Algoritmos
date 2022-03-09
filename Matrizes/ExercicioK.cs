using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algoritmos.Matrizes
{
    // Ler uma matriz A de 10 números inteiros positivos, gerar uma matriz B de mesma dimensão,
    // onde cada elemento de B é um elemento de A negativo.
    internal class ExercicioK
    {
        static void Main(string[] args)
        {
            int[] a = new int[10];
            int[] b = new int[10];

            for (int i = 0; i < a.Length; i++)
            {
                Console.WriteLine("Insira um número inteiro positivo na matriz A: ");
                a[i] = int.Parse(Console.ReadLine());
            }

            for (int i = 0; i < b.Length; i++)
            {
                b[i] = a[i] * -1;
            }
            
            Console.Write("Matriz B: ");
            foreach (var item in b) Console.Write(item + " ");
        }
    }
}
