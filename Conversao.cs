using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algoritmos
{
    internal class Conversao
    {
        static void Main(string[] args)
        {
            //Console.WriteLine("Insira a sua quantidade de dólares: ");
            //double qtDolares = Double.Parse(Console.ReadLine());
            //Console.WriteLine("Insira a cotação do dólar: ");
            //double cotacaoDolar = Double.Parse(Console.ReadLine());

            //Console.WriteLine($"${qtDolares} convertido para reais são R${ConversaoParaReal(qtDolares, cotacaoDolar)}");

            Console.WriteLine("Insira a quantidade de reais: ");
            double qtReais = Double.Parse(Console.ReadLine());
            Console.WriteLine("Insira a cotacao do dolar: ");
            double cotacao = Double.Parse(Console.ReadLine());

            Console.WriteLine($"R${qtReais} convertido para dolares são: ${ConversaoParaDolar(qtReais, cotacao)}");
        }

        static double ConversaoParaReal(double dolares, double cotacao)
        {
            // Recebe uma quantidade de dolares e a cotacao atual do dolar, e retorna o valor em reais.
            return dolares * cotacao;
        }

        static double ConversaoParaDolar(double reais, double cotacao)
        {
            // Recebe uma quantidade de reais e a cotacao atual do dolar, e retorna o valor em dolares.
            return reais / cotacao;
        }
    }
}
