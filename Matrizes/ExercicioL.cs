using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algoritmos.Matrizes
{
    // Ler uma matriz A de 10 numeros, gerar uma matriz B de mesma dimensão, onde cada elemento de B, é 
    // igual a metade exata de um elemento de A.
    internal class ExercicioL
    {
        static void Main(string[] args)
        {
            float[] a = new float[10];
            float[] b = new float[10];

            for (int i = 0; i < a.Length; i++)
            {
                Console.WriteLine("Insira um número na matriz A: ");
                a[i] = float.Parse(Console.ReadLine());
            }

            for (int i = 0; i < b.Length; i++)
            {
                b[i] = a[i] / 2;
            }

            Console.Write("Matriz A: ");
            foreach (var item in a) Console.Write(item + " ");
            Console.WriteLine();
            Console.Write("Matriz B: ");
            foreach (var item in b) Console.Write(item + " ");
        }
    }
}
