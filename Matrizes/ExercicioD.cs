using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algoritmos.Matrizes
{
    // Crie uma matriz A com 15 elementos, leia 15 elementos e os armazene em A.
    // Crie uma matriz B com a mesma dimensão de A, e cada elemento de B é igual ao elemento de A ao quadrado.
    internal class ExercicioD
    {
        static void Main(string[] args)
        {
            double[] a = new double[15];
            double[] b = new double[15];

            for (int i = 0; i < a.Length; i++)
            {
                Console.WriteLine("Insira um número: ");
                a[i] = double.Parse(Console.ReadLine());
            }
            Console.Write("Matriz A: ");
            for (int i = 0; i < a.Length; i++)
            {
                Console.Write(a[i] + ",");
            }
            Console.WriteLine();
            Console.Write("Matriz B: ");
            
            for (int i = 0; i < b.Length; i++)
            {
                b[i] = Math.Pow(a[i], 2);
                Console.Write(b[i] + ",");
            }
        }
    }
}
