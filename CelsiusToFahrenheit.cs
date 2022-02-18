using System;

namespace Algoritmos
{
    internal class CelsiusToFahrenheit
    {
        static void Main(string[] args)
        {
            //Console.WriteLine("Insira a temperatura em ºC");
            //double celsius = Double.Parse(Console.ReadLine());
            //Console.WriteLine(CelToFahrenheit(celsius));

            Console.WriteLine("Insira a temperatura em ºF: ");
            double fahrenheit = Double.Parse(Console.ReadLine());
            Console.WriteLine($"{fahrenheit}ºF = {FToCelsius(fahrenheit)}ºC");
        }

        static double CelToFahrenheit(double c)
        {
            // Recebe uma temperatura Cº e retorna a conversão em ºF
            return ((c * 9) / 5) + 32;
        }

        static double FToCelsius(double f)
        {
            // Recebe uma temperatura Fº e retorna a conversão em ºC
            return ((f - 32) * 5) / 9;
        }
    }
}
