using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algoritmos.Matrizes
{
    // Criar uma matriz A de 20 elementos, ler 20 elementos e armazenar em A.
    // Criar uma matriz B de mesma dimensão de A, onde o primeiro elemento de B é o último de A 
    // e assim por diante.
    internal class ExercicioH
    {
        static void Main(string[] args)
        {
            float[] a = new float[20];
            float[] b = new float[20];
            int j = a.Length - 1;

            for (int i = 0; i < a.Length; i++)
            {
                Console.WriteLine("Insira um numero na matriz A: ");
                a[i] = float.Parse(Console.ReadLine());
            }

            for (int i = 0; i < b.Length; i++)
            {
                b[i] = a[j];
                j--;
            }

            Console.Write("Matriz A: ");
            foreach (var item in a) Console.Write(item + ",");
            Console.WriteLine();
            Console.Write("Matriz B: ");
            foreach (var item in b) Console.Write(item + ",");
        }
    }
}
