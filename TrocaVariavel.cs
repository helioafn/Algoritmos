using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algoritmos
{
    internal class TrocaVariavel
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Insira o valor de A: ");
            var a = Console.ReadLine();
            Console.WriteLine("Insira o valor de B: ");
            var b = Console.ReadLine();

            Console.WriteLine($"Valor inicial de A: {a}. Valor inicial de B: {b}.");
            var c = a;
            a = b;
            b = c;

            Console.WriteLine($"Valor final de A: {a}. Valor final de B: {b}");
        }
    }
}
