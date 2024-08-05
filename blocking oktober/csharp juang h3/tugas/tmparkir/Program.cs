using System;
namespace parkir {
    class program {
        static void Main(string[] args) {
            Console.WriteLine("Punya member? (ya/tidak)");
            string memIn = Console.ReadLine();

            bool memOut = memIn.ToLower() == "ya";
            Console.WriteLine("Lama parkir (jam): ");

            int harga = Convert.ToInt32(Console.ReadLine());
            int bayar = 3000;
            int hargaJ = 2000;
            int t = 0;
            if (harga <= 2) {
                t = bayar;
            } else {
                t = bayar + (harga - 2) * hargaJ;
            }
            if (memOut) {
                if (t < 30000) {
                    t = (int)(t * 0.95);
                } else {
                    t = (int)(t * 0.93);
                }
            }
            Console.WriteLine($"Total biaya parkirnya adalah: {t} rupiah.");
        }
    }
}