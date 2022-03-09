using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algoritmos.Matrizes
{
    // Ler uma matriz A de 20 elementos, em seguida ler uma matriz B de 30 elementos.
    // E gerar uma matriz C com a junção dos elementos de A e B, totalizando 50 elementos.
    class ExercicioF
    {
        static void Main(string[] args)
        {
            double[] a = new double[20];
            double[] b = new double[30];
            double[] c = new double[50];

            for (int i = 0; i < a.Length; i++)
            {
                Console.WriteLine("Insira um numero na Matriz A: ");
                a[i] = double.Parse(Console.ReadLine());
            }

            for (int i = 0; i < b.Length; i++)
            {
                Console.WriteLine("Insira um número na Matriz B: ");
                b[i] = double.Parse(Console.ReadLine());
            }

            for (int i = 0; i < a.Length; i++)
            {
                c[i] = a[i];
            }

            for (int i = 0; i < b.Length; i++)
            {
                c[(a.Length - 1) + (i+1)] = b[i];
            }

            Console.Write("Matriz C: ");
            foreach (var item in c) Console.Write(item + ",");

        }
    }
}
