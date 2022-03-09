using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algoritmos.Matrizes
{
    // Criar duas matrizes A e B de 20 elementos, ler 20 elementos em cada uma.
    // Gerar uma matriz C de mesma dimensão de A e B. Cada elemento de C é igual a subtração
    // do elemento de A pelo elemento de B (a[i] - b[i]).
    internal class ExercicioC
    {
        static void Main(string[] args)
        {
            double[] a = new double[20];
            double[] b = new double[20];
            double[] c = new double[20];

            for (int i = 0; i < a.Length; i++)
            {
                Console.WriteLine("Insira um número: ");
                a[i] = double.Parse(Console.ReadLine());
            }

            for (int i = 0; i < b.Length; i++)
            {
                Console.WriteLine("Insira um número: ");
                b[i] = double.Parse(Console.ReadLine());
            }

            for (int i = 0; i < c.Length; i++)
            {
                c[i] = a[i] - b[i];
                Console.WriteLine(c[i]);
            }
        }
    }
}
