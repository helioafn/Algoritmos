using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algoritmos.Matrizes
{
    // Ler uma matriz A de 20 numeros, gerar uma matriz B onde cada elemento de b é o somatório de
    // 1 até o elemento de a, no final, imprima os elementos da matriz B.
    internal class ExercicioJ
    {
        static void Main(string[] args)
        {
            float[] a = new float[5];
            float[] b = new float[5];
            float soma = 0;

            for (int i = 0; i < a.Length; i++)
            {
                Console.WriteLine("Insira um numero na matriz A: ");
                a[i] = float.Parse(Console.ReadLine());
            }

            for (int i = 0; i < b.Length; i++)
            {
                for (int j = 1; j <= a[i]; j++)
                {
                    soma += j;
                }
                b[i] = soma;
                soma = 0;
            }

            Console.Write("Matriz B: ");
            foreach (var item in b) Console.Write(item + " ");
        }
    }
}
