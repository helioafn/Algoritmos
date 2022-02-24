using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algoritmos
{
    internal class TabuleiroXadrez
    {
        static void Main(string[] args)
        {
            int s;
            int a = 1;
            for (int i = 1; i <= 64; i++)
            {
                Console.WriteLine(a);
                s = 2 * (int)Math.Pow(a, 2);
                a += s;
            }
            //Console.WriteLine($"O Somatório dos grãos é = {s}");
        }
    }
}
