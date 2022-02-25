using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algoritmos
{
    internal class SomatorioAteNegativo
    {
        static void Main(string[] args)
        {
            double entrada;
            double soma = 0;
            double media;
            int contagem = 0;

            do
            {
                Console.WriteLine("Insira um número positivo: ");
                entrada = double.Parse(Console.ReadLine());
                soma += entrada;
                contagem++;
            } while (!(entrada < 0));

            media = soma / contagem;
            Console.WriteLine($"O somatório dos números é: {soma}. A média desses números é: {media}");
        }
    }
}
