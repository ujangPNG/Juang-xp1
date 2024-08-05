using System;

public class Program
{
    public static void Main(string[] args)
    {
        float panjangAlas = 8;
        float panjangSisiAtas = 4;
        float tinggi = 5;
        float sisiMiring1 = 6;
        float sisiMiring2 = 7;


        float luasTrapesium = ((panjangAlas + panjangSisiAtas) / 2) * tinggi;
        float kelilingTrapesium = panjangAlas + panjangSisiAtas + sisiMiring1 + sisiMiring2;

        Console.WriteLine("Panjang Alas Trapesium " + panjangAlas + " cm");
        Console.WriteLine("Panjang Sisi Atas Trapesium " + panjangSisiAtas + " cm");
        Console.WriteLine("Tinggi Trapesium " + tinggi + " cm");
        Console.WriteLine("Luas Trapesium " + luasTrapesium + " cm2");
        Console.WriteLine("Keliling Trapesium " + kelilingTrapesium + " cm");
    }
}
