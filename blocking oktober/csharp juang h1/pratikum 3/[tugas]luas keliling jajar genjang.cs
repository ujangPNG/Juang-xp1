using System;

public class Program
{
    public static void Main(string[] args)
    {
        float alas = 5;
        float tinggi = 7;
        float sisiMiring = 8;

        float luasJajarGenjang = alas * tinggi;
        float kelilingJajarGenjang = 2 * (alas + sisiMiring);

        Console.WriteLine("Alas Jajar Genjang " + alas + " cm");
        Console.WriteLine("Tinggi Jajar Genjang " + tinggi + " cm");
        Console.WriteLine("Luas Jajar Genjang " + luasJajarGenjang + " cm2");
        Console.WriteLine("Keliling Jajar Genjang " + kelilingJajarGenjang + " cm");
    }
}
