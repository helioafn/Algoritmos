using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algoritmos
{
    internal class Fibonacci
    {
        static void Main(string[] args)
        {
            int anterior = 0;
            int atual = 1;
            int proximo;
            int i = 0;
            Console.WriteLine("Insira até qual o termo deseja calcular: ");
            int n = int.Parse(Console.ReadLine());

            while (i < n)
            {
                proximo = anterior + atual;
                Console.WriteLine(proximo);
                anterior = atual;
                atual = proximo;
                i++;
            }

        }
    }
}
  