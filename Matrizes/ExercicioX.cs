using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algoritmos.Matrizes
{
    // Ler uma matriz A de 6 elementos do tipo real.
    // Criar uma matriz B de mesma dimensão com a seguinte lei de formação:
    // Se o índice de A for par, o elemento de B deve receber o elemento do índice ímpar de A.
    // Caso contrário, o elemento de B deve receber o elemento do índice par de A.
    // No final imprima os elementos da matriz B.
    internal class ExercicioX
    {
        static void Main(string[] args)
        {
            double[] a = new double[6];
            double[] b = new double[6];

            for (int i = 0; i < a.Length; i++)
            {
                Console.WriteLine($"Insira um número qualquer na matriz A [{i + 1} de {a.Length}]: ");
                a[i] = double.Parse(Console.ReadLine());
            }
            for (int i = 0; i < b.Length; i++)
            {
                bool teste = i % 2 == 0;
                if (teste) 
                {
                    b[i] = a[i+1];
                    
                }
                else
                {
                    b[i] = a[i-1];
                }
            }

            Console.Write("Matriz B: ");
            foreach (var item in b) Console.Write(item + " ");

        }
    }
}
