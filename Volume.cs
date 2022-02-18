using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algoritmos
{
    internal class Volume
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Insira o raio da lata de óleo: ");
            double raio = Double.Parse(Console.ReadLine());
            Console.WriteLine("Insira a altura da lata de óleo: ");
            double altura = Double.Parse(Console.ReadLine());


            Console.WriteLine($"O Volume da lata de óleo é {CalculoVolume(raio, altura)}");
        }

        static double CalculoVolume(double raio, double altura)
        {
            const double PI = 3.14159;
            return PI * Math.Pow(raio, 2) * altura;
        }
    }
}
