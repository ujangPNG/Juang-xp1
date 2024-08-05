using System;

public class Program
{
    public static void Main(string[] args)
    {
        float jari = 7;
        float pi = 3.14f;

        float luasLingkaran = pi * jari * jari;
        float kelilingLingkaran = 2 * pi * jari;

        Console.WriteLine("Jari-jari Lingkaran adalah " + jari + " cm");
        Console.WriteLine("Luas Lingkaran adalah " + luasLingkaran + " cm^2");
        Console.WriteLine("Keliling Lingkaran adalah " + kelilingLingkaran + " cm");
    }
}
