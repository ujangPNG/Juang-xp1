using System;

namespace Myapk
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Masukkan NIS:");
            string nis = Console.ReadLine();
            
            Console.WriteLine("Masukkan Nama:");
            string nama = Console.ReadLine();
            
            Console.WriteLine("Masukkan Kelas:");
            string kelas = Console.ReadLine();
            
            Console.WriteLine("==============================");
            Console.WriteLine("NIS : " + nis);
            Console.WriteLine("Nama : " + nama);
            Console.WriteLine("Kelas: " + kelas);
        }
    }
}
