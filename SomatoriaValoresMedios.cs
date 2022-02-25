using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algoritmos
{
    internal class SomatoriaValoresMedios
    {
        static void Main(string[] args)
        {
            int entrada;
            int soma = 0;
            double media;
            for (int i = 1; i <= 10; i++)
            {
                Console.WriteLine("Insira um inteiro: ");
                entrada = int.Parse(Console.ReadLine());
                soma += entrada;
            }
            media = soma / 10.0;
            Console.WriteLine($"O somatório dos números inseridos é: {soma} e a média desses números é: {media}");

        }
    }
}
