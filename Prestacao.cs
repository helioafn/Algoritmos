using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algoritmos
{
    internal class Prestacao
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Insira o valor da prestação: ");
            double valorPrestacao = Double.Parse(Console.ReadLine());
            Console.WriteLine("Insira a taxa de juros: ");
            double taxaJuros = Double.Parse(Console.ReadLine());
            Console.WriteLine("Insira o tempo de atraso: ");
            int tempoAtraso = int.Parse(Console.ReadLine());

            double prestacaoAjustada = valorPrestacao + (valorPrestacao * (taxaJuros / 100) * tempoAtraso);

            Console.WriteLine($"Prestação inicial: R${valorPrestacao}. Prestação ajustada: R${prestacaoAjustada}");
        }
    }
}
