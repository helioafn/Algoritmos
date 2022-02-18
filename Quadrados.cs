using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algoritmos
{
    internal class Quadrados
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Insira um inteiro A: ");
            int a = int.Parse(Console.ReadLine());
            Console.WriteLine("Insira um inteiro B: ");
            int b = int.Parse(Console.ReadLine());
            Console.WriteLine("Insira um inteiro C:");
            int c = int.Parse(Console.ReadLine());


            Console.WriteLine($"A² + B² + C² = {SomaTresQuadrados(a, b, c)}");
            Console.WriteLine($"(A + B + C)² = {QuadradoTresSomas(a, b, c)}");

        }

        static int SomaTresQuadrados(int a, int b, int c)
        {
            // Recebe a, b, c, eleva todos ao quadrado e retorna a soma deles.
            return (int)Math.Pow(a, 2) + (int)Math.Pow(b, 2) + (int)Math.Pow(c, 2);
        }

        static int QuadradoTresSomas(int a, int b, int c)
        {
            return (int)Math.Pow((a + b + c), 2);
        }
    }
}
