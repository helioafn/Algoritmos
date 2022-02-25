using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algoritmos
{
    internal class SomatorioFatorial
    {
        static void Main(string[] args)
        {
                        
        }

        static void SomatorioAteNegativo()
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
        static void SomatorioImpar10()
        {
            int fat = 1;
            int soma = 0;
            for (int i = 1; i <= 10; i += 2)
            {
                for (int j = 1; j <= i; j++)
                {
                    fat *= j;
                }
                soma += fat;
                Console.WriteLine($"Fatorial de {i} = {fat}");
                fat = 1;
            }

        }
        static void SomatorioFat()
        {
            int soma = 0;
            int fatorial = 1;
            int entrada;

            for (int i = 1; i <= 15; i++)
            {
                Console.WriteLine("Insira um número inteiro: ");
                entrada = int.Parse(Console.ReadLine());

                for (int j = 1; j <= entrada; j++)
                {
                    fatorial *= j;
                }
                soma += fatorial;
                fatorial = 1;
            }

            Console.WriteLine($"O somatorio dos quinze valores é: {soma}");
        }
    }
}
