using System;
namespace Myapk
{
    class Program 
    {
        static void Main(string[]args)
        {

            Console.WriteLine("\n===APLIKASI PENGHITUNG VOLUME===");

            Console.Write("\nPilih bangun ruang (kubus: 1, balok: 2, tabung: 3): ");
            int bangunruang = Convert.ToInt32(Console.ReadLine());

            if (bangunruang ==1 )
            {
                Console.WriteLine("\nPenghitung Kubus");
                Console.Write("Masukkan panjang sisi: ");
                int sisiK=Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Volume kubus adalah: "+ sisiK*sisiK*sisiK);

            }

            if (bangunruang ==2 )
            {
                Console.WriteLine("\nPenghitung Balok");
                Console.Write("Masukkan panjang: ");
                int panjangB=Convert.ToInt32(Console.ReadLine());

                Console.Write("Masukkan lebar: ");
                int lebarB=Convert.ToInt32(Console.ReadLine());

                Console.Write("Masukkan tinggi: ");
                int tinggiB=Convert.ToInt32(Console.ReadLine());

                Console.WriteLine("Volume Balok Adalah: "+panjangB*lebarB*tinggiB);
            }

            if (bangunruang ==3 )
            {
                Console.WriteLine("\nPenghitung Tabung");
                Console.Write("Masukkan jari-jari alas: ");
                int jariT=Convert.ToInt32(Console.ReadLine());

                Console.Write("Masukkan tinggi: ");
                int tinggiT=Convert.ToInt32(Console.ReadLine());

                Console.WriteLine("Volume tabung adalah "+ 22/7 * jariT*jariT * tinggiT);                
            }
        }
    }
}