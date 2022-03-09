using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algoritmos.Matrizes
{
    // Ler três matrizes A,B,C de tamanho 5 de números. Gerar uma nova matriz D com o total de elementos
    // de A+B+C.
    internal class ExercicioI
    {
        static void Main(string[] args)
        {
            float[] a = new float[5];
            float[] b = new float[5];
            float[] c = new float[5];
            float[] d = new float[a.Length + b.Length + c.Length];
            int j = 0;
            for (int i = 0; i < a.Length; i++)
            {
                Console.WriteLine("Insira um numero na Matriz A: ");
                a[i] = float.Parse(Console.ReadLine());
            }
            
            for (int i = 0; i < b.Length; i++)
            {
                Console.WriteLine("Insira um numero na Matriz B: ");
                b[i] = float.Parse(Console.ReadLine());
            }
            
            for (int i = 0; i < c.Length; i++)
            {
                Console.WriteLine("Insira um numero na Matriz C: ");
                c[i] = float.Parse(Console.ReadLine());
            }

            for (int i = 0; i < a.Length; i++)
            {
                d[j] = a[i];
                j++;
            }

            for (int i = 0; i < b.Length; i++)
            {
                d[j] = b[i];
                j++;
            }

            for (int i = 0; i < c.Length; i++)
            {
                d[j] = c[i];
                j++;
            }

            Console.Write("Matriz D: ");
            foreach (var item in d) Console.Write(item + " ");
        }
    }
}
