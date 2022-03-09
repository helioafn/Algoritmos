using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algoritmos.Matrizes
{
    // Ler 25 temperaturas Celsius, armazenar em uma matriz A, e gerar uma matriz B de mesma dimensão.
    // Onde cada elemento de B, é uma temperatura Celsius de A, convertida para Fahrenheit.
    // No final imprimir as matrizes A e B.
    internal class ExercicioO
    {
        static void Main(string[] args)
        {
            double[] a = new double[5];
            double[] b = new double[5];

            for (int i = 0; i < a.Length; i++)
            {
                Console.WriteLine($"Insira a temperatura número {i + 1}: ");
                a[i] = double.Parse(Console.ReadLine());
            }

            for (int i = 0; i < b.Length; i++)
            {
                b[i] = ((a[i] * 9) / 5) + 32;
            }

            Console.Write("Matriz de temperaturas Celsius: ");
            foreach (var item in a) Console.Write(item + "ºC ");
            Console.WriteLine();
            Console.Write("Matriz de temperaturas convertidas para Fahrenheit: ");
            foreach (var item in b) Console.Write(item + "ºF ");
        }
    }
}
