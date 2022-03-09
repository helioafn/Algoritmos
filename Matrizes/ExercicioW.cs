using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algoritmos.Matrizes
{
    internal class ExercicioW
    {
        // Ler duas matrizes A e B de 10 elementos do tipo inteiro.
        // Gerar uma nova matriz C de mesma dimensão de A e B.
        // Cada elemento de C é igual ao quadrado da soma de A e B. No final imprima os elementos da matriz C.
        static void Main(string[] args)
        {
            int[] a = new int[10];
            int[] b = new int[10];
            int[] c = new int[10];

            for (int i = 0; i < a.Length; i++)
            {
                Console.WriteLine($"Insira um número inteiro na matriz A [{i + 1} de {a.Length}]: ");
                a[i] = int.Parse(Console.ReadLine());
            }
            for (int i = 0; i < b.Length; i++)
            {
                Console.WriteLine($"Insira um número inteiro na matriz B [{i + 1} de {b.Length}]: ");
                b[i] = int.Parse(Console.ReadLine());
            }
            for (int i = 0; i < c.Length; i++)
            {
                c[i] = (int)Math.Pow((a[i] + b[i]), 2);
            }

            Console.Write("Matriz C: ");
            foreach (var item in c) Console.Write(item + " ");
        }
    }
}
