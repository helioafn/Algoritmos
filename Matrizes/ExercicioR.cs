using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algoritmos.Matrizes
{
    internal class ExercicioR
    {
        // Ler as matrizes A e B de 6 números inteiros, gerar duas matrizes C e D, de mesma dimensão de A e B.
        // Com a seguinte lei de formação: a matriz C recebe os elementos de índices ímpares de A e B,
        // enquanto D recebe os elementos de índice par de A e B.
        // No final imprima os elementos das matrizes C e D.
        static void Main(string[] args)
        {
            long[] a = new long[6];
            long[] b = new long[6];
            long[] c = new long[6];
            long[] d = new long[6];

            for (int i = 0; i < a.Length; i++)
            {
                Console.WriteLine("Insira um número inteiro na matriz A: ");
                a[i] = long.Parse(Console.ReadLine());
            }
            
            for (int i = 0; i < b.Length; i++)
            {
                Console.WriteLine("Insira um número inteiro na matriz B: ");
                b[i] = long.Parse(Console.ReadLine());
            }

            for (int i = 0; i < c.Length; i++)
            {
                bool testePar = i % 2 == 0;
                if (testePar)
                {
                    d[i] = a[i];
                    d[i + 1] = b[i];
                }
                else
                {
                    c[i - 1] = a[i];
                    c[i] = b[i];
                }
            }

            Console.Write("Matriz C: ");
            foreach (var item in c) Console.Write(item + " ");
            Console.WriteLine();
            Console.Write("Matriz D: ");
            foreach (var item in d) Console.Write(item + " ");
        }
    }
}
