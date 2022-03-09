using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algoritmos.Matrizes
{
    internal class ExercicioT
    {
        // Criar e ler duas matrizes A e B de tamanho 10 e valores numéricos.
        // Seguindo as seguintes regras, a matriz A só aceita valores divisíveis por 2 e 3.
        // A matriz B só aceita valores divisíveis por 5.
        // Gerar uma matriz C com a junção dos elementos de A e B, e imprimir os elementos da matriz C no final.
        static void Main(string[] args)
        {
            int i = 0;
            double n;
            bool teste1, teste2;
            double[] a = new double[10];
            double[] b = new double[10];
            double[] c = new double[a.Length + b.Length];

            while (i < a.Length)
            {
                do
                {
                    Console.WriteLine($"Insira um valor divisível por 2 e 3 [{i + 1} de {a.Length}]");
                    n = double.Parse(Console.ReadLine());
                    teste1 = n % 2 == 0;
                    teste2 = n % 3 == 0;
                } while (!(teste1 && teste2));

                a[i] = n;
                i++;
            }
            i = 0;

            while (i < b.Length)
            {
                do
                {
                    Console.WriteLine($"Insira um valor divisível por 5 [{i + 1} de {b.Length}]: ");
                    n = double.Parse(Console.ReadLine());
                    teste1 = n % 5 == 0;
                } while (!teste1);

                b[i] = n;
                i++;
            }
            
            for (int j = 0; j < a.Length; j++)
            {
                c[j] = a[j];
            }

            i = b.Length;

            for (int j = 0; j < b.Length; j++)
            {
                c[i + j] = b[j];
            }

            Console.Write("Matriz C: ");
            foreach (var item in c) Console.Write(item + " ");
        }
    }
}
