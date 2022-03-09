using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algoritmos.Matrizes
{
    // Criar e ler duas matrizes A e B com 6 elementos de quaisquer valores númericos.
    // Na matriz A somente aceitar entradas de valores pares, caso não seja inserido um valor par,
    // pedir para o usuário inserir novamente um valor.
    // Na matriz B somente aceitar entradas de valores ímpares, caso não seja inserido um valor ímpar,
    // pedir para o usuário inserir novamente um valor.
    // Gerar uma matriz C com a junção dos elementos de A e C, no final imprimir os elementos da matriz C.
    internal class ExercicioS
    {
        static void Main(string[] args)
        {
            int i = 0;
            double n;
            bool teste;
            double[] a = new double[6];
            double[] b = new double[6];
            double[] c = new double[a.Length + b.Length];

            while (i < a.Length)
            {
                do
                {
                    Console.WriteLine($"Insira um valor par na matriz A [{i + 1} de {a.Length}]: ");
                    n = double.Parse(Console.ReadLine());
                    teste = n % 2 == 0;
                } while (!teste);

                a[i] = n;
                i++;
            }

            i = 0;

            while (i < b.Length)
            {
                do
                {
                    Console.WriteLine($"Insira um valor ímpar na matriz B [{i + 1} de {b.Length}]: ");
                    n = double.Parse(Console.ReadLine());
                    teste = n % 2 != 0;
                } while (!teste);

                b[i] = n;
                i++;
            }
            
            i = 0;

            for (int cont = 0; cont < a.Length; cont++)
            {
                c[i] = a[cont];
                i++;
            }
            
            for (int k = 0; k < b.Length; k++)
            {
                c[i] = b[k];
                i++;
            }

            Console.Write("Matriz C: ");
            foreach (var item in c) Console.Write(item + " ");
        }


    }
}
