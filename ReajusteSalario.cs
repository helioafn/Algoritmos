using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algoritmos
{
    internal class ReajusteSalario
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Insira o salario atual: ");
            double salarioAtual = Double.Parse(Console.ReadLine());
            Console.WriteLine("Insira o percentual de reajuste: ");
            double percentualReajuste = Double.Parse(Console.ReadLine());

            percentualReajuste /= 100;

            double novoSalario = salarioAtual + (salarioAtual * percentualReajuste);

            Console.WriteLine($"Salario atual: R${salarioAtual}. Novo salário: R${novoSalario}");
        }
    }
}
