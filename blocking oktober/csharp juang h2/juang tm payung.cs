using System;

namespace MyApk
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Hujan? (1: ya, 0: tidak): ");
            int hujan = Convert.ToInt32(Console.ReadLine());

            if (hujan == 1)
            {
                Console.WriteLine("Cari Payung");
                int cari = cekpayung();

                if (cari == 1)
                {
                    Console.WriteLine("Bawa payung");
                }
                else if (cari == 0)
                {
                    Console.WriteLine("Payung tidak tersedia");
                }
                else
                {
                    Console.WriteLine("Pilihan tidak valid");
                }
            }
            else if (hujan == 0)
            {
                Console.WriteLine("Tidak perlu bawa payung");
            }
            else
            {
                Console.WriteLine("Pilihan tidak valid");
            }
        }

        static int cekpayung()
        {
            Console.Write("Apakah payung ketemu? (1: ya, 0: tidak): ");
            return Convert.ToInt32(Console.ReadLine());
        }
    }
}
