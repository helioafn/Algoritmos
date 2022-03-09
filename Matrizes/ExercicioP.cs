using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algoritmos.Matrizes
{
    // Ler uma matriz A de 12 numeros inteiros, gerar uma matriz B com a seguinte lei de formação
    // Se o elemento de A for par adicione-o a B, se não multiplique-o por 2 e adicione-o a B.
    // No final imprima os elementos da matriz B.
    internal class ExercicioP
    {
        static void Main(string[] args)
        {
            long[] a = new long[12]; 
            long[] b = new long[12]; 

            for (int i = 0; i < a.Length; i++)
            {
                Console.WriteLine("Insira um numero na matriz A: ");
                a[i] = long.Parse(Console.ReadLine());
            }

            for (int i = 0; i < b.Length; i++)
            {
                bool testePar = i % 2 == 0;
                if (testePar)
                {
                    b[i] = a[i];
                }
                else 
                {
                    b[i] = a[i] * 2;
                }
            }

            Console.Write("Matriz B: ");
            foreach (var item in b) Console.Write(item + " ");
        }
    }
}
