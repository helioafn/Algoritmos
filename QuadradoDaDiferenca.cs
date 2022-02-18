using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algoritmos
{
    internal class QuadradoDaDiferenca
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Insira um inteiro A: ");
            int a = int.Parse(Console.ReadLine());
            Console.WriteLine("Insira um inteiro B: ");
            int b = int.Parse(Console.ReadLine());

            Console.WriteLine(Math.Pow((a - b), 2));

            
        }
    }
}
