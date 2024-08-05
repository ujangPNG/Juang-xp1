using System;

namespace Myapk
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("PENGHITUNG PERSEGI PANJANG");

            Console.Write("Masukan Panjang: ");
            int panjang = Convert.ToInt32(Console.ReadLine());

            Console.Write("Masukan Lebar: ");
            int lebar = Convert.ToInt32(Console.ReadLine());

            int hasil = panjang * lebar;
            Console.WriteLine("Hasil = " + hasil);
        }
    }
}