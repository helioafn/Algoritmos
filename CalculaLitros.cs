using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algoritmos
{
    internal class CalculaLitros
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Insira o tempo gasto na viagem (horas): ");
            double tempo = Double.Parse(Console.ReadLine());
            Console.WriteLine("Insira a velocidade média da viagem: ");
            double velocidadeMedia = Double.Parse(Console.ReadLine());

            
            double distancia = tempo * velocidadeMedia;
            double litros = distancia / 12; // O carro faz 12 km/L

            Console.WriteLine($"A velocidade media da viagem foi: {velocidadeMedia} km/h" + "\n" +
                $"O tempo gasto na viagem foi: {tempo} horas " + "\n" +
                $"A distância da viagem foi: {distancia} km " + "\n" +
                $"Foram gastos {litros} litros de combustível nesta viagem");

        }
    }
}
