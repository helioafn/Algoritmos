using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algoritmos.Matrizes
{
    // Ler uma matriz A de 15 números, gerar uma matriz B de mesma dimensão, com a seguinte lei de formação:
    // Se o indice do elemento for par, divida o elemento por dois e adicione a B, caso contrário multiplique-o por 1.5
    // e adicione-o a B. No final imprima os elementos da matriz B.
    internal class ExercicioQ
    {
        static void Main(string[] args)
        {
            double[] a = new double[15];
            double[] b = new double[15];
            
            for (int i = 0; i < a.Length; i++)
            {
                Console.WriteLine("Insira um número qualquer na matriz A: ");
                a[i] = double.Parse(Console.ReadLine());
            }

            for (int i = 0; i < b.Length; i++)
            {
                bool testePar = i % 2 == 0;
                if (testePar)
                {
                    b[i] = a[i] / 2;
                }
                else
                {
                    b[i] = a[i] * 1.5;
                }
            }

            Console.Write("Matriz B: ");
            foreach (var item in b) Console.Write(item + " ");
        }

    }
}
