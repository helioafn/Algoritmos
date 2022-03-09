using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algoritmos.Matrizes
{
    // Ler um valor x qualquer, gerar uma matriz A com o resultado da tabuada de 1 até 10.
    // No final imprimir os valores da matriz A.
    internal class ExercicioM
    {
        static void Main(string[] args)
        {
            long[] a = new long[10];
            int j = 1;

            Console.WriteLine("Insira um numero x: ");
            long x = long.Parse(Console.ReadLine());

            for (int i = 0; i < a.Length; i++)
            {
                a[i] = x * j;
                Console.WriteLine($"{x} x {j} = {a[i]}");
                j++;
            }


        }    
    }
}
