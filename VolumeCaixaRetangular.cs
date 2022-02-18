using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algoritmos
{
    internal class VolumeCaixaRetangular
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Insira o comprimento da caixa: ");
            double comprimento = Double.Parse(Console.ReadLine());
            Console.WriteLine("Insira a largura da caixa: ");
            double largura = Double.Parse(Console.ReadLine());
            Console.WriteLine("Insira a altura da caixa: ");
            double altura = Double.Parse(Console.ReadLine());

            double volume = comprimento * largura * altura;

            Console.WriteLine($"O volume da caixa é: {volume}");

        }
    }
}
